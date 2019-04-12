package edu.cvds.services.impl;

import edu.cvds.entities.Usuario;
import edu.cvds.persistence.UsuarioDAO;
import edu.cvds.services.LaboratorioServices;
import com.google.inject.Inject;

public class LaboratorioServicesImpl implements LaboratorioServices {

	@Inject
	private UsuarioDAO usuario;
	
	public Usuario getUsuario(String username) {
		return usuario.getUsuario(username);
	}
	
	/*@Inject
	private DecanaturaDAO decanaturaDAO;*/

}
