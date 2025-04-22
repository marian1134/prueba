package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaAgregarFuncionario extends JFrame{
	
	//Declaracion de variables 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelAgregarFuncionario;
	private JLabel tituloAgregarFuncionario, agregarNombre, agregarCedula, crearContrasena, agregarCorreo, agregarModulo;
	private JTextField entradaAgregarNombre,entradaCedulaNuevo, entradaAgregarCorreo, entradaCrearContrasena, entradaAgregarModulo;
	private JButton botonVolver, botonRegistrarFuncionario;
	
	//Creacion de la ventana 
	
	public VentanaAgregarFuncionario() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Agregar Un Nuevo Funcionario");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
	// Se inicializa el panel y se crea el panel 
		
		panelAgregarFuncionario = new JPanel();
		panelAgregarFuncionario.setBounds(0, 0, 1370, 700);
		panelAgregarFuncionario.setLayout(null);
		panelAgregarFuncionario.setBackground(new Color(209, 234, 249));
		
		//Titulo de agrgar Funcionario 
		
		tituloAgregarFuncionario = new JLabel();
		tituloAgregarFuncionario.setText("AGREGAR FUNCIONARIO");
		tituloAgregarFuncionario.setBounds(438, 150, 494, 42);
		tituloAgregarFuncionario.setForeground(Color.BLACK);
		tituloAgregarFuncionario.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Solicitar nombre 
		
		agregarNombre = new JLabel();
		agregarNombre.setText("Nombre Completo:");
		agregarNombre.setBounds(397, 250, 300, 35);
		agregarNombre.setForeground(Color.BLACK);
		agregarNombre.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar numero de cedula
		
		agregarCedula = new JLabel();
		agregarCedula.setText("Ingrese su cedula:");
		agregarCedula.setBounds(415, 300, 270, 35);
		agregarCedula.setForeground(Color.BLACK);
		agregarCedula.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar crear contraseña
		
		crearContrasena = new JLabel();
		crearContrasena.setText("Cree una contraseña:");
		crearContrasena.setBounds(372, 350, 310, 35);
		crearContrasena.setForeground(Color.BLACK);
		crearContrasena.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitar correo
		
		agregarCorreo = new JLabel();
		agregarCorreo.setText("Ingrese su correo:");
		agregarCorreo.setBounds(415, 400, 270, 35);
		agregarCorreo.setForeground(Color.BLACK);
		agregarCorreo.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		agregarModulo = new JLabel();
		agregarModulo.setText("Ingrese su modulo: ");
		agregarModulo.setBounds(415, 450, 270, 35);
		agregarModulo.setForeground(Color.BLACK);
		agregarModulo.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		panelAgregarFuncionario.add(agregarModulo);
		
		entradaAgregarModulo = new JTextField();
		entradaAgregarModulo.setBounds(685, 300, 300, 35);
		
		panelAgregarFuncionario.add(entradaAgregarModulo);
		
		//Entrada del nombre
		
		entradaAgregarNombre = new JTextField();
		entradaAgregarNombre.setBounds(685, 250, 300, 35);
		
		
		//Entrada de la cedula 
		
		entradaCedulaNuevo = new JTextField();
		entradaCedulaNuevo.setBounds(685, 300, 300, 35);
		
		//Entrada para crear la contraseña
		
		
		
		//Entrada para pedir el correo del funcionario
		
		entradaAgregarCorreo =  new JTextField();
		entradaAgregarCorreo.setBounds(685, 400, 300, 35);
		
		//
		entradaCrearContrasena = new JTextField();
		entradaCrearContrasena.setBounds(685, 350, 300, 35);
		
		//Boton para volver 
		
		botonVolver = new JButton();
		botonVolver.setBounds(10, 10, 100, 50);
		botonVolver.setForeground(Color.BLACK);
		botonVolver.setText("Volver");
		
		//Boton para registrar funcionario
		
		botonRegistrarFuncionario = new JButton();
		botonRegistrarFuncionario.setBounds(375, 465, 610, 50);
		botonRegistrarFuncionario.setForeground(Color.BLACK);
		botonRegistrarFuncionario.setText("Registrar Funcionario");
		
		
		add(panelAgregarFuncionario);
		panelAgregarFuncionario.add(tituloAgregarFuncionario);
		panelAgregarFuncionario.add(agregarNombre);
		panelAgregarFuncionario.add(agregarCedula);
		panelAgregarFuncionario.add(crearContrasena);
		panelAgregarFuncionario.add(agregarCorreo);
		panelAgregarFuncionario.add(entradaAgregarNombre);
		panelAgregarFuncionario.add(entradaCedulaNuevo);
		panelAgregarFuncionario.add(entradaCrearContrasena);
		panelAgregarFuncionario.add(entradaAgregarCorreo);
		panelAgregarFuncionario.add(botonVolver);
		panelAgregarFuncionario.add(botonRegistrarFuncionario);
	}
	
	//Getters & Setters

	public JLabel getAgregarModulo() {
		return agregarModulo;
	}

	public void setAgregarModulo(JLabel agregarModulo) {
		this.agregarModulo = agregarModulo;
	}

	public JTextField getEntradaAgregarModulo() {
		return entradaAgregarModulo;
	}

	public void setEntradaAgregarModulo(JTextField entradaAgregarModulo) {
		this.entradaAgregarModulo = entradaAgregarModulo;
	}

	public JPanel getPanelAgregarFuncionario() {
		return panelAgregarFuncionario;
	}

	public void setPanelAgregarFuncionario(JPanel panelAgregarFuncionario) {
		this.panelAgregarFuncionario = panelAgregarFuncionario;
	}

	public JLabel getTituloAgregarFuncionario() {
		return tituloAgregarFuncionario;
	}

	public void setTituloAgregarFuncionario(JLabel tituloAgregarFuncionario) {
		this.tituloAgregarFuncionario = tituloAgregarFuncionario;
	}

	public JLabel getAgregarCedula() {
		return agregarCedula;
	}

	public void setAgregarCedula(JLabel agregarCedula) {
		this.agregarCedula = agregarCedula;
	}

	public JLabel getCrearContrasena() {
		return crearContrasena;
	}

	public void setCrearContrasena(JLabel crearContrasena) {
		this.crearContrasena = crearContrasena;
	}

	public JTextField getEntradaCedulaNuevo() {
		return entradaCedulaNuevo;
	}

	public void setEntradaCedulaNuevo(JTextField entradaCedulaNuevo) {
		this.entradaCedulaNuevo = entradaCedulaNuevo;
	}


	public JTextField getEntradaCrearContrasena() {
		return entradaCrearContrasena;
	}

	public void setEntradaCrearContrasena(JTextField entradaCrearContrasena) {
		this.entradaCrearContrasena = entradaCrearContrasena;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JButton getBotonRegistrarFuncionario() {
		return botonRegistrarFuncionario;
	}

	public void setBotonRegistrarFuncionario(JButton botonRegistrarFuncionario) {
		this.botonRegistrarFuncionario = botonRegistrarFuncionario;
	}

	public JLabel getAgregarNombre() {
		return agregarNombre;
	}

	public void setAgregarNombre(JLabel agregarNombre) {
		this.agregarNombre = agregarNombre;
	}

	public JLabel getAgregarCorreo() {
		return agregarCorreo;
	}

	public void setAgregarCorreo(JLabel agregarCorreo) {
		this.agregarCorreo = agregarCorreo;
	}

	public JTextField getEntradaAgregarNombre() {
		return entradaAgregarNombre;
	}

	public void setEntradaAgregarNombre(JTextField entradaAgregarNombre) {
		this.entradaAgregarNombre = entradaAgregarNombre;
	}

	public JTextField getEntradaAgregarCorreo() {
		return entradaAgregarCorreo;
	}

	public void setEntradaAgregarCorreo(JTextField entradaAgregarCorreo) {
		this.entradaAgregarCorreo = entradaAgregarCorreo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	

}
