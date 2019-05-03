package edu.cvds.persistence.mybatisimpl.mappers;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Novedad;

public interface NovedadMapper {


	public List<Novedad> buscarNovedades();

	public List<Novedad> buscarNovedades2(@Param("equipoid") int equipoId);

	public void registarNovedadEquipo( @Param("equipoid") int equipoid,@Param("fecha") Date fecha, @Param("titulo")String titulo,@Param("usuarioid") String usuarioid,
			@Param("detalle")String detalle);

	public void registarNovedadElemento( @Param("elementoid")int elementoid,@Param("equipoid") int equipoid,@Param("fecha") Date fecha, @Param("titulo")String titulo,@Param("usuarioid") String usuarioid,
			@Param("detalle")String detalle);

}
