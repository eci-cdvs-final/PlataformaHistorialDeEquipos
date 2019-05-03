package edu.cvds.persistence;

import java.util.List;

import edu.cvds.entities.Elemento;
import edu.cvds.entities.Novedad;

public interface ElementoDAO {

	void registrarElemento(String tipo, String marca, String nombre, int idEqui);

	List<Elemento> listarTodas();

	void asociarElemento(int idElem, int idEqui);

	List<Elemento> listarTodas(int idEqui);

	List<Elemento> listarElementosLibres();

}
