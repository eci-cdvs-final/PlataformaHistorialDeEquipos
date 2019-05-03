package edu.cvds.managedbeans;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;

import com.google.inject.Injector;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
import edu.cvds.entities.Novedad;
import edu.cvds.services.LaboratorioServices;

/**
 * Bean para la interfaz de usuario de los elementos
 */

@ManagedBean(name = "elementoBean")
@RequestScoped
public class ElementoBean extends BasePageBean  {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	//private Injector injector;
	private int id;
	private String marca;
	private String tipo;
	private String nombre;
	private int idElem;
	private int idEqui=-1;
	
	/*public ElementoBean() {
		injector = super.getInjector();
		laboratorioServices = injector.getInstance(LaboratorioServices.class);
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Elemento> getElementos() {
		return laboratorioServices.listarElementos();
	}
	
	public List<Elemento> elementosLibres() {
		return laboratorioServices.listarElementosLibres();
	}
	
	public List<Elemento> getElementos2() {
		FacesContext context = FacesContext.getCurrentInstance();
		return laboratorioServices.listarElementos(idEqui);
	}
	
	public void registrarElemento() {			
			try {
				FacesContext context = FacesContext.getCurrentInstance();
				laboratorioServices.registrarElemento(tipo, marca,nombre,idEqui);
			}
			catch(Exception e) {
				FacesContext context = FacesContext.getCurrentInstance();
		        context.addMessage(null, new FacesMessage("Error", "Es posible que este tratando de ingresar una ID ya registrada"));
			}
	}
	
	public void asociarElemento() {			
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			laboratorioServices.asociarElemento(idElem, idEqui);
			java.util.Date fecha = new Date();
			laboratorioServices.registrarNovedadElemento(idElem, idEqui, fecha, "Cambio de asociación", laboratorioServices.getUsuario(SecurityUtils.getSubject().getPrincipal().toString()).getUserName(), "Se asocio el elemento registrado con la ID:"+idElem+" al equipo registrado con la ID:"+idEqui);
		}
		catch(Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", "Es posible que este tratando de ingresar una ID ya registrada"));
		}
	}
	
	public void asociarElemento2(int elementoid) {			
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			laboratorioServices.asociarElemento(elementoid, idEqui);
			java.util.Date fecha = new Date();
			laboratorioServices.registrarNovedadElemento(elementoid, idEqui, fecha, "Cambio de asociación", laboratorioServices.getUsuario(SecurityUtils.getSubject().getPrincipal().toString()).getUserName(), "Se asocio el elemento registrado con la ID:"+elementoid+" al equipo registrado con la ID:"+idEqui);
		}
		catch(Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", "Es posible que este tratando de ingresar una ID ya registrada"));
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdElem() {
		return idElem;
	}

	public void setIdElem(int idElem) {
		this.idElem = idElem;
	}

	public int getIdEqui() {
		return idEqui;
	}

	public void setIdEqui(int idEqui) {
		this.idEqui = idEqui;
	}
}
