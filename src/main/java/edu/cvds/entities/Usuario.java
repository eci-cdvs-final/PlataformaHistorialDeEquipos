package edu.cvds.entities;

public class Usuario {
	private String userName;
	private String estado;
	private String rol;
	private String correo;
	private String contrasena;
	private String nombreCompleto;
	
	public Usuario() {
		super();
	}

	public Usuario(String userName, String estado,String rol,String correo,String contrasena,String nombreCompleto) {
		this.setUserName(userName);
		this.setEstado(estado);
		this.setRol(rol);
		this.setCorreo(correo);
		this.setContrasena(contrasena);
		this.setNombreCompleto(nombreCompleto);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
}
