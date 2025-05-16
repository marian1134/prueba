package co.edu.unbosque.controller;

import co.edu.unbosque.entity.TipoUsuario;
import co.edu.unbosque.repository.TipoUsuarioRepository;
import co.edu.unbosque.service.api.TipoUsuarioServiceAPI;
import co.edu.unbosque.service.impl.TipoUsuarioServiceImpl;
import co.edu.unbosque.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8181",maxAge = 3600)
@RestController
@RequestMapping("/TipoUsuario")
public class TipoUsuarioRestController {

	private final TipoUsuarioServiceImpl tipoUsuarioServiceImpl;

	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;

	@Autowired
	private TipoUsuarioServiceAPI TipoUsuarioServiceAPI;

	TipoUsuarioRestController(TipoUsuarioRepository TipoUsuarioRepository,
			TipoUsuarioServiceImpl TipoUsuarioServiceImpl) {
		this.tipoUsuarioRepository = TipoUsuarioRepository;
		this.tipoUsuarioServiceImpl = TipoUsuarioServiceImpl;
	}

	@GetMapping(value = "/getAll")
	// ResponseEntity List<TipoUsuario> getAll(){
	public List<TipoUsuario> getAll() {
		return TipoUsuarioServiceAPI.getAll();
	}

	@PostMapping(value = "/saveTipoUsuario")
	public ResponseEntity<TipoUsuario> save(@RequestBody TipoUsuario tipoUsuario) {
		if (tipoUsuario == null) {
			return new ResponseEntity<TipoUsuario>(tipoUsuario, HttpStatus.FORBIDDEN); // 200
		}
		tipoUsuario = new TipoUsuario(tipoUsuario.getDescripcion(), tipoUsuario.getEstado());
		TipoUsuario obj = TipoUsuarioServiceAPI.save(tipoUsuario);
		return new ResponseEntity<TipoUsuario>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/findRecord/{id}")
	public ResponseEntity<TipoUsuario> getTipoUsuarioById(@PathVariable Long id) throws ResourceNotFoundException {
		TipoUsuario TipoUsuario = TipoUsuarioServiceAPI.get(id);
		if (TipoUsuario == null) {
			new ResourceNotFoundException("Record not found for <TipoUsuario>" + id);
		}
		return ResponseEntity.ok().body(TipoUsuario);
	}

	@DeleteMapping(value = "/deleteTipoUsuario/{id}")
	public ResponseEntity<TipoUsuario> delete(@PathVariable Long id) {
		TipoUsuario TipoUsuario = TipoUsuarioServiceAPI.get(id);
		if (TipoUsuario != null) {
			TipoUsuarioServiceAPI.delete(id);
		} else {
			return new ResponseEntity<TipoUsuario>(TipoUsuario, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<TipoUsuario>(TipoUsuario, HttpStatus.OK);
	}
}