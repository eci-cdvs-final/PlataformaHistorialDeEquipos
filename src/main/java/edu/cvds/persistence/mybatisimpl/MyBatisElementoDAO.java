package edu.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.mybatisimpl.mappers.ElementoMapper;

public class MyBatisElementoDAO implements ElementoDAO {

	@Inject
	private ElementoMapper elementoMapper;

	@Override
	public void registrarElemento(int id, String tipo, String marca) {
		elementoMapper.registrarElemento(id,tipo,marca);
	}
}
