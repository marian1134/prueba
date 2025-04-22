package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaBorrarFuncionario extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declaracion de variables
	private JPanel panelBorrarFuncionario;
	private JLabel tituloBorrarFuncionario, pedirCedulayContrasena, cedulaBorrar, contrasenaBorrar;
	private JButton botonBorrarFuncionario, botonVolverBorrarFuncionario;
	private JTextField entradaCedulaBorrar;
	private JPasswordField entradaContrasenaBorrar;
	
	//Creacion de la ventana 
	
	public VentanaBorrarFuncionario() {
		setBounds(80, 80, 1370, 700);
		setTitle("Borrar Funcionario");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Borrar Funcionario
		
		panelBorrarFuncionario = new JPanel();
		panelBorrarFuncionario.setBounds(0, 0, 1370, 700);
		panelBorrarFuncionario.setLayout(null);
		panelBorrarFuncionario.setBackground(new Color(209, 234, 249));
		
		//Titulo ventana Borrar Funcionari
		
		tituloBorrarFuncionario = new JLabel();
		tituloBorrarFuncionario.setText("BORRAR FUNCIONARIO");
		tituloBorrarFuncionario.setBounds(450, 120, 470, 45);
		tituloBorrarFuncionario.setForeground(Color.BLACK);
		tituloBorrarFuncionario.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Solicitar cedula y contrasena
		
		pedirCedulayContrasena = new JLabel();
		pedirCedulayContrasena.setText("Ingrese la cedula y contrasena del cliente que desea borrar:");
		pedirCedulayContrasena.setBounds(335, 190, 700, 30);
		pedirCedulayContrasena.setForeground(Color.BLACK);
		pedirCedulayContrasena.setFont(new Font("Open Sans", Font.BOLD, 25));
		
		//Cedula a borrar
		
		cedulaBorrar = new JLabel();
		cedulaBorrar.setText("Ingrese su cedula:");
		cedulaBorrar.setBounds(415, 250, 270, 35);
		cedulaBorrar.setForeground(Color.BLACK);
		cedulaBorrar.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Contraseña a borrar 
		
		contrasenaBorrar = new JLabel();
		contrasenaBorrar.setText("Ingrese su cedula:");
		contrasenaBorrar.setBounds(415, 315, 270, 35);
		contrasenaBorrar.setForeground(Color.BLACK);
		contrasenaBorrar.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Entrada cedula a borrar
		
		entradaCedulaBorrar = new JTextField();
		entradaCedulaBorrar.setBounds(685, 250, 300, 35);
		
		//Entrada contrasena a borrar
		
		entradaContrasenaBorrar = new JPasswordField();
		entradaContrasenaBorrar.setBounds(685, 315, 300, 35);
		
		//Boton volver gestion usuario 
		
		botonVolverBorrarFuncionario = new JButton();
		botonVolverBorrarFuncionario.setBounds(10, 10, 100, 50);
		botonVolverBorrarFuncionario.setForeground(Color.BLACK);
		botonVolverBorrarFuncionario.setText("Volver");
		
		//Boton borrar funcionario
		
		botonBorrarFuncionario = new JButton();
		botonBorrarFuncionario.setBounds(375, 400, 610, 50);
		botonBorrarFuncionario.setForeground(Color.BLACK);
		botonBorrarFuncionario.setText("Borrar Funcionario");
		
		add(panelBorrarFuncionario);
		panelBorrarFuncionario.add(tituloBorrarFuncionario);
		panelBorrarFuncionario.add(pedirCedulayContrasena);
		panelBorrarFuncionario.add(cedulaBorrar);
		panelBorrarFuncionario.add(contrasenaBorrar);
		panelBorrarFuncionario.add(entradaCedulaBorrar);
		panelBorrarFuncionario.add(entradaContrasenaBorrar);
		panelBorrarFuncionario.add(botonVolverBorrarFuncionario);
		panelBorrarFuncionario.add(botonBorrarFuncionario);
		
		
	}

	public JPanel getPanelBorrarFuncionario() {
		return panelBorrarFuncionario;
	}

	public void setPanelBorrarFuncionario(JPanel panelBorrarFuncionario) {
		this.panelBorrarFuncionario = panelBorrarFuncionario;
	}

	public JLabel getTituloBorrarFuncionario() {
		return tituloBorrarFuncionario;
	}

	public void setTituloBorrarFuncionario(JLabel tituloBorrarFuncionario) {
		this.tituloBorrarFuncionario = tituloBorrarFuncionario;
	}

	public JLabel getPedirCedulayContrasena() {
		return pedirCedulayContrasena;
	}

	public void setPedirCedulayContrasena(JLabel pedirCedulayContrasena) {
		this.pedirCedulayContrasena = pedirCedulayContrasena;
	}

	public JLabel getCedulaBorrar() {
		return cedulaBorrar;
	}

	public void setCedulaBorrar(JLabel cedulaBorrar) {
		this.cedulaBorrar = cedulaBorrar;
	}

	public JLabel getContrasenaBorrar() {
		return contrasenaBorrar;
	}

	public void setContrasenaBorrar(JLabel contrasenaBorrar) {
		this.contrasenaBorrar = contrasenaBorrar;
	}

	public JButton getBotonBorrarFuncionario() {
		return botonBorrarFuncionario;
	}

	public void setBotonBorrarFuncionario(JButton botonBorrarFuncionario) {
		this.botonBorrarFuncionario = botonBorrarFuncionario;
	}

	public JButton getBotonVolverBorrarFuncionario() {
		return botonVolverBorrarFuncionario;
	}

	public void setBotonVolverBorrarFuncionario(JButton botonVolverBorrarFuncionario) {
		this.botonVolverBorrarFuncionario = botonVolverBorrarFuncionario;
	}

	public JTextField getEntradaCedulaBorrar() {
		return entradaCedulaBorrar;
	}

	public void setEntradaCedulaBorrar(JTextField entradaCedulaBorrar) {
		this.entradaCedulaBorrar = entradaCedulaBorrar;
	}

	public JPasswordField getEntradaContrasenaBorrar() {
		return entradaContrasenaBorrar;
	}

	public void setEntradaContrasenaBorrar(JPasswordField entradaContrasenaBorrar) {
		this.entradaContrasenaBorrar = entradaContrasenaBorrar;
	}
	
}
