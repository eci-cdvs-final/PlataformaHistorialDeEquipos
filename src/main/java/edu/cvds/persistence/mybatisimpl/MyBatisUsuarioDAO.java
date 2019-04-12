package edu.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.cvds.entities.Usuario;
import edu.cvds.persistence.UsuarioDAO;
import edu.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;

public class MyBatisUsuarioDAO implements UsuarioDAO {
	
	@Inject
	private UsuarioMapper usuarioMapper;

	@Override
	public Usuario getUsuario(String username) {
		
		return usuarioMapper.getUsuario(username);
	}

}
