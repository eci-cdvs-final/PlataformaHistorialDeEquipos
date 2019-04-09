package edu.cvds.entities;

public class Equipo {
	private int id;
	private String laboratorioId;
	
	public Equipo() {
		super();
	}

	public Equipo(int id, String laboratorioId) {
		this.setId(id);
		this.setLaboratorioId(laboratorioId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaboratorioId() {
		return laboratorioId;
	}

	public void setLaboratorioId(String laboratorioId) {
		this.laboratorioId = laboratorioId;
	}
}
