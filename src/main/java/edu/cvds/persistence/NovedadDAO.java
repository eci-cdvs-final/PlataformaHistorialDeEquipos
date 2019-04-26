package edu.cvds.persistence;

import java.util.Date;
import java.util.List;

import edu.cvds.entities.Novedad;

public interface NovedadDAO {

	public void registarNovedad(int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle);

	public List<Novedad> listarTodas();

}
