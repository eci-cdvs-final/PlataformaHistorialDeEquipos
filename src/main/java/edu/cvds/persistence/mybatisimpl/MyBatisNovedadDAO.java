package edu.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.cvds.persistence.NovedadDAO;
import edu.cvds.persistence.mybatisimpl.mappers.NovedadMapper;

public class MyBatisNovedadDAO implements NovedadDAO {
	
	@Inject
	private NovedadMapper novedadMapper;

}
