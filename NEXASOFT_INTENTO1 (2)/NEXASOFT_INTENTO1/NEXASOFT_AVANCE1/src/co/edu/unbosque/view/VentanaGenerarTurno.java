package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaGenerarTurno extends JFrame{
	
	//Atributos 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelGenerarTurnos;
	private JLabel tituloTurnosPacientes;
	private JButton botonVolverGenerarTurnos, botonModulo;
	
	
	//Creacion de la ventana
	public VentanaGenerarTurno() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Generar Turnos Para Pacientes");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Turnos 
		
		panelGenerarTurnos = new JPanel();
		panelGenerarTurnos.setBounds(0, 0, 1370, 700);
		panelGenerarTurnos.setLayout(null);
		panelGenerarTurnos.setBackground(new Color(209, 234, 249));
		
		//Titulo Turnos Pacientes
		
		tituloTurnosPacientes = new JLabel();
		tituloTurnosPacientes.setText("TURNOS PACIENTES");
		tituloTurnosPacientes.setBounds(485, 150, 410, 42);
		tituloTurnosPacientes.setForeground(Color.BLACK);
		tituloTurnosPacientes.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		
		//Boton Volver Menu Opciones
		
		botonVolverGenerarTurnos = new JButton();
		botonVolverGenerarTurnos.setBounds(10, 10, 100, 50);
		botonVolverGenerarTurnos.setForeground(Color.BLACK);
		botonVolverGenerarTurnos.setText("Volver");
		
		//Boton para ir al modulo correspondiente 
		
		botonModulo = new JButton();
		botonModulo.setBounds(535, 500, 300, 70);
		botonModulo.setForeground(Color.BLACK);
		botonModulo.setText("Dirigirse al modulo indicado");
		
		
		add(panelGenerarTurnos);
		panelGenerarTurnos.add(botonVolverGenerarTurnos);
		panelGenerarTurnos.add(tituloTurnosPacientes);
		panelGenerarTurnos.add(botonModulo);
		
		
	}

	public JButton getBotonModulo() {
		return botonModulo;
	}

	public void setBotonModulo(JButton botonModulo) {
		this.botonModulo = botonModulo;
	}

	public JLabel getTituloTurnosPacientes() {
		return tituloTurnosPacientes;
	}

	public void setTituloTurnosPacientes(JLabel tituloTurnosPacientes) {
		this.tituloTurnosPacientes = tituloTurnosPacientes;
	}

	public JPanel getPanelGenerarTurnos() {
		return panelGenerarTurnos;
	}

	public void setPanelGenerarTurnos(JPanel panelGenerarTurnos) {
		this.panelGenerarTurnos = panelGenerarTurnos;
	}

	public JButton getBotonVolverGenerarTurnos() {
		return botonVolverGenerarTurnos;
	}

	public void setBotonVolverGenerarTurnos(JButton botonVolverGenerarTurnos) {
		this.botonVolverGenerarTurnos = botonVolverGenerarTurnos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
