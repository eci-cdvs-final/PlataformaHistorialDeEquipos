package edu.cvds.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable{
	private int id;
	private String laboratorioId;
	private boolean activo;
	private ArrayList<Elemento> elementos;
	private ArrayList<Novedad> novedades;
	
	public Equipo() {
		super();
	}

	public Equipo(int id, String laboratorioId,boolean activo, ArrayList<Elemento> elementos, ArrayList<Novedad> novedades) {
		this.setId(id);
		this.setLaboratorioId(laboratorioId);
		this.setActivo(activo);
		this.setElementos(elementos);
		this.setNovedades(novedades);
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

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	public ArrayList<Novedad> getNovedades() {
		return novedades;
	}

	public void setNovedades(ArrayList<Novedad> novedades) {
		this.novedades = novedades;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
