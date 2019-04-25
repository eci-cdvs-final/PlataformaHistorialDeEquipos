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
	public void registarNovedad(int id, int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle) {
		novedadMapper.registarNovedad(id, elementoid, equipoid, fecha, titulo, usuarioid, detalle);
		
	}

	@Override
	public List<Novedad> listarTodas() {
		return novedadMapper.buscarNovedades();
	}

}
