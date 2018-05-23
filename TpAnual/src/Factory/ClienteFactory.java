package Factory;


import DAO.Implement.ClienteDAOImplFileStream;
import DAO.Implement.ClienteDAOlFileString;
import DAO.Interfaces.ClienteDAO;

public class ClienteFactory {

	public ClienteDAO getImplementation(String s) {
		if(s.equals("fileString")){
			return new ClienteDAOlFileString();
		}else if(s.equals("fileStream")){
			return new ClienteDAOImplFileStream();
		}
		return null;
	
	}

}
