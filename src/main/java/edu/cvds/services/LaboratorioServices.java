package edu.cvds.services;


import java.util.Date;
import java.util.List;
import edu.cvds.entities.Usuario;
import edu.cvds.entities.Equipo;

public interface LaboratorioServices {

	public List<Equipo> listarEquipos();
	
	public Usuario getUsuario(String username);
	
	public void registrarElemento(int id, String tipo, String marca);
	
	public void registrarEquipo(int id);
	
	public void registrarNovedad(int id,int elementoid,int equipoid, Date fecha,String titulo,String usuarioid,String detalle);
}	
