package edu.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.mybatisimpl.mappers.ElementoMapper;

public class MyBatisElementoDAO implements ElementoDAO {

	@Inject
	private ElementoMapper elementoMapper;
}
