package Factory;

import DAO.Implement.VentaDAOImpleFileString;
import DAO.Implement.VueloDAOlFileString;

public class VueloFactory {

	public VueloDAOlFileString getImplementation(String s) {

		if(s.equals("fileString")){
			return new VueloDAOlFileString();
		}else if(s.equals("fileStream")){
			return new VueloDAOlFileString();
		}
		return null;
	}
}

	
