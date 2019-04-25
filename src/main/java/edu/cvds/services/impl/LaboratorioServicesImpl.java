package edu.cvds.services.impl;


import edu.cvds.entities.Equipo;
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
	public void registrarEquipo(int id) {
		equipoDAO.registar(id);
	}
	
	@Inject
	private ElementoDAO elementoDAO;

	@Override
	public void registrarElemento(int id, String tipo, String marca) {
		elementoDAO.registrarElemento(id,tipo,marca);
		
	}
	@Inject
	private NovedadDAO novedadDAO;
	
	@Override
	public void registrarNovedad(int id, int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle)

	{
		
		novedadDAO.registarNovedad(id, elementoid, equipoid, fecha, titulo, usuarioid, detalle);

		
	}
	
	

}
