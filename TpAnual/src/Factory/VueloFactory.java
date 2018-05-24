package negocio.objetos.factory;

import persistencia.dao.implementacion.JDBC.VueloDAOJDBCImpl;
import persistencia.dao.interfaces.VueloDAO;

public class VueloFactory {

	public VueloDAOImpleFile getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new VueloDAOJDBCImpl();
		}
		return null;
	}

}
