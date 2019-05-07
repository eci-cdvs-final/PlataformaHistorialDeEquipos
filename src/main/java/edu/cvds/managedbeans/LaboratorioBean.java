package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import edu.cvds.entities.Equipo;
import edu.cvds.entities.Laboratorio;
import edu.cvds.services.LaboratorioServices;


@ManagedBean(name = "laboratorioBean")
@SessionScoped
public class LaboratorioBean extends BasePageBean {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	
	private String id;
	private String nombre;
	private String descripcion;
	private int capacidadDeEquipos;
	private boolean activo;
	
	
	public void registrar() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			laboratorioServices.crearLaboratorio(id,nombre,descripcion,capacidadDeEquipos);
		}
		catch(Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", "No fue posible el registro"));
		}
		

	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorioServices.listarLaboratorios();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCapacidadDeEquipos() {
		return capacidadDeEquipos;
	}
	public void setCapacidadDeEquipos(int capacidadDeEquipos) {
		this.capacidadDeEquipos = capacidadDeEquipos;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
