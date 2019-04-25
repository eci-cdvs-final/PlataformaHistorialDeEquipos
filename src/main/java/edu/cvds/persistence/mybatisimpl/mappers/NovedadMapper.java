package edu.cvds.persistence.mybatisimpl.mappers;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.cvds.entities.Novedad;

public interface NovedadMapper {

	public void registarNovedad(@Param ("id") int id, @Param("elementoid")int elementoid,@Param("equipoid") int equipoid,@Param("fecha") Date fecha, @Param("titulo")String titulo,@Param("usuarioid") String usuarioid,
			@Param("detalle")String detalle);

	public List<Novedad> buscarNovedades();

}
