package edu.cvds.services;


import java.util.List;
import edu.cvds.entities.Usuario;
import edu.cvds.entities.Equipo;

public interface LaboratorioServices {

	public List<Equipo> listarEquipos();
	Usuario getUsuario(String username);

}