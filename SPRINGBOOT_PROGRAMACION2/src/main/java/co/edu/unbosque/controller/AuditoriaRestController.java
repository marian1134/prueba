package co.edu.unbosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.entity.Producto;
import co.edu.unbosque.entity.Usuario;
import co.edu.unbosque.entity.Auditoria;
import co.edu.unbosque.repository.AuditoriaRepository;
import co.edu.unbosque.service.api.AuditoriaServiceAPI;
import co.edu.unbosque.service.impl.AuditoriaServiceImpl;
import co.edu.unbosque.utils.CorreoUtil;
import co.edu.unbosque.utils.ResourceNotFoundException;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Auditoria")
public class AuditoriaRestController {

	private final AuditoriaServiceImpl auditoriaServiceImpl;

	@Autowired
	private AuditoriaRepository auditoriaRepository;

	@Autowired
	private AuditoriaServiceAPI auditoriaServiceAPI;

	AuditoriaRestController(AuditoriaRepository auditoriaRepository, AuditoriaServiceImpl auditoriaServiceImpl) {
		this.auditoriaRepository = auditoriaRepository;
		this.auditoriaServiceImpl = auditoriaServiceImpl;
	}

	@PostMapping(value = "/saveAuditoria")
	public ResponseEntity<?> save(@RequestBody Auditoria auditoria) {
		if (auditoria == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		auditoria = new Auditoria(auditoria.getAccionAudtria(), auditoria.getAddressAudtria(), auditoria.getComentarioAudtria(),
				auditoria.getFchaAudtria(), auditoria.getIdTabla(),auditoria.getTablaAccion(),auditoria.getUsrioAudtria());

		Auditoria obj = auditoriaServiceAPI.save(auditoria);

		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/getAll")
	public List<?> getAll() {
		return auditoriaServiceAPI.getAll();
	}

	@GetMapping(value = "/findAuditoria/{id}")
	public ResponseEntity<?> getUsuarioById(@PathVariable Long id) throws ResourceNotFoundException {
		Auditoria Auditoria = auditoriaServiceAPI.get(id);
		if (Auditoria == null) {
			new ResourceNotFoundException("Record not found for <Usuario>" + id);
		}
		return ResponseEntity.ok().body(Auditoria);
	}

	@DeleteMapping(value = "/deleteUsuario/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Auditoria Auditoria = auditoriaServiceAPI.get(id);
		if (Auditoria != null) {
			auditoriaServiceAPI.delete(id);
		} else {
			return new ResponseEntity<>(Auditoria, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(Auditoria, HttpStatus.OK);
	}
}
