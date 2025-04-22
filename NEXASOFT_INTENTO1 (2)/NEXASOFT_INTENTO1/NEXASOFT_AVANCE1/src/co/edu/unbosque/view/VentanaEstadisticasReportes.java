package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEstadisticasReportes extends JFrame{
	
	//Atributos

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelEstadisticasReportes;
	private JLabel tituloEstadisticasReportes;
	private JButton botonVolverEstadisticasReportes, botonNumeroUsuariosAtendidos, botonNumeroMedicamentosExpedidos, botonMedicamentosMasVendidos;
	
	//Creacion de la ventana 
	
	public VentanaEstadisticasReportes() {
		setBounds(80, 80, 1370, 700);
		setTitle("Estadisticas y Reportes");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Estadisticas y Reportes 
		
		panelEstadisticasReportes = new JPanel();
		panelEstadisticasReportes.setBounds(0, 0, 1370, 700);
		panelEstadisticasReportes.setLayout(null);
		panelEstadisticasReportes.setBackground(new Color(209, 234, 249));
		
		//Titulo de estadisticas y reportes 
		
		tituloEstadisticasReportes = new JLabel();
		tituloEstadisticasReportes.setText("ESTADISTICAS Y REPORTES");
		tituloEstadisticasReportes.setBounds(405, 150, 560, 42);
		tituloEstadisticasReportes.setForeground(Color.BLACK);
		tituloEstadisticasReportes.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Boton volver a menu opciones 
		
		botonVolverEstadisticasReportes = new JButton();
		botonVolverEstadisticasReportes.setBounds(10, 10, 100, 50);
		botonVolverEstadisticasReportes.setForeground(Color.BLACK);
		botonVolverEstadisticasReportes.setText("Volver");
		
		//Boton De Numero de Usuarios Atendidos 
		
		botonNumeroUsuariosAtendidos = new JButton();
		botonNumeroUsuariosAtendidos.setBounds(375, 240, 610, 50);
		botonNumeroUsuariosAtendidos.setForeground(Color.BLACK);
		botonNumeroUsuariosAtendidos.setText("Numero de usuarios atendidos");
		
		//Boton de numero de medicamentos Expedidos
		
		botonNumeroMedicamentosExpedidos = new JButton();
		botonNumeroMedicamentosExpedidos.setBounds(375, 310, 610, 50);
		botonNumeroMedicamentosExpedidos.setForeground(Color.BLACK);
		botonNumeroMedicamentosExpedidos.setText("Numero de medicamentos expedidos");
		
		//Boton numero de medicamentos mas vendidos
		
		botonMedicamentosMasVendidos = new JButton();
		botonMedicamentosMasVendidos.setBounds(375, 380, 610, 50);
		botonMedicamentosMasVendidos.setForeground(Color.BLACK);
		botonMedicamentosMasVendidos.setText("Numero de medicamentos expedidos");
		
		
		add(panelEstadisticasReportes);
		panelEstadisticasReportes.add(tituloEstadisticasReportes);
		panelEstadisticasReportes.add(botonVolverEstadisticasReportes);
		panelEstadisticasReportes.add(botonNumeroUsuariosAtendidos);
		panelEstadisticasReportes.add(botonNumeroMedicamentosExpedidos);
		panelEstadisticasReportes.add(botonMedicamentosMasVendidos);
		
		
	}

	public JPanel getPanelEstadisticasReportes() {
		return panelEstadisticasReportes;
	}

	public void setPanelEstadisticasReportes(JPanel panelEstadisticasReportes) {
		this.panelEstadisticasReportes = panelEstadisticasReportes;
	}

	public JLabel getTituloEstadisticasReportes() {
		return tituloEstadisticasReportes;
	}

	public void setTituloEstadisticasReportes(JLabel tituloEstadisticasReportes) {
		this.tituloEstadisticasReportes = tituloEstadisticasReportes;
	}

	public JButton getBotonVolverEstadisticasReportes() {
		return botonVolverEstadisticasReportes;
	}

	public void setBotonVolverEstadisticasReportes(JButton botonVolverEstadisticasReportes) {
		this.botonVolverEstadisticasReportes = botonVolverEstadisticasReportes;
	}

	public JButton getBotonNumeroUsuariosAtendidos() {
		return botonNumeroUsuariosAtendidos;
	}

	public void setBotonNumeroUsuariosAtendidos(JButton botonNumeroUsuariosAtendidos) {
		this.botonNumeroUsuariosAtendidos = botonNumeroUsuariosAtendidos;
	}

	public JButton getBotonNumeroMedicamentosExpedidos() {
		return botonNumeroMedicamentosExpedidos;
	}

	public void setBotonNumeroMedicamentosExpedidos(JButton botonNumeroMedicamentosExpedidos) {
		this.botonNumeroMedicamentosExpedidos = botonNumeroMedicamentosExpedidos;
	}

	public JButton getBotonMedicamentosMasVendidos() {
		return botonMedicamentosMasVendidos;
	}

	public void setBotonMedicamentosMasVendidos(JButton botonMedicamentosMasVendidos) {
		this.botonMedicamentosMasVendidos = botonMedicamentosMasVendidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
