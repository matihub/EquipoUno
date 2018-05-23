package negocio.objetos.factory;

import DAO.InterfaceAeropuertoDAO;
import DAO.Implement.ClienteDAOImplFileStream;
import DAO.Implement.ClienteDAOlFileString;

public class AeropuertoFactory {

	public AeropuertoDAO getImplementation(String s) {
		if(s.equals("fileString")){
			return new ClienteDAOlFileString();
		}else if(s.equals("fileStream")){
			return new ClienteDAOImplFileStream();
		}
		return null;
	
	}

}
