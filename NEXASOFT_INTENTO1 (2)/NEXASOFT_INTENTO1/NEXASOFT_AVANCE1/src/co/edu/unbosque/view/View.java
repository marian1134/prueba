package co.edu.unbosque.view;

import java.util.ArrayList;

import co.edu.unbosque.model.MedicamentoDTO;

public class View {
	
	private VentanaInicio inicio;
	private VentanaGestionIngresoFuncionario gestionIngresoPaciente;
	private VentanaAgregarFuncionario agregarFuncionario;
	private VentanaActualizarFuncionario actualizarFuncionario;
	private VentanaBorrarFuncionario borrarFuncionario;
	private VentanaListarFuncionarios listarFuncionarios;
	private VentanaOpciones opciones;
	private VentanaGenerarTurno generarTurno;
	private VentanaInventario inventario;
	private VentanaEstadisticasReportes estadisticasReportes;
	private VentanaModulo modulo;
	private VentanaAgregarMedicamento agregarMedicamento;
	
	
	public View() {
		
		inicio = new VentanaInicio();
		gestionIngresoPaciente = new VentanaGestionIngresoFuncionario();
		agregarFuncionario = new VentanaAgregarFuncionario();
		actualizarFuncionario = new VentanaActualizarFuncionario();
		borrarFuncionario = new VentanaBorrarFuncionario();
		listarFuncionarios = new VentanaListarFuncionarios();
		opciones = new VentanaOpciones();
		generarTurno = new VentanaGenerarTurno();
		inventario = new VentanaInventario();
		estadisticasReportes = new VentanaEstadisticasReportes();
		modulo = new VentanaModulo();
		agregarMedicamento = new VentanaAgregarMedicamento();
	}


	public VentanaInicio getInicio() {
		return inicio;
	}


	public void setInicio(VentanaInicio inicio) {
		this.inicio = inicio;
	}


	public VentanaGestionIngresoFuncionario getGestionIngresoPaciente() {
		return gestionIngresoPaciente;
	}


	public void setGestionIngresoPaciente(VentanaGestionIngresoFuncionario gestionIngresoPaciente) {
		this.gestionIngresoPaciente = gestionIngresoPaciente;
	}


	public VentanaAgregarFuncionario getAgregarFuncionario() {
		return agregarFuncionario;
	}


	public void setAgregarFuncionario(VentanaAgregarFuncionario agregarFuncionario) {
		this.agregarFuncionario = agregarFuncionario;
	}


	public VentanaActualizarFuncionario getActualizarFuncionario() {
		return actualizarFuncionario;
	}


	public void setActualizarFuncionario(VentanaActualizarFuncionario actualizarFuncionario) {
		this.actualizarFuncionario = actualizarFuncionario;
	}


	public VentanaBorrarFuncionario getBorrarFuncionario() {
		return borrarFuncionario;
	}


	public void setBorrarFuncionario(VentanaBorrarFuncionario borrarFuncionario) {
		this.borrarFuncionario = borrarFuncionario;
	}


	public VentanaListarFuncionarios getListarFuncionarios() {
		return listarFuncionarios;
	}


	public void setListarFuncionarios(VentanaListarFuncionarios listarFuncionarios) {
		this.listarFuncionarios = listarFuncionarios;
	}


	public VentanaOpciones getOpciones() {
		return opciones;
	}


	public void setOpciones(VentanaOpciones opciones) {
		this.opciones = opciones;
	}


	public VentanaGenerarTurno getGenerarTurno() {
		return generarTurno;
	}


	public void setGenerarTurno(VentanaGenerarTurno generarTurno) {
		this.generarTurno = generarTurno;
	}


	public VentanaInventario getInventario() {
		return inventario;
	}


	public void setInventario(VentanaInventario inventario) {
		this.inventario = inventario;
	}


	public VentanaEstadisticasReportes getEstadisticasReportes() {
		return estadisticasReportes;
	}


	public void setEstadisticasReportes(VentanaEstadisticasReportes estadisticasReportes) {
		this.estadisticasReportes = estadisticasReportes;
	}


	public VentanaModulo getModulo() {
		return modulo;
	}


	public void setModulo(VentanaModulo modulo) {
		this.modulo = modulo;
	}


	public VentanaAgregarMedicamento getAgregarMedicamento() {
		return agregarMedicamento;
	}


	public void setAgregarMedicamento(VentanaAgregarMedicamento agregarMedicamento) {
		this.agregarMedicamento = agregarMedicamento;
	}
	

	
}
