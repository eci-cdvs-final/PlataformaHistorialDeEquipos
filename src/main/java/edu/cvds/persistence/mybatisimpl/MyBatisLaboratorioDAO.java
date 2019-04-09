package edu.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.cvds.persistence.LaboratorioDAO;
import edu.cvds.persistence.mybatisimpl.mappers.LaboratorioMapper;

public class MyBatisLaboratorioDAO implements LaboratorioDAO {
	
	@Inject
	private LaboratorioMapper laboratorioMapper;

}
