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

}
