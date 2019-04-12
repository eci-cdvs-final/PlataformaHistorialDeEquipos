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

@SuppressWarnings("deprecation")
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
	
}
