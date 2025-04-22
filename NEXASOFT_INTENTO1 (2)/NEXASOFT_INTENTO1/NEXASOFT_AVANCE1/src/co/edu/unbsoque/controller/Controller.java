package co.edu.unbsoque.controller;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.FuncionarioDTO;
import co.edu.unbosque.model.Medicamento;
import co.edu.unbosque.model.MedicamentoDTO;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener{

	//Atributos

	private ClaseX claseX;
	private View vista;


	//Constructor

	public  Controller() {

		claseX = new ClaseX(null);
		vista = new View();
		asignarLectores();

	}

	//Run
	public void run() {

		vista.getInicio().setVisible(true);
		claseX.getMedicamentoDao().agregar(new MedicamentoDTO("Acetaminofen", 10, 20, 30));
	}

	//Asignar Lectores

	public void asignarLectores() {
		vista.getInicio().getBotonInicio().addActionListener(this);
		vista.getInicio().getBotonInicio().setActionCommand("botonInicioClick");
		vista.getGestionIngresoPaciente().getBotonAgregarFuncionario().addActionListener(this);
		vista.getGestionIngresoPaciente().getBotonAgregarFuncionario().setActionCommand("botonAgregarFuncionarioClick");
		vista.getGestionIngresoPaciente().getBotonModificarDatos().addActionListener(this);
		vista.getGestionIngresoPaciente().getBotonModificarDatos().setActionCommand("botonModificarDatosClick");
		vista.getAgregarFuncionario().getBotonVolver().addActionListener(this);
		vista.getAgregarFuncionario().getBotonVolver().setActionCommand("botonVolverAgregarFuncionarioClick");
		vista.getActualizarFuncionario().getBotonVolverModificarDatos().addActionListener(this);
		vista.getActualizarFuncionario().getBotonVolverModificarDatos().setActionCommand("botonVolverModificarFuncionarioClick");
		vista.getGestionIngresoPaciente().getBotonBorrarFuncionario().addActionListener(this);
		vista.getGestionIngresoPaciente().getBotonBorrarFuncionario().setActionCommand("botonBorrarFuncionarioClick");
		vista.getBorrarFuncionario().getBotonVolverBorrarFuncionario().addActionListener(this);
		vista.getBorrarFuncionario().getBotonVolverBorrarFuncionario().setActionCommand("botonVolverBorrarFuncionarioClick");
		vista.getGestionIngresoPaciente().getBotonListarFuncionarios().addActionListener(this);
		vista.getGestionIngresoPaciente().getBotonListarFuncionarios().setActionCommand("botonListarFuncionariosClick");
		vista.getListarFuncionarios().getBotonVolverListarFuncionario().addActionListener(this);
		vista.getListarFuncionarios().getBotonVolverListarFuncionario().setActionCommand("botonVolverListarFuncionarios");
		vista.getGestionIngresoPaciente().getBotonIngresar().addActionListener(this);
		vista.getGestionIngresoPaciente().getBotonIngresar().setActionCommand("botonIngresarClick");
		vista.getOpciones().getBotonGenerarTurnoPaciente().addActionListener(this);
		vista.getOpciones().getBotonGenerarTurnoPaciente().setActionCommand("botonGenerarTurnoPacienteClick");
		vista.getGenerarTurno().getBotonModulo().addActionListener(this);
		vista.getGenerarTurno().getBotonModulo().setActionCommand("botonModuloClick");
		vista.getModulo().getBotonVolverModulo().addActionListener(this);
		vista.getModulo().getBotonVolverModulo().setActionCommand("botonVolverModuloClick");
		vista.getGenerarTurno().getBotonVolverGenerarTurnos().addActionListener(this);
		vista.getGenerarTurno().getBotonVolverGenerarTurnos().setActionCommand("botonVolverGenerarTurnos");
		vista.getOpciones().getBotonInventario().addActionListener(this);
		vista.getOpciones().getBotonInventario().setActionCommand("botonInventarioClick");
		vista.getInventario().getBotonVolverMenuOpciones().addActionListener(this);
		vista.getInventario().getBotonVolverMenuOpciones().setActionCommand("botonVolverMenuOpcionesInventarioClick");
		vista.getOpciones().getBotonEstadisticasReportes().addActionListener(this);
		vista.getOpciones().getBotonEstadisticasReportes().setActionCommand("botonEstadisticasReportesClick");
		vista.getEstadisticasReportes().getBotonVolverEstadisticasReportes().addActionListener(this);
		vista.getEstadisticasReportes().getBotonVolverEstadisticasReportes().setActionCommand("botonVolverEstadisticasReportesClick");
		vista.getOpciones().getBotonVolverIngreso().addActionListener(this);
		vista.getOpciones().getBotonVolverIngreso().setActionCommand("botonVolverOpciones");
		vista.getInventario().getBotonAgregarMedicamento().addActionListener(this);
		vista.getInventario().getBotonAgregarMedicamento().setActionCommand("botonVentanaAgregarMedicamentoClick");
		vista.getAgregarMedicamento().getBotonAgregarMedicamento().addActionListener(this);
		vista.getAgregarMedicamento().getBotonAgregarMedicamento().setActionCommand("botonAgregarMedicamentoClick");
		vista.getAgregarMedicamento().getBotonVolverAgregar().addActionListener(this);
		vista.getAgregarMedicamento().getBotonVolverAgregar().setActionCommand("botonVolverAgregrarClick");
		vista.getInicio().getBotonSalir().addActionListener(this);
		vista.getInicio().getBotonSalir().setActionCommand("btnSalir");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {
		case "btnSalir":
			System.exit(0);
			break;
		case "botonInicioClick":
			vista.getInicio().setVisible(false);
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonElegirFuncionario":

			break;

		case "botonAgregarFuncionarioClick":
			vista.getAgregarFuncionario().setVisible(true);
			break;

		case "botonVolverAgregarFuncionarioClick":
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonModificarDatosClick":
			vista.getActualizarFuncionario().setVisible(true);
			break;

		case "botonVolverModificarFuncionarioClick":
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonBorrarFuncionarioClick":
			vista.getBorrarFuncionario().setVisible(true);
			break;

		case "botonVolverBorrarFuncionarioClick":
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonListarFuncionariosClick":
			vista.getListarFuncionarios().setVisible(true);
			break;

		case "botonVolverListarFuncionarios":
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonIngresarClick":
			vista.getOpciones().setVisible(true);
			break;

		case "botonGenerarTurnoPacienteClick":
			vista.getGenerarTurno().setVisible(true);
			break;

		case "botonModuloClick":
			vista.getModulo().setVisible(true);
			break;

		case "botonVolverModuloClick":
			vista.getGenerarTurno().setVisible(true);
			break;

		case "botonVolverGenerarTurnos":
			vista.getOpciones().setVisible(true);
			break;

		case "botonInventarioClick":
			vista.getInventario().setVisible(true);
			break;

		case "botonVolverMenuOpcionesInventarioClick":
			vista.getOpciones().setVisible(true);
			break;

		case "botonEstadisticasReportesClick":
			vista.getEstadisticasReportes().setVisible(true);
			break;

		case "botonVolverEstadisticasReportesClick":
			vista.getOpciones().setVisible(true);
			break;

		case "botonVolverOpciones":
			vista.getGestionIngresoPaciente().setVisible(true);
			break;

		case "botonVentanaAgregarMedicamentoClick":
			vista.getAgregarMedicamento().setVisible(true);
			break;


		case "botonAgregarMedicamentoClick":

			int codigo = Integer.parseInt(vista.getAgregarMedicamento().getEntradaAgregarCodigoMed().getText());
			int cantidad = Integer.parseInt(vista.getAgregarMedicamento().getEntradaAgregarCantidadMed().getText());
			int precio = Integer.parseInt(vista.getAgregarMedicamento().getEntradaAgregarPrecioMed().getText());

			claseX.getMedicamentoDao().agregar(new MedicamentoDTO(vista.getAgregarMedicamento().getEntradaAgregarMedicamento().getText(), codigo, cantidad, precio));


			break;

		case "botonVolverAgregrarClick":
			vista.getInventario().setVisible(true);
			break;

		}
	}

		private void agregarFuncionario() {
			String cedula = vista.getAgregarFuncionario().getEntradaCedulaNuevo().getText();
			String nombre = vista.getAgregarFuncionario().getEntradaAgregarNombre().getText();
			String password = (vista.getAgregarFuncionario().getEntradaCrearContrasena().getText());
			String correo = vista.getAgregarFuncionario().getEntradaCrearContrasena().getText();
			String modulo = vista.getAgregarFuncionario().getEntradaAgregarModulo().getText();
			
			long cedulaN = Long.parseLong(cedula);
			int moduloN = Integer.parseInt(modulo);
			
			claseX.getFuncionarioDAO().agregar(new FuncionarioDTO(nombre, cedulaN, password, correo, moduloN));
			JOptionPane.showMessageDialog(null, "Creado existosamente!");
			
			
			
		}

		private void actualizarFuncionario() {
			
			String cedulaActualizar = vista.getActualizarFuncionario().getEntradaDatoActualizar().getText();
			long cedulaA = Long.parseLong(cedulaActualizar);

			String nombre = vista.getActualizarFuncionario().getEntradaModificarNombreCompleto().getText();
			String cedula = vista.getActualizarFuncionario().getEntradaModificarCedula().getText();
			String contrasena = vista.getActualizarFuncionario().getEntradaModificarContrasena().getText();
			String correo = vista.getActualizarFuncionario().getEntradaModificarCorreo().getText();
			String modulo = vista.getActualizarFuncionario().getEntradaAgregarModulo().getText();
			
			long cedulaN = Long.parseLong(cedula);
			int moduloN = Integer.parseInt(modulo);

			claseX.getFuncionarioDAO().actualizar(new FuncionarioDTO(null, cedulaA, null, null, 0), new FuncionarioDTO(nombre, cedulaN, contrasena, correo, moduloN));
			JOptionPane.showMessageDialog(null, "Actualización exitosa");
			

		}


		private void borrarFuncionario() {
			String cedula = vista.getBorrarFuncionario().getEntradaCedulaBorrar().getText();	
			long cedulaN = Long.parseLong(cedula);
			
			claseX.getFuncionarioDAO().borrar(new FuncionarioDTO(null, cedulaN, null, null, 0));
			JOptionPane.showMessageDialog(null, "Eliminación exitosa");
			
			
		}

		
}
