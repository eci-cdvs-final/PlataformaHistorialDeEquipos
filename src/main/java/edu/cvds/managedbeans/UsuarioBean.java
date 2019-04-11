package edu.cvds.managedbeans;

import javax.faces.bean.ManagedBean;

import com.google.inject.Inject;

import edu.cvds.services.LaboratorioServices;

@ManagedBean(name = "usuarioBean")
public class UsuarioBean extends BasePageBean  {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	
	private String password;
	
	public void login() {
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
