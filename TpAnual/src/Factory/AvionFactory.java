package negocio.objetos.factory;

import persistencia.dao.implementacion.JDBC.AvionDAOJDBCImpl;
import persistencia.dao.interfaces.AvionDAO;

public class AvionFactory {

	public AvionDAO getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new AvionDAOJDBCImpl();
		}
		return null;
	}

}
