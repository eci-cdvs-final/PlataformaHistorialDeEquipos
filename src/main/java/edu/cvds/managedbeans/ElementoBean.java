package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.google.inject.Injector;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
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
	private int idEqui;
	
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
	
	public void registrarElemento() {			
			try {
				FacesContext context = FacesContext.getCurrentInstance();
				laboratorioServices.registrarElemento(tipo, marca,nombre);
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
