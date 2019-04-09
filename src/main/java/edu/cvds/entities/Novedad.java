package edu.cvds.entities;

public class Novedad {
	private int id;
	private int elementoId;
	private int equipoId;
	private String usuarioId;
	
	public Novedad() {
		super();
	}

	public Novedad(int id, int elementoId, int equipoId, String usuarioId) {
		this.setId(id);
		this.setElementoId(elementoId);
		this.setEquipoId(equipoId);
		this.setUsuarioId(usuarioId);
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
}
