package edu.cvds.entities;

public class Elemento {
	private int id;
	private String tipo; 
	private String equipo;
	
	public Elemento() {
		super();
	}

	public Elemento(int id, String tipo, String equipo) {
		this.setId(id);
		this.setTipo(tipo);
		this.setEquipo(equipo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
}
