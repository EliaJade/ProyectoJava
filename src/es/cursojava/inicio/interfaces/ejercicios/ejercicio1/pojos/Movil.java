package es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.ProductosElectronicos;

public class Movil extends ProductosElectronicos{


	private final static Logger Log = LoggerFactory.getLogger(Movil.class);
	

	String marca;
	
	public Movil(int id, String nombre, int precio, String fechaFabricacion, String marca) {
		super(id, nombre, precio, fechaFabricacion);
		this.marca=marca;
	}

	@Override
	public void apagar() {

		Log.info("Apagando " + getNombre());
		
	}

	@Override
	public void encender() {

		Log.info("Encendiendo " + getNombre());
		
	}

	@Override
	public void insert() {
		Log.info("Insertando el movil con el " + getId());
		
	}

	@Override
	public void update() {
		Log.info("Actualizando el movil con el " + getId());
		
		
	}
	
	
}
