package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Equipo;

public interface EquipoMapper {

	public List<Equipo> buscarEquipos();
	
	
	public void registrarEquipo(@Param("nombre") String nombre,@Param("laboratorioId") String laboratorioId);


	public List<Equipo> equiposActivos();


	public Equipo mayor();
}
