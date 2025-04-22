package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaGestionIngresoFuncionario extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declaracion de variables 
	private JPanel panelIngreso;
	private JLabel tituloIngreso, cedula, contrasena;
	private JTextField entradaCedula;
	private JPasswordField entradaContrasena;
	private JButton botonIngresar, botonAgregarFuncionario, botonModificarDatos,botonBorrarFuncionario, botonListarFuncionarios;
	
	//Creacion de la ventana 
	
	public VentanaGestionIngresoFuncionario() {
		setBounds(80, 80, 1370, 700);
		setTitle("Gestion Ingreso");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	//Se inicializa JPanel y se crea el panel 
		
		panelIngreso = new JPanel();
		panelIngreso.setBounds(0, 0, 1370, 700);
		panelIngreso.setLayout(null);
		panelIngreso.setBackground(new Color(209, 234, 249));
		
	    //Titulo Ingreso
		
		tituloIngreso = new JLabel();
		tituloIngreso.setText("INGRESO");
		tituloIngreso.setBounds(593, 120, 185, 45);
		tituloIngreso.setForeground(Color.BLACK);
		tituloIngreso.setFont(new Font("Open Sans", Font.BOLD, 40));
		
	    //Solicitud Cedula
		
		cedula = new JLabel();
		cedula.setText("Cedula:");
		cedula.setBounds(505, 220, 115, 35);
		cedula.setForeground(Color.BLACK);
		cedula.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Solicitud Contraseña 
		
		contrasena = new JLabel();
		contrasena.setText("Contraseña:");
		contrasena.setBounds(440, 270, 180, 35);
		contrasena.setForeground(Color.BLACK);
		contrasena.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Entrada Cedula 
		
		entradaCedula = new JTextField();
		entradaCedula.setBounds(620, 220, 300, 35);
		
		//EntradaContraseña
		
		entradaContrasena = new JPasswordField();
		entradaContrasena.setBounds(620, 270, 300, 35);
		
		//Boton para ingresar al sistema
		
		botonIngresar = new JButton();
		botonIngresar.setBounds(440, 345, 480, 50);
		botonIngresar.setForeground(Color.BLACK);
		botonIngresar.setText("Ingresar al sistema");
		
		//Boton para agregar funcionario
		
		botonAgregarFuncionario = new JButton();
		botonAgregarFuncionario.setBounds(355, 440, 150, 60);
		botonAgregarFuncionario.setForeground(Color.BLACK);
		botonAgregarFuncionario.setText("Agregar Funcionario");
	    
		
		//Boton para modificar datos
		
		botonModificarDatos = new JButton();
		botonModificarDatos.setBounds(525, 440, 150, 60);
		botonModificarDatos.setForeground(Color.BLACK);
		botonModificarDatos.setText("Modificar Datos");
		
		//Boton para borrar funcionario
		
		botonBorrarFuncionario = new JButton();
		botonBorrarFuncionario.setBounds(695, 440, 150, 60);
		botonBorrarFuncionario.setForeground(Color.BLACK);
		botonBorrarFuncionario.setText("Borrar Funcionario");
		
		//Boton para listar funcionarios
		
		botonListarFuncionarios = new JButton();
		botonListarFuncionarios.setBounds(865, 440, 150, 60);
		botonListarFuncionarios.setForeground(Color.BLACK);
		botonListarFuncionarios.setText("Listar Funcionarios");
		
		
		add(panelIngreso);
		panelIngreso.add(tituloIngreso);
		panelIngreso.add(cedula);
		panelIngreso.add(contrasena);
		panelIngreso.add(entradaCedula);
		panelIngreso.add(entradaContrasena);
		panelIngreso.add(botonIngresar);
		panelIngreso.add(botonAgregarFuncionario);
		panelIngreso.add(botonModificarDatos);
		panelIngreso.add(botonBorrarFuncionario);
		panelIngreso.add(botonListarFuncionarios);
		
		
	}
	
	//Getters & Setters

	public JPanel getPanelIngreso() {
		return panelIngreso;
	}

	public void setPanelIngreso(JPanel panelIngreso) {
		this.panelIngreso = panelIngreso;
	}

	public JLabel getTituloIngreso() {
		return tituloIngreso;
	}

	public void setTituloIngreso(JLabel tituloIngreso) {
		this.tituloIngreso = tituloIngreso;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getContrasena() {
		return contrasena;
	}

	public void setContrasena(JLabel contrasena) {
		this.contrasena = contrasena;
	}

	public JTextField getEntradaCedula() {
		return entradaCedula;
	}

	public void setEntradaCedula(JTextField entradaCedula) {
		this.entradaCedula = entradaCedula;
	}

	public JPasswordField getEntradaContrasena() {
		return entradaContrasena;
	}

	public void setEntradaContrasena(JPasswordField entradaContrasena) {
		this.entradaContrasena = entradaContrasena;
	}

	public JButton getBotonAgregarFuncionario() {
		return botonAgregarFuncionario;
	}

	public void setBotonAgregarFuncionario(JButton botonAgregarFuncionario) {
		this.botonAgregarFuncionario = botonAgregarFuncionario;
	}

	public JButton getBotonModificarDatos() {
		return botonModificarDatos;
	}

	public void setBotonModificarDatos(JButton botonModificarDatos) {
		this.botonModificarDatos = botonModificarDatos;
	}

	public JButton getBotonBorrarFuncionario() {
		return botonBorrarFuncionario;
	}

	public void setBotonBorrarFuncionario(JButton botonBorrarFuncionario) {
		this.botonBorrarFuncionario = botonBorrarFuncionario;
	}

	public JButton getBotonListarFuncionarios() {
		return botonListarFuncionarios;
	}

	public void setBotonListarFuncionarios(JButton botonListarFuncionarios) {
		this.botonListarFuncionarios = botonListarFuncionarios;
	}
	
	public JButton getBotonIngresar() {
		return botonIngresar;
	}

	public void setBotonIngresar(JButton botonIngresar) {
		this.botonIngresar = botonIngresar;
	}
}
