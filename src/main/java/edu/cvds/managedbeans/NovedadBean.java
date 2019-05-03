package edu.cvds.managedbeans;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.google.inject.Injector;

import edu.cvds.entities.Equipo;
import edu.cvds.entities.Novedad;
import edu.cvds.services.LaboratorioServices;

/**
 * Bean para la interfaz de usuario de las novedades
 */

@ManagedBean(name = "novedadBean")
@SessionScoped
public class NovedadBean extends BasePageBean {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	
	/*private Injector injector;*/
	private int id;
	private int elementoId;
	private int equipoId;
	private String usuarioId;
	private Date fecha;
	private String detalle;
	private String titulo;
	private String tipo;
	
	public void registrar() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			
		}
		catch(Exception e) {
			
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage("registrarNovedad.xhtml", new FacesMessage("Error", "Es posible que este tratando de ingresar una ID ya registrada"));
		}
		
		if (tipo.equals("Equipo")) {
			laboratorioServices.registrarNovedadEquipo(elementoId, fecha, titulo, usuarioId, detalle);
		}
		else{
			equipoId=laboratorioServices.getEquipoID(elementoId);
			laboratorioServices.registrarNovedadElemento(elementoId, equipoId, fecha, titulo, usuarioId, detalle);
		}
		
	}

	public List<Novedad> getNovedades() {
		return laboratorioServices.listarNovedades();
	}
	
	public List<Novedad> getNovedades2() {
		FacesContext context = FacesContext.getCurrentInstance();
		return laboratorioServices.listarNovedades(equipoId);
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getElementoId() {
		return elementoId;
	}

	public void setElementoId(int elementoId) {
		this.elementoId = elementoId;
	}

	public int getEquipoId() {
		return equipoId;
	}

	public void setEquipoId(int equipoId) {
		this.equipoId = equipoId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}