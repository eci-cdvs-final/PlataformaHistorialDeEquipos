package edu.cvds.entities;

public class Laboratorio {
	private String id;
	private String nombre;
	private String descripcion;
	private int capacidadDeEquipos;
	
	public Laboratorio() {
		super();
	}
	
	public Laboratorio(String id, String nombre, String descripcion, int capacidadDeEquipos) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capacidadDeEquipos = capacidadDeEquipos;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidadDeEquipos() {
		return capacidadDeEquipos;
	}
	public void setCapacidadDeEquipos(int capacidadDeEquipos) {
		this.capacidadDeEquipos = capacidadDeEquipos;
	}
	
}
