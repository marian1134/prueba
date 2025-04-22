package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class MedicamentoDAO {
	
	private ArrayList<MedicamentoDTO> listaMedicamentos;
	private final String SERIAL_NAME = "medicamento.data";//Crea un nombre de la url 

	public MedicamentoDAO() {
	
		BinariosFile.checkFolder();
		listaMedicamentos = new ArrayList<>();
		leerSerializado();
	}
	
	//Mostrar todo
	
	public String mostrarTodo() {
		String rta = "";
		
		if(listaMedicamentos.isEmpty()) {
			return "No hay mascotas en la lista";
		}else {
			for (MedicamentoDTO med : listaMedicamentos) {
				
				rta += med.getNombreMedicamento();
				rta += med.getCantidad();
				rta += med.getPrecio();
				rta += med.getCodigo();
			}
		}
		return rta;
	}
	
	//Agregar
	
	public boolean agregar(MedicamentoDTO newData) {
		
		if(newData!= null) {
			listaMedicamentos.add(newData);
			escribirSerializado();
			return true;
		}else {
			return false;
		}
	}
	
	//Buscar
		public MedicamentoDTO buscar (MedicamentoDTO toFind) {//Retorna un objeto de mascota DTO y recibe una mascotaDTO del usuario
			MedicamentoDTO found = null;//Crea un objeto de macotaDTO y lo inicializa 
			if(!listaMedicamentos.isEmpty()) {//Si la lista de mascotas no esta vacia 
				for (MedicamentoDTO m : listaMedicamentos) {//Recorre la lista de mascotas 
					if(m.getCodigo()==(toFind.getCodigo())) {//busca el nombre en esa posicion y la compara con el nombre que recibe del usuario 
						found = m;// Si es igual, found va a ser igual al objeto en la posicion en el que esta el for
						escribirSerializado();
						return found;// retorna el objeto 
					}else {
						continue;
					}
				}
			}else {
				return null;
			}
			return null;
		}
	
	//Eliminar 

		public boolean eliminar(MedicamentoDTO delete) {// delete es el dato que me trae el usuario para poder borrarlo 
			MedicamentoDTO found = buscar(delete);//Crea una mascota llama el metodo y lo busca
			if (found!= null) {//Verifica que la mascota no sea nula 
				listaMedicamentos.remove(delete);// borra la mascota 
				escribirSerializado();
				return true;
			}else {
				return false;
			}
		}

		public void escribirSerializado() {
			
			BinariosFile.escribirSerializado(SERIAL_NAME, listaMedicamentos);
			
		}

		public void leerSerializado() {
			Object content = BinariosFile.leerSerializado(SERIAL_NAME);//el objeto contenido llama el metodo leer serializado

			if(content == null) {//Verifica que el contenido este vacio
				listaMedicamentos = new ArrayList<>();//Crea un array vacio de mascotas
			}else {
				listaMedicamentos = (ArrayList<MedicamentoDTO>)content;//Se realiza un casting, 
			}
		}

	
}
