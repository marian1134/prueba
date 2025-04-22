package co.edu.unbosque.model;

public class Funcionario {

	private String nombre;
	private long cedula;
	private String contraseña;
	private String correo;
	private int modulo;

	public Funcionario() {
	}
	

	public Funcionario(String nombre, long cedula, String contraseña, String correo, int modulo) {
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
