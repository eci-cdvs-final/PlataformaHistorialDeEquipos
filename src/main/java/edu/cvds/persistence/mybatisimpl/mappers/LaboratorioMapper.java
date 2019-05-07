package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Laboratorio;

public interface LaboratorioMapper {

	public List<Laboratorio> buscarLaboratorios();

	public void crear(@Param("id") String id,@Param("nombre") String nombre,@Param("descripcion") String descripcion,@Param("capacidadDeEquipos") int capacidadDeEquipos);

	

	
}
