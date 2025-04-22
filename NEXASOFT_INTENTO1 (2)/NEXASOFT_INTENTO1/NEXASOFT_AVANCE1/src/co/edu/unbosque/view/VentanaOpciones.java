package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaOpciones extends JFrame {
	
	//Atributos 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelOpciones;
	private JLabel tituloEscogerOpcion;
	private JButton botonGenerarTurnoPaciente, botonInventario, botonEstadisticasReportes, botonVolverIngreso;
	
	//Creacion de la ventana 
	
	public VentanaOpciones() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Ventana Opciones ");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Opciones 
		
		panelOpciones = new JPanel();
		panelOpciones.setBounds(0, 0, 1370, 700);
		panelOpciones.setLayout(null);
		panelOpciones.setBackground(new Color(209, 234, 249));
		
		//Titulo escoger una opcion 
		
		tituloEscogerOpcion = new JLabel();
		tituloEscogerOpcion.setText("Escoja la opción que desee:");
		tituloEscogerOpcion.setBounds(535, 190, 330, 30);
		tituloEscogerOpcion.setForeground(Color.BLACK);
		tituloEscogerOpcion.setFont(new Font("Open Sans", Font.BOLD, 25));
		
		//Boton para generar el turno de paciente 
		
		botonGenerarTurnoPaciente = new JButton();
		botonGenerarTurnoPaciente.setBounds(375, 240, 610, 50);
		botonGenerarTurnoPaciente.setForeground(Color.BLACK);
		botonGenerarTurnoPaciente.setText("Generar turno para paciente");
		
		//Boton para ingresar al inventario
		
		botonInventario = new JButton();
		botonInventario.setBounds(375, 310, 610, 50);
		botonInventario.setForeground(Color.BLACK);
		botonInventario.setText("Inventario BosqueFarma");
		
		//Boton para ingresar al inventario
		
		botonEstadisticasReportes = new JButton();
		botonEstadisticasReportes.setBounds(375, 380, 610, 50);
		botonEstadisticasReportes.setForeground(Color.BLACK);
		botonEstadisticasReportes.setText("Estadisticas y reportes BosqueFarma");
		
		//Boton volver
		
		botonVolverIngreso = new JButton();
		botonVolverIngreso.setBounds(10, 10, 100, 50);
		botonVolverIngreso.setForeground(Color.BLACK);
		botonVolverIngreso.setText("Volver");
		
		add(panelOpciones);
		panelOpciones.add(tituloEscogerOpcion);
		panelOpciones.add(botonGenerarTurnoPaciente);
		panelOpciones.add(botonInventario);
		panelOpciones.add(botonEstadisticasReportes);
		panelOpciones.add(botonVolverIngreso);
		
		
		
	}

	public JButton getBotonVolverIngreso() {
		return botonVolverIngreso;
	}

	public void setBotonVolverIngreso(JButton botonVolverIngreso) {
		this.botonVolverIngreso = botonVolverIngreso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getPanelOpciones() {
		return panelOpciones;
	}

	public void setPanelOpciones(JPanel panelOpciones) {
		this.panelOpciones = panelOpciones;
	}

	public JLabel getTituloEscogerOpcion() {
		return tituloEscogerOpcion;
	}

	public void setTituloEscogerOpcion(JLabel tituloEscogerOpcion) {
		this.tituloEscogerOpcion = tituloEscogerOpcion;
	}

	public JButton getBotonGenerarTurnoPaciente() {
		return botonGenerarTurnoPaciente;
	}

	public void setBotonGenerarTurnoPaciente(JButton botonGenerarTurnoPaciente) {
		this.botonGenerarTurnoPaciente = botonGenerarTurnoPaciente;
	}

	public JButton getBotonInventario() {
		return botonInventario;
	}

	public void setBotonInventario(JButton botonInventario) {
		this.botonInventario = botonInventario;
	}

	public JButton getBotonEstadisticasReportes() {
		return botonEstadisticasReportes;
	}

	public void setBotonEstadisticasReportes(JButton botonEstadisticasReportes) {
		this.botonEstadisticasReportes = botonEstadisticasReportes;
	}
}
