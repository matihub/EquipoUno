package DAO.Conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnection {
	
	private String dbhost ;
	private String dbname;
	private String dbinstance;
	private String dbuser ;
	private String dbpass;

	public Connection getConnection(IConfigProperties config) throws Exception{
		 Connection con = null;
		 System.out.println("probando...........................");
		 try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		 System.out.println("driver ");
			} catch(Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Error con el driver ",e);
			}
		 try {
			 con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1\\SQLEXPRESS;databaseName=TPAeropuerto","sa","1234");
					 
		 if (!con.isClosed()) {
			 System.out.println("conexion establecida");
			//con.close();
			// System.out.println("conexion cerrada");
		 	}
		 }catch(SQLException e) {
			 e.printStackTrace();	
		 }
		 return con;
		}
}
