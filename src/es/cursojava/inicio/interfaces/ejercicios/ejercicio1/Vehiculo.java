package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Consultable;

public abstract class Vehiculo extends Id implements Consultable{
	private final static Logger Log = LoggerFactory.getLogger(Vehiculo.class);
	
	String nombre;
	int precio;
	
	
	public Vehiculo(int id, String nombre, int precio) {
		super(id);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public void select() {
		Log.info("Consultando "+ getNombre() + " con el id " + getId());
		
	}
}
