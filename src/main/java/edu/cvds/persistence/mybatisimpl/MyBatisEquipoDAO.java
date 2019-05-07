package edu.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.cvds.entities.Equipo;
import edu.cvds.persistence.EquipoDAO;
import edu.cvds.persistence.mybatisimpl.mappers.EquipoMapper;

public class MyBatisEquipoDAO implements EquipoDAO {
	
	@Inject
	private EquipoMapper equipoMapper;

	@Override
	public List<Equipo> listarTodas() {
		return equipoMapper.buscarEquipos();
	}

	@Override
	public void registar(String nombre,String laboratorioId) {
		equipoMapper.registrarEquipo(nombre,laboratorioId);
	}

	@Override
	public List<Equipo> equiposActivos() {
		return equipoMapper.equiposActivos();
	}

	@Override
	public int mayor() {
		return equipoMapper.mayor().getId();
	}

	@Override
	public List<Equipo> listarLibres() {
		return equipoMapper.equiposLibres();
	}

	
	@Override
	public void asociar(String laboratorioid, int equipoid) {
		equipoMapper.asociar(laboratorioid, equipoid);
		
	}

	@Override
	public void desasociar(int id) {
		equipoMapper.desasociar(id);
		
	}
}
