package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.BinariosFile;
import co.edu.unbosque.model.FuncionarioDTO;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
	private List<FuncionarioDTO> funcionarios;
	private final String SERIAL_NAME = "funcionarios.data";

	public FuncionarioDAO() {
		BinariosFile.checkFolder();
		funcionarios = new ArrayList<>();
		leerSerializado(); 
		
	}

	public void agregar(FuncionarioDTO nuevoFuncionario) {
		FuncionarioDTO found = buscarPorCedula(nuevoFuncionario);
		if(found == null) {
			funcionarios.add(nuevoFuncionario);
			escribirSerializado();
		}
	}

	public FuncionarioDTO buscarPorCedula(FuncionarioDTO toFind) {
		FuncionarioDTO found = null;
		if(toFind != null) {
			for (FuncionarioDTO funcionario : funcionarios) {
				if (funcionario.getCedula() == toFind.getCedula()) {
					found = funcionario;
					return found;
				}else {
					continue;
				}
			}
		}else {
			return null;
		}
		return null;
	}

	public void actualizar (FuncionarioDTO previous, FuncionarioDTO funcionarioModificado) {
		FuncionarioDTO found = buscarPorCedula(previous);
		if(found != null) {
			funcionarios.remove(found);
			funcionarios.add(funcionarioModificado);
			escribirSerializado();

		}

	}

	public boolean borrar(FuncionarioDTO toDelete) {
		FuncionarioDTO funcionario = buscarPorCedula(toDelete);
		if (funcionario != null) {
			funcionarios.remove(funcionario);
			escribirSerializado();
			return true;
		}
		return false;
	}

	public List<FuncionarioDTO> listar() {
		return funcionarios;
	}


	public void escribirSerializado() {
		BinariosFile.escribirSerializado(SERIAL_NAME, funcionarios);
	}

	private void leerSerializado() {
		Object content = BinariosFile.leerSerializado(SERIAL_NAME);
		if(content == null) {
			funcionarios = new ArrayList<>();
		}else {
			funcionarios = (ArrayList<FuncionarioDTO>)content;
		}
	}
}
