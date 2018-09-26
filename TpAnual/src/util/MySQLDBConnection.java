package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnection {
	
	private String dbhost;
	private String dbname;
	private String dbuser;
	private String dbpass;

	public Connection getConnection(IConfigProperties config) throws Exception{
		try {
			this.dbhost = config.getDBHOST();
			this.dbname = config.getDBNAME();
			this.dbpass = config.getDBPASS();
			this.dbuser = config.getDBUSER();
			
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new Exception("Error al cargar el driver",e);
	}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+dbhost+":3306/"+dbname,dbuser,dbpass);
		} catch (SQLException e) {
			System.out.println("jdbc:mysql://"+dbhost+":3306/"+dbname);
			throw new Exception("Error al generar la conexion", e);
		}
		return con;
	}
}
