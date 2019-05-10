package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;

public interface EquipoMapper {

	public List<Equipo> buscarEquipos();
	
	
	public void registrarEquipo(@Param("nombre") String nombre,@Param("laboratorioId") String laboratorioId);


	public List<Equipo> equiposActivos();


	public Equipo mayor();



	public List<Equipo> equiposLibres();
	
	public void asociar(@Param("laboratorioid") String laboratorioid, @Param("equipoid") int equipoid);


	public void desasociar( @Param("id") int id);

	public void darDeBajaEquipo(@Param("equipo")int equipo);


	public List<Elemento> equipo(@Param("id")int id);

}
