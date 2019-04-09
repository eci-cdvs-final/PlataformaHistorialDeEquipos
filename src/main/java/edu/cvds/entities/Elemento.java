package edu.cvds.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Elemento implements Serializable{
	private int id;
	private String tipo; 
	private String equipo;
	private ArrayList<Novedad> novedades;
	
	public Elemento() {
		super();
	}

	public Elemento(int id, String tipo, String equipo, ArrayList<Novedad> novedades) {
		this.setId(id);
		this.setTipo(tipo);
		this.setEquipo(equipo);
		this.setNovedades(novedades);
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

	public ArrayList<Novedad> getNovedades() {
		return novedades;
	}

	public void setNovedades(ArrayList<Novedad> novedades) {
		this.novedades = novedades;
	}
}
