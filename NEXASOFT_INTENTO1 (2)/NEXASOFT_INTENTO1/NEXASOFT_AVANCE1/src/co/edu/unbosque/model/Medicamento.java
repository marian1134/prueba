package co.edu.unbosque.model;

public class Medicamento {
	
	//Atributos

	private String nombreMedicamento;
	private int codigo;
	private int cantidad;
	private int precio;
	
	//Constructor
	
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicamento(String nombreMedicamento, int codigo, int cantidad, int precio) {
		super();
		this.nombreMedicamento = nombreMedicamento;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
}
