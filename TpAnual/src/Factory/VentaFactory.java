package Factory;

import DAO.Implement.VentaDAO;

public class VentaFactory {

	public VentaDAO getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new VentaDAO();
		}
		return null;
	}

}
