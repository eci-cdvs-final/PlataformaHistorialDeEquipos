package edu.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.cvds.entities.Laboratorio;
import edu.cvds.persistence.LaboratorioDAO;
import edu.cvds.persistence.mybatisimpl.mappers.EquipoMapper;
import edu.cvds.persistence.mybatisimpl.mappers.LaboratorioMapper;

public class MyBatisLaboratorioDAO implements LaboratorioDAO {
	
	
	@Inject
	private LaboratorioMapper laboratorioMapper;

	@Override
	public List<Laboratorio> listar() {
		return laboratorioMapper.buscarLaboratorios();
	}

	@Override
	public void crear(String id, String nombre, String descripcion, int capacidadDeEquipos) {
		laboratorioMapper.crear(id,nombre,descripcion,capacidadDeEquipos);
		
	}

	

}
