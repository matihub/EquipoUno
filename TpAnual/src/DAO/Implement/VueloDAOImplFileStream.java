package DAO.Implement;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import DAO.Interfaces.*;
import Modelo.*;
import util.*;



public class VueloDAOImplFileStream implements VueloDAO {
	
    private String root;

    public void VueloDAOImpleFileStream() {
        this.load();
    }

    private void load() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/datos.properties"));
        } catch (Exception e) {
            throw new RuntimeException();
        }

        this.root = properties.getProperty("VueloRoot");
    }

    public boolean create(List<Vuelo> Vuelo) {
        FileIO fileIO = new FileIO(this.root);

        return fileIO.write(Vuelo);
    }

    public List<Vuelo> findAll() {
        FileIO fileIO = new FileIO(this.root);

        Object object = fileIO.read();

        if (object == null) {
            return new ArrayList<Vuelo>();
        }

        return (ArrayList<Vuelo>) fileIO.read();
    }

    public Vuelo findByName(String name) {
        List<Vuelo> Vuelos = this.findAll();

        Vuelo Vuelo = null;

        for (Vuelo VueloRecord : Vuelos) {
            if (VueloRecord.getNroVuelo().equals(name)) {
                Vuelo = VueloRecord;

                break;
            }
        }

        return Vuelo;
    }

    public boolean update(Vuelo Vuelo, Vuelo VueloUpdated) {
        boolean status = false;

        status = this.delete(Vuelo);

        if (!status) {
            return status;
        }

        List<Vuelo> invoices = this.findAll();

        invoices.add(VueloUpdated);

        status = this.create(invoices);

        if (!status) {
            return status;
        }

        return status;
    }

  
    public boolean delete(Vuelo Vuelo) {
        List<Vuelo> Vuelos = this.findAll();

        boolean status = false;

        int i = 0;

        for (Vuelo VueloRecord : Vuelos) {
            if (VueloRecord.getNroVuelo().equals(Vuelo.getNroVuelo())) {
                Vuelo VueloOld = Vuelos.remove(i);

                if (VueloOld != null) {
                    status = true;
                }

                break;
            }

            i++;
        }

        if (status) {
            FileIO fileIO = new FileIO(this.root);

            return fileIO.write(Vuelos);
        }

        return status;
    }

	@Override
	public Vuelo getVuelo(int vue_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vuelo buscarVuelo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Vuelo> getVuelos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addVuelo(Vuelo vue) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVuelo(int vue_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyVuelo(Vuelo vue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Vuelo> getAllVuelo() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vuelo buscarVuelo(String search) {
		// TODO Auto-generated method stub
		return null;
	}
}