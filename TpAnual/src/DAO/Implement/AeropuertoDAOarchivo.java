package DAO.Implement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;

import com.sun.java.util.jar.pack.Package.File;
import com.sun.media.jfxmedia.events.NewFrameEvent;

import negocio.objetos.Aeropuerto;
import persistencia.connection.ConfigPropertiesJDBCImpl;
import persistencia.connection.IConfigProperties;
import persistencia.connection.MySQLDBConnection;
import persistencia.dao.interfaces.AeropuertoDAO;

public class AeropuertoDAOarchivo implements AeropuertoDAO {

	private String tabla = "aeropuerto";

	public Aeropuerto getAeropuerto(String nombre) {
		
		Aeropuertos Ap = new Aeropuertos();
		String ruta=("C:\\"+nombre+".txt");
	  
		File f= new File(ruta);
		//si f no existe crearlo (preguntar con el if anterior)
		Scanner sc = null;
		try {
			sc = new Scanner (f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//agregar try
		int i=0;
		String txt="";
		String nombreap = sc.nextLine();
		while (sc.hasNextLine()){
			
			txt= sc.nextLine();
			String [] Partes =txt.split(";");
			int cuil=Integer.parseInt(Partes [0]);
			String nombrejug = Partes[1];
			String apellidojug = Partes[2];
			String empresa = Partes[3];
			
		
			Aeropuerto.setAeropuerto(cuil, nombrejug, apellidojug, empresa);
		      
			
		  
			
		}
		return Aeropuerto;
	}


	

	public Aeropuerto buscarAeropuerto(String search) {
		
		
		Aeropuerto aeropuerto = new Aeropuerto();
		
		
		try {
			config.loadConfig();
			conn = connect.getConnection(config);
			String query = "SELECT * FROM " + tabla + " WHERE nombre LIKE '%" + search + "%' OR pais LIKE '" + search + "' LIMIT 1";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				resultAeropuerto = new Aeropuerto();
				resultAeropuerto.setNombre(rs.getString("nombre"));
				resultAeropuerto.setPais(rs.getString("pais"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultAeropuerto;
	}

	public ArrayList<Aeropuerto> getAeropuertos() {
		
		ArrayList<Aeropuerto> resultArrayList = new ArrayList<Aeropuerto>();
		
		IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
		MySQLDBConnection connect = new MySQLDBConnection();
		Connection conn = null;
		
		try {
			config.loadConfig();
			conn = connect.getConnection(config);
			String query = "SELECT * FROM " + tabla;
			PreparedStatement ps1 = conn.prepareStatement(query);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Aeropuerto aeropuerto = new Aeropuerto();
				aeropuerto.setNombre(rs.getString("nombre"));
				aeropuerto.setPais(rs.getString("pais"));
				resultArrayList.add(aeropuerto);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultArrayList;
	}

	public boolean addAeropuerto(Aeropuerto ap) {
		
		boolean verif = true;
		
	
		
		try {
			String nombre = ap.getNombre();
			String ruta=("C:\\Users\\moncerra\\Desktop\\usal 1er cuatri 2017\\prg avanzada\\guia5\\Guia07\\archivos\\"+nombre+".txt");
			//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
			try{
				File f= new File(ruta);
				f.createNewFile();
				FileWriter fw=new FileWriter(f);
				BufferedWriter bf=new BufferedWriter(fw);
				bf.write("Aeropuerto :"+nombre+"\n");
				bf.newLine();
			
				
				bf.write(this.CodificarAeropuerto(ap+"\n");
				bf.newLine();
					
				bf.close();
				fw.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
			verif = false;
		} finally {
			try {
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return verif;
	}
		
		private String CodificarAeropuerto(Modelo.Aeropuerto ap){
			
			String txt="";
			txt+=String.valueOf(Aeropuerto.id());
			txt+= ";";
			txt+= ap.getNombre();
			txt+= ";";
			txt+= ap.getPais();
			txt+= ";";
			
			return txt;
		}

	public boolean removeAeropuerto(String nombre) {
		
		boolean verificacion = true;
		
		IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
		MySQLDBConnection connect = new MySQLDBConnection();
		Connection conn = null;
		
		try {
			config.loadConfig();
			conn = connect.getConnection(config);
			String query = "DELETE FROM " + tabla + " WHERE nombre = '" + nombre + "'";
			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			verificacion = false;
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return verificacion;
	}

	public boolean modifyAeropuerto(Aeropuerto aeropuerto) {
		
		boolean verificacion = true;
		
		IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
		MySQLDBConnection connect = new MySQLDBConnection();
		Connection conn = null;
		
		try {
			config.loadConfig();
			conn = connect.getConnection(config);
			String query = "UPDATE " + tabla + " SET nombre = '" + aeropuerto.getNombre() + "' , pais = '" + aeropuerto.getPais() + "' WHERE nombre = '" + aeropuerto.getNombre() + "'";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			verificacion = false;
		}
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return verificacion;
	}
}
