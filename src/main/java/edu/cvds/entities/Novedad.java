package edu.cvds.entities;

import java.util.Date;

public class Novedad {
	private int id;
	private int elementoId;
	private int equipoId;
	private String usuarioId;
	private Date fecha;
	private String detalle;
	private String titulo;
	
	public Novedad() {
		super();
	}

	public Novedad(int id, int elementoId, int equipoId, String usuarioId,Date fecha,String detalle,String titulo) {
		this.setId(id);
		this.setElementoId(elementoId);
		this.setEquipoId(equipoId);
		this.setUsuarioId(usuarioId);
		this.setFecha(fecha);
		this.setDetalle(detalle);
		this.setTitulo(titulo);
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
}
