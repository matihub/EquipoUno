package Controlador;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import DAO.Interfaces.AerolineaDAO;
import DAO.Interfaces.ClienteDAO;
import DAO.Interfaces.ProvinciaDAO;
import Factory.AerolineaFactory;
import Factory.ClienteFactory;
import Factory.ProvinciaFactory;
import Vista.EntradaSalida;
import Modelo.Aerolinea;
import Modelo.Alianza;
import Modelo.Cliente;
import Modelo.Direccion;
import Modelo.PasajeroFrecuente;
import Modelo.Pasaporte;
import Modelo.Provincia;
import Modelo.Telefono;

import java.util.Scanner;

public class IOCliente {
	
	EntradaSalida es = new EntradaSalida();
	List <Cliente> cliList = new ArrayList<Cliente>();
	List <Provincia> provList = new ArrayList<Provincia>();
	Cliente cl = new Cliente();
	ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
	ProvinciaDAO ProvinciaDAO = new ProvinciaFactory().getImplementation("String");
	AerolineaDAO aerdao = new AerolineaFactory().getImplementation("String");
	public void consultarCliente (int dni ) throws ParseException{
		try {
			   cliList = clienteDAO.getAllCliente();
			   if (cliList.contains(null)){
				   throw new Exception ("no existen cliente");
			   }else {
				   for (int i = 0; i < cliList.size(); i++) {
					    es.pritln(cliList.get(i).getNombre()+"\t"+cliList.get(i).getNombre()+"\t"+cliList.get(i).getCuil()+"\t"+cliList.get(i).getDni()+"\t"+cliList.get(i).getEmail()+"\t"+cliList.get(i));
					   
				} 
				  
				   
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception<
			   EntradaSalida.pritln("no existe archivo clientes");
			 
            	}
	}
	
	
	public void actualizarcliente() throws Exception, Throwable {
		
		
		int dni = es.leerInt("ingrese dni a buscar", "dni invalido");
		cliList = clienteDAO.getAllCliente();
		
		for (int i = 0; i < cliList.size(); i++) {
			if (cliList.get(i).getDni().equals((dni))) {
				
				cliList.set(i,ingresarCliente());
			}
		}
		clienteDAO.modifyCliente(cliList);
		
	}


	public Cliente ingresarCliente() throws Exception, Throwable {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		int dni = es.leerInt("ingrese dni","ingrese dni valido");
		String nombre = es.leerLinea("ingrese nombre");
		String apellido = es.leerFrase("ingrese apellido");
		String cuil = es.leerFrase("ingrese cuil");
		Calendar fechanac = Calendar.getInstance();
		es.pritln("ingrese fecha de nacimiento ");
		int d= es.leerInt("Ingrese dia","ingrese dia valido");
		int m= es.leerInt("Ingrese mes","ingrese dia valido");
		int a= es.leerInt("Ingrese año","ingrese dia valido");
		
		fechanac.set(Calendar.DATE, d);
		fechanac.set(Calendar.MONTH, m-1);
		fechanac.set(Calendar.YEAR, a);
        String mail = validarmail();
		es.pritln("ingrese pasaporte ");
		Pasaporte p =  new Pasaporte();
		p.setApellido(apellido);
		p.setNombre(nombre);
		p.setNroPasaporte(es.leerInt("ingrese numero de pasaporte","pasaporte invalido"));
		p.setSexoPers(es.leerFrase("ingrese sexo M/F"));
		p.setNacionalidad(es.leerFrase("ingrese nacionalidad"));
		
		
		c.setDireccion(ingresardireccion());
		c.setTelefono(ingresarTelefono());
		c.setApellido(apellido);
		c.setNombre(nombre);
		c.setDni(dni);
		c.setCuil(cuil);
		c.setEmail(mail);
		c.setFechanac(fechanac);
		c.setNro_pasaporte(p);
		
			
		
		return c;
	}

    public void borrarcliente() throws FileNotFoundException, IOException {
    	
    	int dni= es.leerInt("Ingresar dni a borrar", "dni invalido");
    	cliList= clienteDAO.getAllCliente();
    	for (int i = 0; i < cliList.size(); i++) {
		 if (cliList.get(i).getDni().equals(dni)) {
			 
			 cliList.remove(i);
			 
			
		} else {
            es.pritln("no se encuentra el cliente a buscar");    
		}
		 clienteDAO.modifyCliente(cliList);
		}
    	
    }


    public Direccion ingresardireccion() throws FileNotFoundException, IOException {
    	es.pritln("ingrese Direccion ");
    	Direccion d = new Direccion();
    	d.setCalle(es.leerFrase("ingrese calle"));
        d.setAltura(es.leerInt("ingrese altura", "ingrese un valor numerico valido"));
        d.setCiudad(es.leerFrase("ingrese ciudad"));
        String pais = es.leerFrase("Ingrese pais");
        d.setPais(pais);
        if (pais.equals("argentina")) {
        	provList = ProvinciaDAO.getAllProvincia();
        	for (int i = 0; i <provList.size(); i++) {
				    es.pritln(provList.get(i).getId()+"--"+provList.get(i).getProvincia());
			}
			int opcion = es.leerInt("ingrese valor 1-23", "valor incorrecto");
			   d.setProvincia(provList.get(opcion).getProvincia());
		} else {
              d.setProvincia(es.leerFrase("ingrese prov/estado/distrito"));
		}
		return d;
    }
	
    
    public Telefono ingresarTelefono () {
    	es.pritln("ingrese telefono");
    	Telefono t = new Telefono();
    	t.setNrocelular(es.leerFrase("ingrese numero celular"));
    	t.setNrolaboral(es.leerFrase("ingrese numero laboral"));
    	t.setNropersonal("ingrese numero laboral");
    	return t;
    }
    
    public PasajeroFrecuente ingresarpsjfr() {
    	Aerolinea aer = new Aerolinea();
    	PasajeroFrecuente psjf = new PasajeroFrecuente();
    	psjf.setNumero(es.leerFrase("ingrese nmumero de pasajeror frecuente"));
    	psjf.setCategoria(es.leerFrase("ingresar categoria"));
    	aer = ingresarAerolinea();
    	psjf.setLineaaerea(aer);
    	psjf.setAlianza(recuperararalianza(aer.getNombre())); 
    	
    	
		return psjf;
    	
    }
    
    
    private Aerolinea ingresarAerolinea() {
         	Aerolinea aer = new Aerolinea();
		    es.pritln("----seleccioner Aerolinea----");
		    
		      
		return aer;
	}


	public String recuperararalianza(String aer) {
		ArrayList<String> al =  new ArrayList<String>();
				String alianza = "sin alianza";
				al = aerdao.getalianza();
				
				for (int i = 0; i < al.size(); i++) {
					String[] straux = al.get(i).split(";");	
					if (straux[1].equals(aer)) {
						alianza=straux[0];
					}
					
				}
		
		return alianza;}
    
    
    
    public String validarmail() {
    	
    		EntradaSalida.pritln("ingrese mail");
		Scanner scan = new Scanner(System.in);
		 String mail = scan.next();
		while (mail.matches("[a-zA-z]+([ '@]+[a-zA-z]+[.com])*")) {
			es.pritln("formato de mail incorrecto");
			mail = scan.next();
		}
		return mail;
    }
}




	
