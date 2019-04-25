package edu.cvds.services;


import java.util.List;
import edu.cvds.entities.Usuario;
import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;

public interface LaboratorioServices {

	public List<Equipo> listarEquipos();
	
	public Usuario getUsuario(String username);
	
	public void registrarElemento(int id, String tipo, String marca, String nombre);

	public List<Elemento> listarElementos();

	public void registrarEquipo(int id, String nombre);
}	
