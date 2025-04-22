package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaInicio extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Declaracion de variables 
	private JPanel panelInicio;
	private JLabel nombreEmpresa, logoFarmacia;
	private JButton botonInicio, botonSalir;
	
	//Creacion de la ventana 
	
	public VentanaInicio() {
		setBounds(80, 80, 1370, 700);
		setTitle("Inicio");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Inicializacion panel
		
		panelInicio = new JPanel();
		panelInicio.setBounds(0, 0, 1370, 700);
		panelInicio.setLayout(null);
		panelInicio.setBackground(new Color(209, 234, 249));
		
		//Nombre Farmacia
		
		nombreEmpresa = new JLabel();
		nombreEmpresa.setText("FARMABOSQUE");
		nombreEmpresa.setBounds(490, 50, 397, 65);
		nombreEmpresa.setForeground(Color.BLACK);
		nombreEmpresa.setFont(new Font("Courier New", Font.BOLD, 60));
		
		//Imagen Logo Farmacia
		
		logoFarmacia = new JLabel();
		ImageIcon imagen = new ImageIcon("src/co/edu/unbosque/view/LogoFarmaBosque.png");
		Image redimensionado = imagen.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		logoFarmacia.setIcon(new ImageIcon(redimensionado));
		logoFarmacia.setBounds(535, 150, 300, 300);
		
		
		//Boton Inicio
		botonInicio = new JButton();
		botonInicio.setBounds(635, 500, 150, 50);
		botonInicio.setForeground(Color.BLACK);
		botonInicio.setFont(new Font("Hillmount", Font.ITALIC, 20));
		botonInicio.setBorder(new LineBorder(Color.black,2,true));
		botonInicio.setBackground(null);
		botonInicio.setText("Inicio");
		
		botonSalir = new JButton();
		botonSalir.setBounds(635, 560, 150, 50);
		botonSalir.setForeground(Color.BLACK);
		botonSalir.setFont(new Font("Hillmount", Font.ITALIC, 20));
		botonSalir.setBorder(new LineBorder(Color.black,2,true));
		botonSalir.setBackground(null);
		botonSalir.setText("Salir");
		
		panelInicio.add(botonSalir);
		
		add(panelInicio);
		panelInicio.add(nombreEmpresa);
		panelInicio.add(botonInicio);
		panelInicio.add(logoFarmacia);
		
	}
	

	public JPanel getPanelInicio() {
		return panelInicio;
	}

	public void setPanelInicio(JPanel panelInicio) {
		this.panelInicio = panelInicio;
	}

	public JLabel getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(JLabel nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public JButton getBotonInicio() {
		return botonInicio;
	}

	public void setBotonInicio(JButton botonInicio) {
		this.botonInicio = botonInicio;
	}


	public JLabel getLogoFarmacia() {
		return logoFarmacia;
	}


	public void setLogoFarmacia(JLabel logoFarmacia) {
		this.logoFarmacia = logoFarmacia;
	}


	public JButton getBotonSalir() {
		return botonSalir;
	}


	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
