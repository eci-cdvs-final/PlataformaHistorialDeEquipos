package edu.cvds.services.impl;


import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
import edu.cvds.entities.Laboratorio;
import edu.cvds.entities.Novedad;
import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.EquipoDAO;
import edu.cvds.persistence.LaboratorioDAO;
import edu.cvds.persistence.NovedadDAO;

import edu.cvds.entities.Usuario;
import edu.cvds.persistence.UsuarioDAO;

import edu.cvds.services.LaboratorioServices;

import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

public class LaboratorioServicesImpl implements LaboratorioServices {

	@Inject
	private UsuarioDAO usuario;
	
	public Usuario getUsuario(String username) {
		return usuario.getUsuario(username);
	}
	
	@Inject
	private EquipoDAO equipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		return equipoDAO.listarTodas();
	}

	@Override
	public void registrarEquipo(String nombre,String laboratorioId) {
		equipoDAO.registar(nombre,laboratorioId);
	}
	
	@Inject
	private ElementoDAO elementoDAO;

	@Override
	public void registrarElemento(String tipo, String marca,String nombre,int idEqui) {
		elementoDAO.registrarElemento(tipo,marca,nombre,idEqui);
		
	}
	@Inject
	private NovedadDAO novedadDAO;
	
	
	
	

	@Override
	public List<Elemento> listarElementos() {
		return elementoDAO.listarTodas();
	}

	@Override
	public List<Novedad> listarNovedades() {

		return novedadDAO.listarTodas();
	}

	@Override
	public void asociarElemento(int idElem, int idEqui) {
		elementoDAO.asociarElemento(idElem,idEqui);
	}

	@Override
	public List<Equipo> equiposActivos() {
		return equipoDAO.equiposActivos();
	}

	@Override
	public List<Novedad> listarNovedades(int equipoId) {
		return novedadDAO.listarTodas(equipoId);
	}

	@Override
	public List<Elemento> listarElementos(int idEqui) {
		return elementoDAO.listarTodas(idEqui);
	}

	@Override
	public List<Elemento> listarElementosLibres() {
		return elementoDAO.listarElementosLibres();
	}

	@Override
	public int mayorEquipo() {
		return equipoDAO.mayor();
	}
	

	@Override
	public void registrarNovedadEquipo(int equipoid, Date fecha, String titulo, String usuarioid, String detalle) {
		novedadDAO.registarNovedadEquipo(equipoid, fecha, titulo, usuarioid, detalle);
		
	}

	@Override
	public void registrarNovedadElemento(int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle) {
		novedadDAO.registarNovedadElemento(elementoid, equipoid, fecha, titulo, usuarioid, detalle);
		
	}

	@Override
	public int getEquipoID(int elementoId) {
		return elementoDAO.getEquipoID(elementoId);
		
	}
	
	@Inject
	private LaboratorioDAO laboratorioDAO;

	@Override
	public List<Laboratorio> listarLaboratorios() {
		return laboratorioDAO.listar();
	}

	@Override
	public void crearLaboratorio(String id, String nombre, String descripcion, int capacidadDeEquipos) {
		laboratorioDAO.crear(id,nombre,descripcion,capacidadDeEquipos);
		
	}

	@Override

	public List<Equipo> listarEquiposDisponibles() {
		return equipoDAO.listarLibres();
	}

	@Override
	public void asociarLaboratorio(String laboratorioid, int equipoid) {
		equipoDAO.asociar(laboratorioid,equipoid);
		
	}

	@Override
	public void desasociarLaboratorio(int id) {
		equipoDAO.desasociar(id);
	}
	
		@Override
	public void darDeBajaEquipo(int equipo) {
		equipoDAO.darDeBajaEquipo(equipo);
		elementoDAO.desasociarDeEquipo(equipo);

	}

		@Override
		public List<Novedad> listarNovedadesElem(int elementoId) {
			return novedadDAO.listarElem(elementoId);
		}

		@Override
		public List<Elemento> listarElemento(int idElem) {
			return elementoDAO.listarElemento(idElem);
		}

		@Override
		public void darDeBajaElemento(int elemento) {
			elementoDAO.darDeBajaElemento(elemento);
		}

}
