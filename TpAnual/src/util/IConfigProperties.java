package util;

public interface IConfigProperties {

	public static String DBHOST = "dbhost";
	public static String DBNAME = "dbname";
	public static String DBUSER = "dbuser";
	public static String DBPASS = "dbpass";
	
	public String getDBHOST();
	public String getDBNAME();
	public String getDBUSER();
	public String getDBPASS();
	
	public void loadConfig() throws Exception;
}