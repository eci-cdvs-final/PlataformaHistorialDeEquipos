package edu.cvds.persistence;

import java.util.List;

import edu.cvds.entities.Laboratorio;

public interface LaboratorioDAO {

	public List<Laboratorio> listar();

	public void crear(String id, String nombre, String descripcion, int capacidadDeEquipos);

	

}
