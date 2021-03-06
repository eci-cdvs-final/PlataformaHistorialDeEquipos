package edu.cvds.managedbeans;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;

import com.google.inject.Inject;
import com.google.inject.Injector;

import edu.cvds.entities.Usuario;
import edu.cvds.services.LaboratorioServices;


@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean extends BasePageBean  {
	
	@Inject
	private LaboratorioServices laboratorioServices;
	
	private Injector injector;
	private String username;
	private String password;
	private Usuario user;
	
	public UsuarioBean() {
		injector = super.getInjector();
		laboratorioServices = injector.getInstance(LaboratorioServices.class);
	}
	
	public void login() {
		
		try {
		
			Subject currentUser = SecurityUtils.getSubject();
			
			String encript = new Sha256Hash(password).toHex();
			UsernamePasswordToken token = new UsernamePasswordToken(username, encript);
			
			token.setRememberMe(true);
		    currentUser.login(token);
		    FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
		}
		catch ( UnknownAccountException uae ) {
		    //username wasn't in the system, show them an error message?
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error","Usuario no encontrado") );
		} catch ( IncorrectCredentialsException ice ) {
		    //password didn't match, try again?
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error","Contraseña incorrecta") );
		}
		catch ( IOException e ) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", "Error de entrada"));
		}
		catch ( Exception e ) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
		
	}
	
	
	public void logout() {
		try {
			SecurityUtils.getSubject().logout();
			FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		try {
			if(SecurityUtils.getSubject().getPrincipal()!=null) FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
		} catch (Exception e) {
		}
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public Usuario getUsuario(){
		try {
			if(SecurityUtils.getSubject().getPrincipal()==null) FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");

		}catch(Exception e) {
		}
		if(user==null && SecurityUtils.getSubject().getPrincipal()!=null) user = laboratorioServices.getUsuario(SecurityUtils.getSubject().getPrincipal().toString());
		return user;
	}
	
	
	public void gotoRegistrarElemento() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("registrarElemento.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	
	public void gotoRegistrarEquipo() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("registrarEquipo.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	public void gotoRegistrarNovedad() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("registrarNovedad.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	public void gotoAsociarElemento() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("asociarElemento.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	public void gotoReporteEquipos() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("reporteEquipos.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	public void gotoReporteElementos() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("reporteElementos.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	
	public void gotoCrearLaboratorio() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("crearLaboratorio.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
	
	public void regresar() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}
	}
}
