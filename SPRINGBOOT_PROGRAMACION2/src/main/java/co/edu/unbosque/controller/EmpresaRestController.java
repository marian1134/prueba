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
import co.edu.unbosque.entity.Empresa;
import co.edu.unbosque.repository.EmpresaRepository;
import co.edu.unbosque.service.api.EmpresaServiceAPI;
import co.edu.unbosque.service.impl.EmpresaServiceImpl;
import co.edu.unbosque.utils.CorreoUtil;
import co.edu.unbosque.utils.ResourceNotFoundException;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Empresa")
public class EmpresaRestController {

	private final EmpresaServiceImpl empresaServiceImpl;

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private EmpresaServiceAPI empresaServiceAPI;

	EmpresaRestController(EmpresaRepository empresaRepository, EmpresaServiceImpl empresaServiceImpl) {
		this.empresaRepository = empresaRepository;
		this.empresaServiceImpl = empresaServiceImpl;
	}

	@PostMapping(value = "/saveEmpresa")
	public ResponseEntity<?> save(@RequestBody Empresa empresa) {
		if (empresa == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		empresa = new Empresa(empresa.getCorreoElectronico(), empresa.getDireccion(), empresa.getEstado(),
				empresa.getRazonSocial(), empresa.getTelefono());

		Empresa obj = empresaServiceAPI.save(empresa);

		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/getAll")
	public List<?> getAll() {
		return empresaServiceAPI.getAll();
	}

	@GetMapping(value = "/findEmpresa/{id}")
	public ResponseEntity<?> getUsuarioById(@PathVariable Long id) throws ResourceNotFoundException {
		Empresa Empresa = empresaServiceAPI.get(id);
		if (Empresa == null) {
			new ResourceNotFoundException("Record not found for <Usuario>" + id);
		}
		return ResponseEntity.ok().body(Empresa);
	}

	@DeleteMapping(value = "/deleteUsuario/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Empresa Empresa = empresaServiceAPI.get(id);
		if (Empresa != null) {
			empresaServiceAPI.delete(id);
		} else {
			return new ResponseEntity<>(Empresa, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(Empresa, HttpStatus.OK);
	}
}
