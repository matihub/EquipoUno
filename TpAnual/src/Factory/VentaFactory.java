package negocio.objetos.factory;

import persistencia.dao.implementacion.JDBC.VentaDAOJDBCImpl;
import persistencia.dao.interfaces.VentaDAO;

public class VentaFactory {

	public VentaDAO getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new VentaDAOJDBCImpl();
		}
		return null;
	}

}
