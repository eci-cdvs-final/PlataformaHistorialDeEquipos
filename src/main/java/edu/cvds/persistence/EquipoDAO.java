package edu.cvds.persistence;

import java.util.List;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;

public interface EquipoDAO {

	public List<Equipo> listarTodas();
	
	public void registar(String nombre, String laboratorioId);

	public List<Equipo> equiposActivos();

	public int mayor();


	public List<Equipo> listarLibres();

	public void asociar(String laboratorioid, int equipoid);

	public void desasociar(int id);

	public void darDeBajaEquipo(int equipo);

	public List<Elemento> equipo(int id);


}
