package edu.cvds.persistence;

import java.util.List;

import edu.cvds.entities.Equipo;

public interface EquipoDAO {

	public List<Equipo> listarTodas();
	
	public void registar(int id, String nombre);

}
