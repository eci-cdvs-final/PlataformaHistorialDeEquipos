package edu.cvds.persistence;

import edu.cvds.entities.Usuario;

public interface UsuarioDAO {

	Usuario getUsuario(String correo);

}
