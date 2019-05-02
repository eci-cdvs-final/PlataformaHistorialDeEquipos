package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Elemento;

public interface ElementoMapper {

	public void registrarElemento(@Param("tipo")String tipo,@Param("marca") String marca,@Param("nombre") String nombre);

	public List<Elemento> listar();

	public void asociarElemento(@Param("idElem")int idElem, @Param("idEqui")int idEqui);

	public void desasociarElemento(@Param("idElem")int idElem, @Param("idEqui")int idEqui);

	public List<Elemento> listar2(@Param("idEqui") int idEqui);

	public List<Elemento> listarElementosLibres();

}
