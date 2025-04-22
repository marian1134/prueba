package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FuncionarioDAO;
import co.edu.unbosque.model.persistence.MedicamentoDAO;

public class ClaseX {
	
	private MedicamentoDAO medicamentoDao;
	private FuncionarioDAO funcionarioDAO;

	public ClaseX(MedicamentoDAO medicamentoDao) {
		super();
		this.medicamentoDao = medicamentoDao;
		funcionarioDAO = new FuncionarioDAO();
	}

	public MedicamentoDAO getMedicamentoDao() {
		return medicamentoDao;
	}

	public void setMedicamentoDao(MedicamentoDAO medicamentoDao) {
		this.medicamentoDao = medicamentoDao;
	}

	public FuncionarioDAO getFuncionarioDAO() {
		return funcionarioDAO;
	}

	public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
		this.funcionarioDAO = funcionarioDAO;
	}
	
	
	

}
