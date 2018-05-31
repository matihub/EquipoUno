package Factory;

import DAO.Implement.VentaDAOImpleFileString;
import DAO.Interfaces.VentaDAO;

public class VentaFactory {

	public VentaDAO getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new VentaDAOImpleFileString();
		}
		return null;
	}

}
