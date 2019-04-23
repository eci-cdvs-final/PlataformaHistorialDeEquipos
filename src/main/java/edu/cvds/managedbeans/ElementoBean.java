package edu.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.google.inject.Injector;

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
	private Injector injector;
	private int id;
	private String marca;
	private String tipo;
	
	public ElementoBean() {
		injector = super.getInjector();
		laboratorioServices = injector.getInstance(LaboratorioServices.class);
	}

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
	
	public void registrarElemento() {
			laboratorioServices.registrarElemento(id, tipo, marca);
	}
}
