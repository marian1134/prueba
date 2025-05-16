package co.edu.unbosque.controller;

import co.edu.unbosque.entity.Cliente;
import co.edu.unbosque.repository.ClienteRepository;
import co.edu.unbosque.service.api.ClienteServiceAPI;
import co.edu.unbosque.service.impl.ClienteServiceImpl;
import co.edu.unbosque.utils.HashGenerator;
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
@RequestMapping("/cliente")
public class ClienteRestController {

	private final ClienteServiceImpl clienteServiceImpl;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ClienteServiceAPI ClienteServiceAPI;

	ClienteRestController(ClienteRepository ClienteRepository, ClienteServiceImpl ClienteServiceImpl) {
		this.clienteRepository = ClienteRepository;
		this.clienteServiceImpl = ClienteServiceImpl;
	}

	@GetMapping(value = "/getAll")
	// ResponseEntity List<Cliente> getAll(){
	public List<Cliente> getAll() {
		return ClienteServiceAPI.getAll();
	}

	@PostMapping(value = "/saveCliente")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
		if (cliente == null) {
			return new ResponseEntity<Cliente>(cliente, HttpStatus.FORBIDDEN); // 200
		}
		cliente.setContrasenia(HashGenerator.generarHash(cliente.getContrasenia()));
		cliente = new Cliente(cliente.getCorreoCliente(), cliente.getDireccionCliente(), cliente.getEstado(),
				cliente.getNombreCliente(), cliente.getTelefono(), cliente.getContrasenia(),
				cliente.getHistorialVentas());
		Cliente obj = ClienteServiceAPI.save(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/findRecord/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) throws ResourceNotFoundException {
		Cliente Cliente = ClienteServiceAPI.get(id);
		if (Cliente == null) {
			new ResourceNotFoundException("Record not found for <Cliente>" + id);
		}
		return ResponseEntity.ok().body(Cliente);
	}

	@DeleteMapping(value = "/deleteCliente/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable Long id) {
		Cliente Cliente = ClienteServiceAPI.get(id);
		if (Cliente != null) {
			ClienteServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Cliente>(Cliente, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Cliente>(Cliente, HttpStatus.OK);
	}
}