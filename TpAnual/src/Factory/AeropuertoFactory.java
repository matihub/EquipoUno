package Factory;

import DAO.Implement.ClienteDAOlFileString;
import DAO.Interfaces.*;

public class AeropuertoFactory {

	public AeropuertoDAO getImplementation(String s) {
		if(s.equals("fileString")){
			return (AeropuertoDAO) new ClienteDAOlFileString();
		}
		return null;
	}

}
