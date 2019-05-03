package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;

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
	private String nombre;
	private String laboratorioId;
	private boolean activo;

	/*public EquipoBean() {
		injector = super.getInjector();
		laboratorioServices = injector.getInstance(LaboratorioServices.class);
	}*/
	
	public void registrar() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			laboratorioServices.registrarEquipo(nombre,laboratorioId);
		}
		catch(Exception e) {

			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage("registrarEquipo.xhtml", new FacesMessage("Error", "Es posible que este tratando de ingresar una ID ya registrada"));
		}
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Equipo> equiposActivos() {
		return laboratorioServices.equiposActivos();
	}

	public void regresarReporteEquipos() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("reporteEquipos.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}

	public String getLaboratorioId() {
		return laboratorioId;
	}

	public void setLaboratorioId(String laboratorioId) {
		this.laboratorioId = laboratorioId;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
