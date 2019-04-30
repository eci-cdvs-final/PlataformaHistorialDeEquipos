package edu.cvds.services.impl;


import edu.cvds.entities.Elemento;
import edu.cvds.entities.Equipo;
import edu.cvds.entities.Novedad;
import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.EquipoDAO;
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
	public void registrarEquipo(String nombre) {
		
		equipoDAO.registar(nombre);
	}
	
	@Inject
	private ElementoDAO elementoDAO;

	@Override
	public void registrarElemento(String tipo, String marca,String nombre) {
		elementoDAO.registrarElemento(tipo,marca,nombre);
		
	}
	@Inject
	private NovedadDAO novedadDAO;
	
	@Override
	public void registrarNovedad(int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle)

	{
		
		novedadDAO.registarNovedad(elementoid, equipoid, fecha, titulo, usuarioid, detalle);

		
	}
	
	

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



}
