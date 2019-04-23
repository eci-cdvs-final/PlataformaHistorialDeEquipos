package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.google.inject.Injector;

import edu.cvds.entities.Equipo;
import edu.cvds.services.LaboratorioServices;

/**
 * Bean para la interfaz de usuario de los equipos
 */

@ManagedBean(name = "equipoBean")
@SessionScoped
public class EquipoBean extends BasePageBean {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	
	
	/*private Injector injector;*/
	private int id;

	
	/*public EquipoBean() {
		injector = super.getInjector();
		laboratorioServices = injector.getInstance(LaboratorioServices.class);
	}*/
	
	public void registrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		laboratorioServices.registrarEquipo(id);
	}

	public List<Equipo> getEquipos() {
		return laboratorioServices.listarEquipos();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	
	
	
	
}
