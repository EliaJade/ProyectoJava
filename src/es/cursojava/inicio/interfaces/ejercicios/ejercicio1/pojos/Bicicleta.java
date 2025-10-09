package es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Vehiculo;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Deletable;

public class Bicicleta extends Vehiculo implements Deletable{
	private final static Logger Log = LoggerFactory.getLogger(Bicicleta.class);
	
	

	int numMarchas;
	
	public Bicicleta(int id, String nombre, int precio, int numMarchas) {
		super(id, nombre, precio);
		this.numMarchas=numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	@Override
	public void insert() {
		Log.info("Insertando la bicicleta con el " + getId());
		
	}

	@Override
	public void update() {
		Log.info("Actalizando la bicicleta con el " + getId());
		
		
	}

	@Override
	public void delete() {
		Log.info("Borrando la bicicleta con el " + getId());
		
	}

//	@Override
//	public String toString() {
//		return "Bicicleta [numMarchas=" + numMarchas + "]";
//	}
	
	
}
