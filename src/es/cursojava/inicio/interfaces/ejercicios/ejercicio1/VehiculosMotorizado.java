package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;


public abstract class VehiculosMotorizado extends Vehiculo implements Encendible, Apagable, Insertable, Updatable {

	String motor;
	
	public VehiculosMotorizado(String id, String nombre, int precio, String motor) {
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
