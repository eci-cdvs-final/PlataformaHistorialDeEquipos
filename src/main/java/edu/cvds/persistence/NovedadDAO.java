package edu.cvds.persistence;

import java.util.Date;

public interface NovedadDAO {

	public void registarNovedad(int id, int elementoid, int equipoid, Date fecha, String titulo, String usuarioid,
			String detalle);

}
