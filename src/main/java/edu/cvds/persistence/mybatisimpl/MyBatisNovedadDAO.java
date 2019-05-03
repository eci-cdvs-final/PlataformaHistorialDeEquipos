package edu.cvds.persistence.mybatisimpl;

import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.cvds.entities.Novedad;
import edu.cvds.persistence.NovedadDAO;
import edu.cvds.persistence.mybatisimpl.mappers.NovedadMapper;

public class MyBatisNovedadDAO implements NovedadDAO {
	
	@Inject
	private NovedadMapper novedadMapper;



	@Override
	public List<Novedad> listarTodas() {
		return novedadMapper.buscarNovedades();
	}

	@Override
	public List<Novedad> listarTodas(int equipoId) {
		return novedadMapper.buscarNovedades2(equipoId);
	}

	@Override
	public void registarNovedadEquipo(int equipoid, Date fecha, String titulo, String usuarioid, String detalle) {
		 java.sql.Date fecha2 = new java.sql.Date(fecha.getTime());
			novedadMapper.registarNovedadEquipo(equipoid, fecha2, titulo, usuarioid, detalle);
		
	}

	@Override
	public void registarNovedadElemento(int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle) {
		 java.sql.Date fecha2 = new java.sql.Date(fecha.getTime());
			novedadMapper.registarNovedadElemento( elementoid, equipoid, fecha2, titulo, usuarioid, detalle);
		
	}

}
