package co.edu.unbosque.entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "correo_electronico")
	private String correoElectronico;

	private String direccion;

	private byte estado;

	@Column(name = "razon_social")
	private String razonSocial;

	private String telefono;

	public Empresa() {
	}

	public Empresa(String correoElectronico, String direccion, byte estado, String razonSocial, String telefono) {
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.estado = estado;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}