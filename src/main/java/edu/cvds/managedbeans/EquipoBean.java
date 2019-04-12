package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.cvds.entities.Equipo;
import edu.cvds.services.LaboratorioServices;

/**
 * Bean para la interfaz de usuario de los equipos
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "equipoBean")
@RequestScoped
public class EquipoBean extends BasePageBean {
	
	@Inject
	private LaboratorioServices laboratorioServices;

	public List<Equipo> getEquipos() {
		return laboratorioServices.listarEquipos();
	}
	
}
