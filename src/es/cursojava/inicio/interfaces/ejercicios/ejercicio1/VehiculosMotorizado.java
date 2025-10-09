package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Apagable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Encendible;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Insertable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Updatable;

public abstract class VehiculosMotorizado extends Vehiculo implements Encendible, Apagable, Insertable, Updatable {

	String motor;
	
	public VehiculosMotorizado(int id, String nombre, int precio, String motor) {
		super(id, nombre, precio);
		this.motor=motor;
	}
	
	

	public String getMotor() {
		return motor;
	}



	public void setMotor(String motor) {
		this.motor = motor;
	}



	

}
