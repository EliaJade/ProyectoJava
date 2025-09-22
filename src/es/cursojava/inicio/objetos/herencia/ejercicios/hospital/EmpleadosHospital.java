package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpleadosHospital extends Persona {
	private final static Logger Log = LoggerFactory.getLogger(Persona.class);

	private String turno;

	
	
	//CONSTR
	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		turno=this.turno;
	}


	//GET&SET
	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
	//METODOS
	public void fichar() {
		Log.info("El empleado " + getNombre() + " está fichando");
	}
	
	public void comer() {
		Log.info("El empleado " + getNombre() + " está comiendo en el comedor");
	}
}
