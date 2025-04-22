package co.edu.unbosque.model;

import java.io.Serializable;

public class FuncionarioDTO implements Serializable {
    private static final long serialVersionUID = 1L; // Es buena práctica agregar un serialVersionUID
    
    private String nombre;
	private long cedula;
	private String contraseña;
	private String correo;
	private int modulo;

	public FuncionarioDTO () {
	}
	

	public FuncionarioDTO (String nombre, long cedula, String contraseña, String correo, int modulo) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.contraseña = contraseña;
		this.correo = correo;
		this.modulo = modulo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getModulo() {
		return modulo;
	}

	public void setModulo(int modulo) {
		this.modulo = modulo;
	}

}
