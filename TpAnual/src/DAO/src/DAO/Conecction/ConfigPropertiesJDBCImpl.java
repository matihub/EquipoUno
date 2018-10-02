package DAO.Conecction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertiesJDBCImpl implements IConfigProperties {

	private String dbhost;
	private String dbname;
	private String dbuser;
	private String dbpass;

	private String configFile;
	private Properties config = null;

	public ConfigPropertiesJDBCImpl(String configFile) {
		this.configFile = configFile;
	}

	private String getProperty(String key) throws Exception {
		String retString = config.getProperty(key);
		System.out.println(key);
		System.out.println("resttring : " + retString);
		if (retString == null)
			throw new Exception("No se encontro la propiedad en el archivo de configuracion " + key);
		return retString;
	}

	public void loadConfig() throws Exception {
		this.config = new Properties();
		try {
			config.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			throw new Exception("No se encontro el archivo de configuracion", e);
		} catch (IOException e) {
			throw new Exception("Problema con el archivo de configuracion", e);
		}
		this.dbhost = getProperty(DBHOST);
		this.dbname = getProperty(DBNAME);
		this.dbpass = getProperty(DBPASS);
		this.dbuser = getProperty(DBUSER);

	}

	public String getDBHOST() {
		return this.dbhost;
	}

	public String getDBNAME() {
		return this.dbname;
	}

	public String getDBUSER() {
		return this.dbuser;
	}

	public String getDBPASS() {
		return this.dbpass;
	}

}
