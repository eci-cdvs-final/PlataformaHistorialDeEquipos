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
	public void registrarElemento(String tipo, String marca,String nombre) {
		elementoMapper.registrarElemento(tipo,marca,nombre);
	}

	@Override
	public List<Elemento> listarTodas() {
		return elementoMapper.listar();
	}
}
