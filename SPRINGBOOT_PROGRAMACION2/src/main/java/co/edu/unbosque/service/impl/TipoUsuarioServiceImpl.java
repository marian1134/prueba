package co.edu.unbosque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.unbosque.entity.TipoUsuario;
import co.edu.unbosque.repository.TipoUsuarioRepository;
import co.edu.unbosque.service.api.TipoUsuarioServiceAPI;
import co.edu.unbosque.utils.GenericServiceImpl;

@Service
public class TipoUsuarioServiceImpl extends GenericServiceImpl<TipoUsuario, Long> implements TipoUsuarioServiceAPI {

	@Autowired
	private TipoUsuarioRepository TipoUsuarioRepository;

	@Override
	public CrudRepository<TipoUsuario, Long> getDao() {
		return TipoUsuarioRepository;
	}
}