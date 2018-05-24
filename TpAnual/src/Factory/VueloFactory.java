package Factory;

import DAO.Implement.VueloDAOImpleFile;

public class VueloFactory {

	public VueloDAOImpleFile getImplementation(String s) {
		if (s.equals("jdbc")) {
			return new VueloDAOImpleFile();
		}
		return null;
	}

}
