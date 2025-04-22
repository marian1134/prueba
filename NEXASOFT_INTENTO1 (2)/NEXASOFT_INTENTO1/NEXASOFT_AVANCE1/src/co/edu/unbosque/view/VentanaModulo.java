package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaModulo extends JFrame {
	
	//Atributos

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelModulo;
	private JLabel tituloNumeroModulo, ingresoCedulaCompra, ingresoCodigoEntidadReceta, ingresoCodigoMedicamento, ingresoCantidad;
	private JTextField entradaCedulaCompra, entradaCodigoEntidadReceta, entradaCodigoMedicamento, entradaCantidadMedicamentos;
	private JButton botonComprarMedicamento, botonVolverModulo;
	
	//Creacion de la ventana 
	
	public VentanaModulo() {
		setBounds(80, 80, 1370, 700);
		setTitle("Modulo 1");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Modulo 
		
		panelModulo = new JPanel();
		panelModulo.setBounds(0, 0, 1370, 700);
		panelModulo.setLayout(null);
		panelModulo.setBackground(new Color(209, 234, 249));
		
		//Titulo Modulo 
		
		tituloNumeroModulo = new JLabel();
		tituloNumeroModulo.setText("MODULO");
		tituloNumeroModulo.setBounds(593, 120, 185, 45);
		tituloNumeroModulo.setForeground(Color.BLACK);
		tituloNumeroModulo.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Ingreso cedula 
		
		ingresoCedulaCompra = new JLabel();
		ingresoCedulaCompra.setText("Cedula Paciente:");
		ingresoCedulaCompra.setBounds(390, 220, 245, 35);
		ingresoCedulaCompra.setForeground(Color.BLACK);
		ingresoCedulaCompra.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Ingreso Codigo de la entidad que expide la receta
		
		ingresoCodigoEntidadReceta = new JLabel();
		ingresoCodigoEntidadReceta.setText("Codigo entidad que expide la receta:");
		ingresoCodigoEntidadReceta.setBounds(390, 270, 535, 35);
		ingresoCodigoEntidadReceta.setForeground(Color.BLACK);
		ingresoCodigoEntidadReceta.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Ingreso Codigo Medicamento
		
		ingresoCodigoMedicamento = new JLabel();
		ingresoCodigoMedicamento.setText("Codigo medicamento:");
		ingresoCodigoMedicamento.setBounds(390, 320, 325, 35);
		ingresoCodigoMedicamento.setForeground(Color.BLACK);
		ingresoCodigoMedicamento.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Ingreso de cantidad a medicamentos a comprar
		
		ingresoCantidad = new JLabel();
		ingresoCantidad.setText("Cantidad:");
		ingresoCantidad.setBounds(390, 370, 140, 35);
		ingresoCantidad.setForeground(Color.BLACK);
		ingresoCantidad.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Entrada de la cedula para la compra
		
		entradaCedulaCompra = new JTextField();
		entradaCedulaCompra.setBounds(645, 220, 390, 35);
		
		//Entrada codigo de la entidad que expide la receta
		
		entradaCodigoEntidadReceta = new JTextField();
		entradaCodigoEntidadReceta.setBounds(935, 270, 100, 35);
		
		//Entrada codigo medicamentos
		
		entradaCodigoMedicamento = new JTextField();
		entradaCodigoMedicamento.setBounds(725, 320, 310, 35);
		
		//Entrada Cantidad Medicamentos
		
		entradaCantidadMedicamentos = new JTextField();
		entradaCantidadMedicamentos.setBounds(540, 370, 495, 35);
		
		//Boton Volver turnos
		
		botonVolverModulo = new JButton();
		botonVolverModulo.setBounds(10, 10, 100, 50);
		botonVolverModulo.setForeground(Color.BLACK);
		botonVolverModulo.setText("Volver");
		
		//Boton Comprar Medicamentos 
		
		botonComprarMedicamento = new JButton();
		botonComprarMedicamento.setBounds(535, 500, 300, 70);
		botonComprarMedicamento.setForeground(Color.BLACK);
		botonComprarMedicamento.setText("Solicitar Medicamento");
		
		
		add(panelModulo);
		panelModulo.add(tituloNumeroModulo);
		panelModulo.add(ingresoCedulaCompra);
		panelModulo.add(ingresoCodigoEntidadReceta);
		panelModulo.add(ingresoCodigoMedicamento);
		panelModulo.add(ingresoCantidad);
		panelModulo.add(entradaCedulaCompra);
		panelModulo.add(entradaCodigoEntidadReceta);
		panelModulo.add(entradaCodigoMedicamento);
		panelModulo.add(entradaCantidadMedicamentos);
		panelModulo.add(botonVolverModulo);
		panelModulo.add(botonComprarMedicamento);
		
	}

	public JPanel getPanelModulo() {
		return panelModulo;
	}

	public void setPanelModulo(JPanel panelModulo) {
		this.panelModulo = panelModulo;
	}

	public JLabel getTituloNumeroModulo() {
		return tituloNumeroModulo;
	}

	public void setTituloNumeroModulo(JLabel tituloNumeroModulo) {
		this.tituloNumeroModulo = tituloNumeroModulo;
	}

	public JLabel getIngresoCedulaCompra() {
		return ingresoCedulaCompra;
	}

	public void setIngresoCedulaCompra(JLabel ingresoCedulaCompra) {
		this.ingresoCedulaCompra = ingresoCedulaCompra;
	}

	public JLabel getIngresoCodigoEntidadReceta() {
		return ingresoCodigoEntidadReceta;
	}

	public void setIngresoCodigoEntidadReceta(JLabel ingresoCodigoEntidadReceta) {
		this.ingresoCodigoEntidadReceta = ingresoCodigoEntidadReceta;
	}

	public JLabel getIngresoCodigoMedicamento() {
		return ingresoCodigoMedicamento;
	}

	public void setIngresoCodigoMedicamento(JLabel ingresoCodigoMedicamento) {
		this.ingresoCodigoMedicamento = ingresoCodigoMedicamento;
	}

	public JLabel getIngresoCantidad() {
		return ingresoCantidad;
	}

	public void setIngresoCantidad(JLabel ingresoCantidad) {
		this.ingresoCantidad = ingresoCantidad;
	}

	public JTextField getEntradaCedulaCompra() {
		return entradaCedulaCompra;
	}

	public void setEntradaCedulaCompra(JTextField entradaCedulaCompra) {
		this.entradaCedulaCompra = entradaCedulaCompra;
	}

	public JTextField getEntradaCodigoEntidadReceta() {
		return entradaCodigoEntidadReceta;
	}

	public void setEntradaCodigoEntidadReceta(JTextField entradaCodigoEntidadReceta) {
		this.entradaCodigoEntidadReceta = entradaCodigoEntidadReceta;
	}

	public JTextField getEntradaCodigoMedicamento() {
		return entradaCodigoMedicamento;
	}

	public void setEntradaCodigoMedicamento(JTextField entradaCodigoMedicamento) {
		this.entradaCodigoMedicamento = entradaCodigoMedicamento;
	}

	public JTextField getEntradaCantidadMedicamentos() {
		return entradaCantidadMedicamentos;
	}

	public void setEntradaCantidadMedicamentos(JTextField entradaCantidadMedicamentos) {
		this.entradaCantidadMedicamentos = entradaCantidadMedicamentos;
	}

	public JButton getBotonComprarMedicamento() {
		return botonComprarMedicamento;
	}

	public void setBotonComprarMedicamento(JButton botonComprarMedicamento) {
		this.botonComprarMedicamento = botonComprarMedicamento;
	}

	public JButton getBotonVolverModulo() {
		return botonVolverModulo;
	}

	public void setBotonVolverModulo(JButton botonVolverModulo) {
		this.botonVolverModulo = botonVolverModulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
