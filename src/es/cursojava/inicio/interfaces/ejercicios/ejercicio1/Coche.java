package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coche extends VehiculosMotorizado{

	private final static Logger Log = LoggerFactory.getLogger(Coche.class);
	

	String marca;
	
	public Coche(String id, String nombre, int precio, String motor, String marca) {
		super(id, nombre, precio, motor);
		this.marca=marca;
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
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
		Log.info("Insertando el coche con el " + getId());
		
	}



	@Override
	public void update() {
		Log.info("Actualizando el coche con el " + getId());
		
	}
}
