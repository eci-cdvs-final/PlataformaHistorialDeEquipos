package edu.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Usuario;

public interface UsuarioMapper {

	Usuario getUsuario(@Param("username")String username);

}
