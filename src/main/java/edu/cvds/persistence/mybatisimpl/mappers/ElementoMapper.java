package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;

public interface ElementoMapper {

	public void registrarElemento(@Param("tipo")String tipo,@Param("marca") String marca,@Param("nombre") String nombre);

	public void registrarElementoConEquipo(@Param("tipo")String tipo,@Param("marca") String marca,@Param("nombre") String nombre,@Param("idEqui") int idEqui);
	
	public List<Elemento> listar();

	public void asociarElemento(@Param("idElem")int idElem, @Param("idEqui")int idEqui);

	public void desasociarElemento(@Param("idElem")int idElem, @Param("idEqui")int idEqui);

	public List<Elemento> listar2(@Param("idEqui") int idEqui);

	public List<Elemento> listarElementosLibres();

	public void desasociarElemento2(@Param("idEqui")int idEqui, @Param("tipo")String tipo);

	public Elemento getEquipoID(@Param("elementoId") int elementoId);

}
