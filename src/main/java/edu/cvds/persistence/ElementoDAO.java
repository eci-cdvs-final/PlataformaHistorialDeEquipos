package edu.cvds.persistence;

import java.util.List;

import edu.cvds.entities.Elemento;

public interface ElementoDAO {

	void registrarElemento(int id, String tipo, String marca, String nombre);

	List<Elemento> listarTodas();

}
