package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Paciente extends Persona {
	private final static Logger Log = LoggerFactory.getLogger(Persona.class);
	
	
	String[] sintomas;
	
	
	//CONSTR
	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		sintomas= this.sintomas;
	}

	
	//GET&SET

	public String[] getSintomas() {
		return sintomas;
	}




	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}




	//METODOS
	public void comer() {
		Log.info("Paciente "+ getNombre() +" esta comiendo en la cafeteria");
	}
}
