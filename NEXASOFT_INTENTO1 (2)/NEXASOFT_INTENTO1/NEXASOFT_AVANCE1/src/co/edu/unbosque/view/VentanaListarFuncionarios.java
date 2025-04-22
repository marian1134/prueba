package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaListarFuncionarios extends JFrame{
	
	//Atributos
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelListarFuncionario, panelLista;
	private JLabel tituloListaFuncionario;
	private JButton botonVolverListarFuncionario;
	
	//Creacion de la ventana
	
	public VentanaListarFuncionarios() {
		
		setBounds(80, 80, 1370, 700);
		setTitle("Listar Funcionarios");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Listar funcionario
		
		panelListarFuncionario = new JPanel();
		panelListarFuncionario.setBounds(0, 0, 1370, 700);
		panelListarFuncionario.setLayout(null);
		panelListarFuncionario.setBackground(new Color(209, 234, 249));
		
		//Titulo Listar Funcionario
		
		tituloListaFuncionario = new JLabel();
		tituloListaFuncionario.setText("LISTA FUNCIONARIOS");
		tituloListaFuncionario.setBounds(480, 150, 450, 42);
		tituloListaFuncionario.setForeground(Color.BLACK);
		tituloListaFuncionario.setFont(new Font("Open Sans", Font.BOLD, 40));
		
		//Panel Listar Funcionario
		
		panelLista = new JPanel();
		panelLista.setBounds(385, 222, 600,300);
		panelLista.setLayout(null);
		panelLista.setBackground(Color.white);
		
		//Boton volver gestion funcionario
		
		botonVolverListarFuncionario = new JButton();
		botonVolverListarFuncionario.setBounds(10, 10, 100, 50);
		botonVolverListarFuncionario.setForeground(Color.BLACK);
		botonVolverListarFuncionario.setText("Volver");
		
		add(panelListarFuncionario);
		panelListarFuncionario.add(tituloListaFuncionario);
		panelListarFuncionario.add(panelLista);
		panelListarFuncionario.add(botonVolverListarFuncionario);
		
		
	}

	public JPanel getPanelListarFuncionario() {
		return panelListarFuncionario;
	}

	public void setPanelListarFuncionario(JPanel panelListarFuncionario) {
		this.panelListarFuncionario = panelListarFuncionario;
	}

	public JPanel getPanelLista() {
		return panelLista;
	}

	public void setPanelLista(JPanel panelLista) {
		this.panelLista = panelLista;
	}

	public JLabel getTituloListaFuncionario() {
		return tituloListaFuncionario;
	}

	public void setTituloListaFuncionario(JLabel tituloListaFuncionario) {
		this.tituloListaFuncionario = tituloListaFuncionario;
	}

	public JButton getBotonVolverListarFuncionario() {
		return botonVolverListarFuncionario;
	}

	public void setBotonVolverListarFuncionario(JButton botonVolverListarFuncionario) {
		this.botonVolverListarFuncionario = botonVolverListarFuncionario;
	}

}
