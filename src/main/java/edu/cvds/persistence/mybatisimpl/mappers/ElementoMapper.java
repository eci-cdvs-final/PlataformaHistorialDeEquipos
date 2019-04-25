package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Elemento;

public interface ElementoMapper {

	public void registrarElemento(@Param("id") int id, @Param("tipo")String tipo,@Param("marca") String marca,@Param("nombre") String nombre);

	public List<Elemento> listar();

}
