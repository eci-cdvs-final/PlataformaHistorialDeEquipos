package edu.cvds.services;


import java.util.Date;
import java.util.List;
import edu.cvds.entities.Usuario;
import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
import edu.cvds.entities.Laboratorio;
import edu.cvds.entities.Novedad;

public interface LaboratorioServices {

	public List<Equipo> listarEquipos();
	
	public Usuario getUsuario(String username);
	
	

	public void registrarElemento(String tipo, String marca, String nombre, int idEqui);

	public List<Elemento> listarElementos();

	public void registrarEquipo(String nombre, String laboratorioId);

	public List<Novedad> listarNovedades();

	public void asociarElemento(int idElem, int idEqui);

	public List<Equipo> equiposActivos();

	public List<Novedad> listarNovedades(int equipoId);

	public List<Elemento> listarElementos(int idEqui);

	public List<Elemento> listarElementosLibres();
	
	public int mayorEquipo();

	public void registrarNovedadEquipo(int equipoId, Date fecha, String titulo, String usuarioId,String detalle);
	public void registrarNovedadElemento(int elementoid,int equipoid,Date fecha,String titulo,String usuarioid,String detalle);

	public int getEquipoID(int elementoId);

	public List<Laboratorio> listarLaboratorios();

	public void crearLaboratorio(String id, String nombre, String descripcion, int capacidadDeEquipos);

}	
