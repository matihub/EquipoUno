package Factory;

import DAO.Implement.AerolineaDAOImplFileStream;
import DAO.Implement.AerolineaDAOlFileString;
import DAO.Implement.VueloDAOImpleFile;
import DAO.Implement.VueloDAOlFileString;

public class VueloFactory {

	public VueloDAOImpleFile getImplementation(String s) {

		if(s.equals("fileString")){
			return new VueloDAOlFileString();
		}else if(s.equals("fileStream")){
			return new VueloDAOImpleFile();
		}
		return null;
	
	

}
