package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaInventario extends JFrame {
	
	//Atributos 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelInventario, panelMostrarInventario;
	private JLabel tituloInventario;
	private JButton botonVolverMenuOpciones,botonAgregarMedicamento, botonEliminarMedicamento;
	
	
	//Creacion de la ventana 
	
	public VentanaInventario() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Inventario");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel inventario
		
		panelInventario = new JPanel();
		panelInventario.setBounds(0, 0, 1370, 700);
		panelInventario.setLayout(null);
		panelInventario.setBackground(new Color(209, 234, 249));
		
		//Titulo  inventario
		
		tituloInventario = new JLabel();
		tituloInventario.setText("INVENTARIO");
		tituloInventario.setBounds(560, 100, 250, 42);
		tituloInventario.setForeground(Color.BLACK);
		tituloInventario.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Panel para mostrar inventario
		
		panelMostrarInventario = new JPanel();
		panelMostrarInventario.setBounds(385, 172, 600,300);
		panelMostrarInventario.setLayout(null);
		panelMostrarInventario.setBackground(Color.white);
		
		//Boton para volver al menu de opciones 
		
		botonVolverMenuOpciones = new JButton();
		botonVolverMenuOpciones.setBounds(10, 10, 100, 50);
		botonVolverMenuOpciones.setForeground(Color.BLACK);
		botonVolverMenuOpciones.setText("Volver");
		
		//Boton Para agregar Medicamentos 
		
		botonAgregarMedicamento = new JButton();
		botonAgregarMedicamento.setBounds(475, 500, 200, 70);
		botonAgregarMedicamento.setForeground(Color.BLACK);
		botonAgregarMedicamento.setText("Agregar Medicamento");
		
		//Boton Para eliminar Medicamentos
		
		botonEliminarMedicamento = new JButton();
		botonEliminarMedicamento.setBounds(695, 500, 200, 70);
		botonEliminarMedicamento.setForeground(Color.BLACK);
		botonEliminarMedicamento.setText("Eliminar Medicamento");
		
		
		add(panelInventario);
		panelInventario.add(panelMostrarInventario);
		panelInventario.add(tituloInventario);
		panelInventario.add(botonVolverMenuOpciones);
		panelInventario.add(botonAgregarMedicamento);
		panelInventario.add(botonEliminarMedicamento);
	}


	public JPanel getPanelInventario() {
		return panelInventario;
	}


	public void setPanelInventario(JPanel panelInventario) {
		this.panelInventario = panelInventario;
	}


	public JPanel getPanelMostrarInventario() {
		return panelMostrarInventario;
	}


	public void setPanelMostrarInventario(JPanel panelMostrarInventario) {
		this.panelMostrarInventario = panelMostrarInventario;
	}


	public JLabel getTituloInventario() {
		return tituloInventario;
	}


	public void setTituloInventario(JLabel tituloInventario) {
		this.tituloInventario = tituloInventario;
	}


	public JButton getBotonVolverMenuOpciones() {
		return botonVolverMenuOpciones;
	}


	public void setBotonVolverMenuOpciones(JButton botonVolverMenuOpciones) {
		this.botonVolverMenuOpciones = botonVolverMenuOpciones;
	}


	public JButton getBotonAgregarMedicamento() {
		return botonAgregarMedicamento;
	}


	public void setBotonAgregarMedicamento(JButton botonAgregarMedicamento) {
		this.botonAgregarMedicamento = botonAgregarMedicamento;
	}


	public JButton getBotonEliminarMedicamento() {
		return botonEliminarMedicamento;
	}


	public void setBotonEliminarMedicamento(JButton botonEliminarMedicamento) {
		this.botonEliminarMedicamento = botonEliminarMedicamento;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
