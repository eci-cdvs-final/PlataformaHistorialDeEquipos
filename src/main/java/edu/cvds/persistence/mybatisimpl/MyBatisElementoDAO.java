package edu.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.cvds.entities.Elemento;
import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.mybatisimpl.mappers.ElementoMapper;

public class MyBatisElementoDAO implements ElementoDAO {

	@Inject
	private ElementoMapper elementoMapper;

	@Override
	public void registrarElemento(String tipo, String marca,String nombre,int idEqui) {
		if (idEqui==-1) { 
			elementoMapper.registrarElemento(tipo,marca,nombre);
		}
		else {
			elementoMapper.desasociarElemento2(idEqui,tipo);
			elementoMapper.registrarElementoConEquipo(tipo,marca,nombre,idEqui);
		}
	}

	@Override
	public List<Elemento> listarTodas() {
		return elementoMapper.listar();
	}

	@Override
	public void asociarElemento(int idElem, int idEqui) {
		elementoMapper.desasociarElemento(idElem,idEqui);
		elementoMapper.asociarElemento(idElem,idEqui);
	}

	@Override
	public List<Elemento> listarTodas(int idEqui) {
		return elementoMapper.listar2(idEqui);
	}

	@Override
	public List<Elemento> listarElementosLibres() {
		return elementoMapper.listarElementosLibres();
	}

	@Override
	public int getEquipoID(int elementoId) {
		return Integer.parseInt(elementoMapper.getEquipoID(elementoId).getEquipo());
		
	}

}
