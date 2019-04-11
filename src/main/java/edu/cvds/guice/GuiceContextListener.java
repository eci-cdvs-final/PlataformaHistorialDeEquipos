package edu.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.cvds.persistence.ElementoDAO;
import edu.cvds.persistence.EquipoDAO;
import edu.cvds.persistence.*;
import edu.cvds.persistence.mybatisimpl.*;
import edu.cvds.persistence.mybatisimpl.MyBatisUsuarioDAO;
import edu.cvds.services.LaboratorioServices;
import edu.cvds.services.impl.LaboratorioServicesImpl;



public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.PostgreSQL);

				setEnvironmentId("development");

				setClassPathResource("mybatis-config.xml");
				
                bind(LaboratorioServices.class).to(LaboratorioServicesImpl.class);
                bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
                bind(ElementoDAO.class).to(MyBatisElementoDAO.class);
                bind(EquipoDAO.class).to(MyBatisEquipoDAO.class);
                bind(NovedadDAO.class).to(MyBatisNovedadDAO.class);
                bind(LaboratorioDAO.class).to(MyBatisLaboratorioDAO.class);
			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}