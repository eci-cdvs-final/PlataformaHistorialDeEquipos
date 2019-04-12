package edu.cvds.services.impl;

import edu.cvds.entities.Equipo;
import edu.cvds.persistence.EquipoDAO;
import edu.cvds.services.LaboratorioServices;

import java.util.List;

import com.google.inject.Inject;

public class LaboratorioServicesImpl implements LaboratorioServices {
	
	@Inject
	private EquipoDAO equipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		return equipoDAO.listarTodas();
	}
	
	/*@Inject
	private DecanaturaDAO decanaturaDAO;*/

}
