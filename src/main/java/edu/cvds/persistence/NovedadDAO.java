package edu.cvds.persistence;

import java.util.Date;
import java.util.List;

import edu.cvds.entities.Novedad;

public interface NovedadDAO {


	public List<Novedad> listarTodas();

	public List<Novedad> listarTodas(int equipoId);

	public void registarNovedadEquipo(int equipoid, Date fecha, String titulo, String usuarioid, String detalle);

	public void registarNovedadElemento(int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle);

	public List<Novedad> listarElem(int elementoId);

}
