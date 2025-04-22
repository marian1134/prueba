package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaAgregarMedicamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelAgregarMedicamento;
	private JLabel tituloAgregarMedicamento, agregarNombreMed, agregarCantidad, agregarPrecio, agregarCodigo;
	private JTextField entradaAgregarMedicamento, entradaAgregarCantidadMed, entradaAgregarPrecioMed, entradaAgregarCodigoMed;
	private JButton botonVolverAgregar, botonAgregarMedicamento;
	
	//Creacion de la ventana 
	
	public VentanaAgregarMedicamento() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Agregar Un Nuevo Funcionario");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		//Panel Agregar Medicamento
		
		panelAgregarMedicamento = new JPanel();
		panelAgregarMedicamento.setBounds(0, 0, 1370, 700);
		panelAgregarMedicamento.setLayout(null);
		panelAgregarMedicamento.setBackground(new Color(209, 234, 249));
		
		//TTitulo Agregar Medicamento
		
		tituloAgregarMedicamento = new JLabel();
		tituloAgregarMedicamento.setText("AGREGAR MEDICAMENTO");
		tituloAgregarMedicamento.setBounds(438, 150, 494, 42);
		tituloAgregarMedicamento.setForeground(Color.BLACK);
		tituloAgregarMedicamento.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Solicitar nombre 
		
		agregarNombreMed = new JLabel();
		agregarNombreMed.setText("Nombre Medicamento:");
		agregarNombreMed.setBounds(397, 250, 330, 35);
		agregarNombreMed.setForeground(Color.BLACK);
		agregarNombreMed.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar cantidad
		
		agregarCantidad = new JLabel();
		agregarCantidad.setText("Cantidad de unidades:");
		agregarCantidad.setBounds(397, 300, 330, 35);
		agregarCantidad.setForeground(Color.BLACK);
		agregarCantidad.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar Precio
		
		agregarPrecio = new JLabel();
		agregarPrecio.setText("Precio:");
		agregarPrecio.setBounds(397, 350, 110, 35);
		agregarPrecio.setForeground(Color.BLACK);
		agregarPrecio.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar codigo
		
		agregarCodigo = new JLabel();
		agregarCodigo.setText("Codigo Medicamento:");
		agregarCodigo.setBounds(397, 400, 320, 35);
		agregarCodigo.setForeground(Color.BLACK);
		agregarCodigo.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Entrada Nombre Medicamento Agregar
		
		entradaAgregarMedicamento = new JTextField();
		entradaAgregarMedicamento.setBounds(732, 250, 300, 35);
		
		//Entrada de cantidad de medicamentos a agregar
		
		entradaAgregarCantidadMed = new JTextField();
		entradaAgregarCantidadMed.setBounds(732, 300, 300, 35);
		
		//Entrada precio
		
		entradaAgregarPrecioMed = new JTextField();
		entradaAgregarPrecioMed.setBounds(512, 350, 500, 35);
		
		//Entraada codigo medicamento
		entradaAgregarCodigoMed =  new JTextField();
		entradaAgregarCodigoMed.setBounds(722, 400, 300, 35);
		
		//Boton volver al inventario
		
		botonVolverAgregar = new JButton();
		botonVolverAgregar.setBounds(10, 10, 100, 50);
		botonVolverAgregar.setForeground(Color.BLACK);
		botonVolverAgregar.setText("Volver");
		
		//Boton Agregar
		
		botonAgregarMedicamento = new JButton();
		botonAgregarMedicamento.setBounds(397, 460, 610, 50);
		botonAgregarMedicamento.setForeground(Color.BLACK);
		botonAgregarMedicamento.setText("Agregar Medicamento");
		
		
		add(panelAgregarMedicamento);
		panelAgregarMedicamento.add(tituloAgregarMedicamento);
		panelAgregarMedicamento.add(agregarNombreMed);
		panelAgregarMedicamento.add(agregarCantidad);
		panelAgregarMedicamento.add(agregarPrecio);
		panelAgregarMedicamento.add(agregarCodigo);
		panelAgregarMedicamento.add(entradaAgregarMedicamento);
		panelAgregarMedicamento.add(entradaAgregarCantidadMed);
		panelAgregarMedicamento.add(entradaAgregarPrecioMed);
		panelAgregarMedicamento.add(entradaAgregarCodigoMed);
		panelAgregarMedicamento.add(botonVolverAgregar);
		panelAgregarMedicamento.add(botonAgregarMedicamento);
		
		
		
	}

	public JPanel getPanelAgregarMedicamento() {
		return panelAgregarMedicamento;
	}

	public void setPanelAgregarMedicamento(JPanel panelAgregarMedicamento) {
		this.panelAgregarMedicamento = panelAgregarMedicamento;
	}

	public JLabel getTituloAgregarMedicamento() {
		return tituloAgregarMedicamento;
	}

	public void setTituloAgregarMedicamento(JLabel tituloAgregarMedicamento) {
		this.tituloAgregarMedicamento = tituloAgregarMedicamento;
	}

	public JLabel getAgregarNombreMed() {
		return agregarNombreMed;
	}

	public void setAgregarNombreMed(JLabel agregarNombreMed) {
		this.agregarNombreMed = agregarNombreMed;
	}

	public JLabel getAgregarCantidad() {
		return agregarCantidad;
	}

	public void setAgregarCantidad(JLabel agregarCantidad) {
		this.agregarCantidad = agregarCantidad;
	}

	public JLabel getAgregarPrecio() {
		return agregarPrecio;
	}

	public void setAgregarPrecio(JLabel agregarPrecio) {
		this.agregarPrecio = agregarPrecio;
	}

	public JLabel getAgregarCodigo() {
		return agregarCodigo;
	}

	public void setAgregarCodigo(JLabel agregarCodigo) {
		this.agregarCodigo = agregarCodigo;
	}

	public JTextField getEntradaAgregarMedicamento() {
		return entradaAgregarMedicamento;
	}

	public void setEntradaAgregarMedicamento(JTextField entradaAgregarMedicamento) {
		this.entradaAgregarMedicamento = entradaAgregarMedicamento;
	}

	public JTextField getEntradaAgregarCantidadMed() {
		return entradaAgregarCantidadMed;
	}

	public void setEntradaAgregarCantidadMed(JTextField entradaAgregarCantidadMed) {
		this.entradaAgregarCantidadMed = entradaAgregarCantidadMed;
	}

	public JTextField getEntradaAgregarPrecioMed() {
		return entradaAgregarPrecioMed;
	}

	public void setEntradaAgregarPrecioMed(JTextField entradaAgregarPrecioMed) {
		this.entradaAgregarPrecioMed = entradaAgregarPrecioMed;
	}

	public JTextField getEntradaAgregarCodigoMed() {
		return entradaAgregarCodigoMed;
	}

	public void setEntradaAgregarCodigoMed(JTextField entradaAgregarCodigoMed) {
		this.entradaAgregarCodigoMed = entradaAgregarCodigoMed;
	}

	public JButton getBotonVolverAgregar() {
		return botonVolverAgregar;
	}

	public void setBotonVolverAgregar(JButton botonVolverAgregar) {
		this.botonVolverAgregar = botonVolverAgregar;
	}

	public JButton getBotonAgregarMedicamento() {
		return botonAgregarMedicamento;
	}

	public void setBotonAgregarMedicamento(JButton botonAgregarMedicamento) {
		this.botonAgregarMedicamento = botonAgregarMedicamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
