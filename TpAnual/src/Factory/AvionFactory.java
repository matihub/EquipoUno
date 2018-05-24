package Factory;

import DAO.Implement.AvionDAO;

public class AvionFactory {

	public AvionDAO getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new AvionDAOJDBCImpl();
		}
		return null;
	}

}
