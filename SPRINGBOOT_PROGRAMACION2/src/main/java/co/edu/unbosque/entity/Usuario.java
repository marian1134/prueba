package co.edu.unbosque.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;

/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity // Indica que la clase es un objeto persistente
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	

	@Column(name = "login_usrio", unique = true)
	private String login;

	@Column(name = "clave_usrio")
	private String clave;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fcha_ultma_clave")
	private Date fchaUltmaClave;
	
	@Column(name = "intentos")
	private int intentos;

	@Column(name = "id_tipo_usuario")
	private String idTipoUsuario;

	@Column(name = "correo_usuario")
	private String correoUsuario;

	@Column(name = "estado")
	private byte estado;


	public Usuario() {
	}

	
	public Usuario( String login, String clave, Date fchaUltmaClave, int intentos, String idTipoUsuario,
			String correoUsuario, byte estado) {
		super();
		
		this.login = login;
		this.clave = clave;
		this.fchaUltmaClave = fchaUltmaClave;
		this.intentos = intentos;
		this.idTipoUsuario = idTipoUsuario;
		this.correoUsuario = correoUsuario;
		this.estado = estado;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreoUsuario() {
		return this.correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFchaUltmaClave() {
		return this.fchaUltmaClave;
	}

	public void setFchaUltmaClave(Date fchaUltmaClave) {
		this.fchaUltmaClave = fchaUltmaClave;
	}

	public String getIdTipoUsuario() {
		return this.idTipoUsuario;
	}

	public void setIdTipoUsuario(String idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public int getIntentos() {
		return this.intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}