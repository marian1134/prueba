package co.edu.unbosque.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "correo_cliente")
	private String correoCliente;

	@Column(name = "direccion_cliente")
	private String direccionCliente;

	private byte estado;

	@Column(name = "nombre_cliente")
	private String nombreCliente;

	private String telefono;

	private String contrasenia;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleVenta> historialVentas = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String correoCliente, String direccionCliente, byte estado, String nombreCliente, String telefono,
			String contrasenia, List<DetalleVenta> historialVentas) {
		super();
		this.correoCliente = correoCliente;
		this.direccionCliente = direccionCliente;
		this.estado = estado;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
		this.historialVentas = historialVentas;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public List<DetalleVenta> getHistorialVentas() {
		return historialVentas;
	}

	public void setHistorialVentas(List<DetalleVenta> historialVentas) {
		this.historialVentas = historialVentas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreoCliente() {
		return this.correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getDireccionCliente() {
		return this.direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}