package co.edu.unbosque.controller;

import co.edu.unbosque.entity.Usuario;
import co.edu.unbosque.repository.UsuarioRepository;
import co.edu.unbosque.service.api.UsuarioServiceAPI;
import co.edu.unbosque.service.impl.UsuarioServiceImpl;
import co.edu.unbosque.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8181",maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    private final UsuarioServiceImpl usuarioServiceImpl;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioServiceAPI usuarioServiceAPI;

	UsuarioRestController(UsuarioRepository usuarioRepository, UsuarioServiceImpl usuarioServiceImpl) {
		this.usuarioRepository = usuarioRepository;
		this.usuarioServiceImpl = usuarioServiceImpl;
	}

	@GetMapping(value = "/getAll")
	// ResponseEntity List<Usuario> getAll(){
	public List<Usuario> getAll() {
		return usuarioServiceAPI.getAll();
	}

	@PostMapping(value = "/saveUsuario")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
		if(usuario==null) {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.FORBIDDEN); // 200
		}
		usuario = new Usuario(usuario.getLogin(), usuario.getClave(), usuario.getFchaUltmaClave(),
				usuario.getIntentos(), usuario.getIdTipoUsuario(), usuario.getCorreoUsuario(), usuario.getEstado());
		Usuario obj = usuarioServiceAPI.save(usuario);
		return new ResponseEntity<Usuario>(obj, HttpStatus.OK); 
	}

	@GetMapping(value = "/findRecord/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) throws ResourceNotFoundException {
		Usuario usuario = usuarioServiceAPI.get(id);
		if (usuario == null) {
			new ResourceNotFoundException("Record not found for <Usuario>" + id);
		}
		return ResponseEntity.ok().body(usuario);
	}

	@DeleteMapping(value = "/deleteUsuario/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable Long id) {
		Usuario usuario = usuarioServiceAPI.get(id);
		if (usuario != null) {
			usuarioServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
}