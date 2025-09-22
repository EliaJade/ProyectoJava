package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {
	private final static Logger Log = LoggerFactory.getLogger(Persona.class);

	
	private String enfermedad;

	//CONSTR
	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		enfermedad=this.enfermedad;
		
		
	}
	
	
	//GET&SET
	
	public String getEnfermedad() {
		return enfermedad;
	}




	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}




	//METODOS
	public void comer() {
		Log.info("Enfermo " + getNombre() + "esta comiendo en la habitacion");
	}
}
