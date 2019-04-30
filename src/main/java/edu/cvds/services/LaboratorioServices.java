package edu.cvds.services;


import java.util.Date;
import java.util.List;
import edu.cvds.entities.Usuario;
import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
import edu.cvds.entities.Novedad;

public interface LaboratorioServices {

	public List<Equipo> listarEquipos();
	
	public Usuario getUsuario(String username);
	


	
	
	public void registrarNovedad(int elementoid,int equipoid,Date fecha,String titulo,String usuarioid,String detalle);

	public void registrarElemento(String tipo, String marca, String nombre);

	public List<Elemento> listarElementos();

	public void registrarEquipo(String nombre);

	public List<Novedad> listarNovedades();

	public void asociarElemento(int idElem, int idEqui);

	public List<Equipo> equiposActivos();

}	
