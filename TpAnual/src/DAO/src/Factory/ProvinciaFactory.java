package Factory;

import DAO.Implement.ClienteDAOImplFileStream;
import DAO.Implement.ClienteDAOlFileString;
import DAO.Implement.ProvinciaDAOImplFileStream;
import DAO.Implement.ProvinciaDAOImplFileString;
import DAO.Interfaces.ClienteDAO;
import DAO.Interfaces.ProvinciaDAO;

public class ProvinciaFactory {
	
	public ProvinciaDAO getImplementation(String s) {
		if(s.equals("fileString")){
			return new ProvinciaDAOImplFileString();
		}else if(s.equals("fileStream")){
			return new ProvinciaDAOImplFileStream();
		}
		return null;
	
	}
}
