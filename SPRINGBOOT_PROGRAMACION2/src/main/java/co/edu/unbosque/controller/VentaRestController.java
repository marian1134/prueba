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
import co.edu.unbosque.entity.Venta;
import co.edu.unbosque.repository.VentaRepository;
import co.edu.unbosque.service.api.VentaServiceAPI;
import co.edu.unbosque.service.impl.VentaServiceImpl;
import co.edu.unbosque.utils.CorreoUtil;
import co.edu.unbosque.utils.ResourceNotFoundException;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/venta")
public class VentaRestController {

	private final VentaServiceImpl ventaServiceImpl;

	@Autowired
	private VentaRepository ventaRepository;

	@Autowired
	private VentaServiceAPI ventaServiceAPI;

	@Autowired
	private CorreoUtil correos;

	VentaRestController(VentaRepository VentaRepository, VentaServiceImpl VentaServiceImpl) {
		this.ventaRepository = VentaRepository;
		this.ventaServiceImpl = VentaServiceImpl;
	}

	@PostMapping(value = "/saveVenta")
	public ResponseEntity<?> save(@RequestBody Venta venta) {
		if (venta == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		if (venta.getProductos().size() > 3) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		venta = new Venta(venta.getEstado(), venta.getFechaVenta(), venta.getUsernameCliente(),
				venta.getCorreoCliente(), venta.getValorDscto(), venta.getValorIva(), venta.getValorVenta(),
				venta.getProductos());
		correos.venta(venta);

		Venta obj = ventaServiceAPI.save(venta);

		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/getAll")
	public List<?> getAll() {
		return ventaServiceAPI.getAll();
	}

	@GetMapping(value = "/findVenta/{id}")
	public ResponseEntity<?> getUsuarioById(@PathVariable Long id) throws ResourceNotFoundException {
		Venta venta = ventaServiceAPI.get(id);
		if (venta == null) {
			new ResourceNotFoundException("Record not found for <Usuario>" + id);
		}
		return ResponseEntity.ok().body(venta);
	}

	@DeleteMapping(value = "/deleteUsuario/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Venta venta = ventaServiceAPI.get(id);
		if (venta != null) {
			ventaServiceAPI.delete(id);
		} else {
			return new ResponseEntity<>(venta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(venta, HttpStatus.OK);
	}
}
