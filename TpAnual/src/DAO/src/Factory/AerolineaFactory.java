package Factory;


import DAO.Implement.AerolineaDAOImplFileStream;
import DAO.Implement.AerolineaDAOlFileString;
import DAO.Interfaces.AerolineaDAO;

public class AerolineaFactory {

	public AerolineaDAO getImplementation(String s) {
		if(s.equals("fileString")){
			return new AerolineaDAOlFileString();
		}else if(s.equals("fileStream")){
			return new AerolineaDAOImplFileStream();
		}
		return null;
	
	}

}
