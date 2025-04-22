package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class VentanaActualizarFuncionario extends JFrame {
	
	//Declaracion de variables
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelModificarDatos;
	private JLabel tituloModificarDatos, modificarNombreCompleto, modificarCedula, modificarContrasena, modificarCorreoElectronico,entradaModificarContrasena, datoActualizar, agregarModulo;
	private JTextField entradaModificarNombreCompleto, entradaModificarCedula, entradaModificarCorreo, entradaDatoActualizar, entradaAgregarModulo;
	private JButton botonVolverModificarDatos, botonGuardarDatos;
	
	//Creacion de la ventana
	
	public VentanaActualizarFuncionario() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Agregar Un Nuevo Funcionario");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Modificar Datos 
		
		panelModificarDatos = new JPanel();
		panelModificarDatos.setBounds(0, 0, 1370, 700);
		panelModificarDatos.setLayout(null);
		panelModificarDatos.setBackground(new Color(209, 234, 249));
		
		//Titulo Modificar Datos
		
		
		tituloModificarDatos = new JLabel();
		tituloModificarDatos.setText("MODIFICAR DATOS");
		tituloModificarDatos.setBounds(498, 150, 375, 42);
		tituloModificarDatos.setForeground(Color.BLACK);
		tituloModificarDatos.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Modificar nombre completo 
		
		datoActualizar = new JLabel();
		datoActualizar.setText("Cedula del funcionario: ");
		datoActualizar.setBounds(415, 250, 270, 35);
		datoActualizar.setForeground(Color.BLACK);
		datoActualizar.setFont(new Font("Open Sans", Font.BOLD, 30));
		panelModificarDatos.add(datoActualizar);
		
		entradaDatoActualizar = new JTextField();
		entradaDatoActualizar.setBounds(415, 250, 270, 35);
		
		panelModificarDatos.add(entradaDatoActualizar);
		modificarNombreCompleto = new JLabel();
		modificarNombreCompleto.setText("Nombre Completo:");
		modificarNombreCompleto.setBounds(415, 250, 270, 35);
		modificarNombreCompleto.setForeground(Color.BLACK);
		modificarNombreCompleto.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		agregarModulo = new JLabel();
		agregarModulo.setText("Ingrese su modulo: ");
		agregarModulo.setBounds(415, 450, 270, 35);
		agregarModulo.setForeground(Color.BLACK);
		agregarModulo.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		panelModificarDatos.add(agregarModulo);
		
		entradaAgregarModulo = new JTextField();
		entradaAgregarModulo.setBounds(685, 300, 300, 35);
		
		panelModificarDatos.add(entradaAgregarModulo);
		
		//Modificar cedula
		
		modificarCedula = new JLabel();
		modificarCedula.setText("Ingrese su cedula:");
		modificarCedula.setBounds(415, 300, 270, 35);
		modificarCedula.setForeground(Color.BLACK);
		modificarCedula.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Modificar contrasena 
		
		modificarContrasena = new JLabel();
		modificarContrasena.setText("Cree una contraseña:");
		modificarContrasena.setBounds(372, 350, 310, 35);
		modificarContrasena.setForeground(Color.BLACK);
		modificarContrasena.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Modificar correo
		
		modificarCorreoElectronico = new JLabel();
		modificarCorreoElectronico.setText("Ingrese su correo:");
		modificarCorreoElectronico.setBounds(415, 400, 270, 35);
		modificarCorreoElectronico.setForeground(Color.BLACK);
		modificarCorreoElectronico.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		//Entrada modificar nombre completo 
		
		entradaModificarNombreCompleto = new JTextField();
		entradaModificarNombreCompleto.setBounds(685, 250, 300, 35);
		entradaModificarNombreCompleto.setBorder(new LineBorder(Color.black, 1, true));
		entradaModificarNombreCompleto.setBackground(null);
		
		
		//Entrada modificar cedula
		
		entradaModificarCedula = new JTextField();
		entradaModificarCedula.setBounds(685, 300, 300, 35);
		
		//Entrada modificar contrasena
		
		entradaModificarContrasena = new JLabel();
		entradaModificarContrasena.setBounds(685, 350, 300, 35);
		
		//Entrada modificar correo
		
		entradaModificarCorreo =  new JTextField();
		entradaModificarCorreo.setBounds(685, 400, 300, 35);
		
		//Boton para volver al gestion ingreso
		
		botonVolverModificarDatos = new JButton();
		botonVolverModificarDatos.setBounds(10, 10, 100, 50);
		botonVolverModificarDatos.setForeground(Color.BLACK);
		botonVolverModificarDatos.setText("Volver");
		
		//Boton guardar datos
		
		botonGuardarDatos = new JButton();
		botonGuardarDatos.setBounds(375, 465, 610, 50);
		botonGuardarDatos.setForeground(Color.BLACK);
		botonGuardarDatos.setText("Registrar Funcionario");
		
		
		add(panelModificarDatos);
		panelModificarDatos.add(tituloModificarDatos);
		panelModificarDatos.add(modificarNombreCompleto);
		panelModificarDatos.add(modificarCedula);
		panelModificarDatos.add(modificarContrasena);
		panelModificarDatos.add(modificarCorreoElectronico);
		panelModificarDatos.add(entradaModificarNombreCompleto);
		panelModificarDatos.add(entradaModificarCedula);
		panelModificarDatos.add(entradaModificarContrasena);
		panelModificarDatos.add(entradaModificarCorreo);
		panelModificarDatos.add(botonVolverModificarDatos);
		panelModificarDatos.add(botonGuardarDatos);
	}

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

	public JLabel getDatoActualizar() {
		return datoActualizar;
	}

	public void setDatoActualizar(JLabel datoActualizar) {
		this.datoActualizar = datoActualizar;
	}

	public JTextField getEntradaDatoActualizar() {
		return entradaDatoActualizar;
	}

	public void setEntradaDatoActualizar(JTextField entradaDatoActualizar) {
		this.entradaDatoActualizar = entradaDatoActualizar;
	}

	public JPanel getPanelModificarDatos() {
		return panelModificarDatos;
	}

	public void setPanelModificarDatos(JPanel panelModificarDatos) {
		this.panelModificarDatos = panelModificarDatos;
	}

	public JLabel getTituloModificarDatos() {
		return tituloModificarDatos;
	}

	public void setTituloModificarDatos(JLabel tituloModificarDatos) {
		this.tituloModificarDatos = tituloModificarDatos;
	}

	public JLabel getModificarNombreCompleto() {
		return modificarNombreCompleto;
	}

	public void setModificarNombreCompleto(JLabel modificarNombreCompleto) {
		this.modificarNombreCompleto = modificarNombreCompleto;
	}

	public JLabel getModificarCedula() {
		return modificarCedula;
	}

	public void setModificarCedula(JLabel modificarCedula) {
		this.modificarCedula = modificarCedula;
	}

	public JLabel getModificarContrasena() {
		return modificarContrasena;
	}

	public void setModificarContrasena(JLabel modificarContrasena) {
		this.modificarContrasena = modificarContrasena;
	}

	public JLabel getModificarCorreoElectronico() {
		return modificarCorreoElectronico;
	}

	public void setModificarCorreoElectronico(JLabel modificarCorreoElectronico) {
		this.modificarCorreoElectronico = modificarCorreoElectronico;
	}


	public JLabel getEntradaModificarContrasena() {
		return entradaModificarContrasena;
	}

	public void setEntradaModificarContrasena(JLabel entradaModificarContrasena) {
		this.entradaModificarContrasena = entradaModificarContrasena;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField getEntradaModificarNombreCompleto() {
		return entradaModificarNombreCompleto;
	}

	public void setEntradaModificarNombreCompleto(JTextField entradaModificarNombreCompleto) {
		this.entradaModificarNombreCompleto = entradaModificarNombreCompleto;
	}

	public JTextField getEntradaModificarCedula() {
		return entradaModificarCedula;
	}

	public void setEntradaModificarCedula(JTextField entradaModificarCedula) {
		this.entradaModificarCedula = entradaModificarCedula;
	}

	public JTextField getEntradaModificarCorreo() {
		return entradaModificarCorreo;
	}

	public void setEntradaModificarCorreo(JTextField entradaModificarCorreo) {
		this.entradaModificarCorreo = entradaModificarCorreo;
	}

	public JButton getBotonVolverModificarDatos() {
		return botonVolverModificarDatos;
	}

	public void setBotonVolverModificarDatos(JButton botonVolverModificarDatos) {
		this.botonVolverModificarDatos = botonVolverModificarDatos;
	}

	public JButton getBotonGuardarDatos() {
		return botonGuardarDatos;
	}

	public void setBotonGuardarDatos(JButton botonGuardarDatos) {
		this.botonGuardarDatos = botonGuardarDatos;
	}

}
