package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadosHospital{

	private final static Logger Log = LoggerFactory.getLogger(Paciente.class);

	private String especialidad;

	
	
	//CONSTR
	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		especialidad= this.especialidad;
	}



	
	
	//GET&SET
	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	//METODOS
	public Enfermo[] diagnosticarPaciente(Paciente[] pacientes, Doctor doctor, Enfermero enfermero,  Habitacion[] habitaciones) {
		boolean estadoDelPaciente; //false meaning sick, true meaning healthy
		int j=0;
		Enfermo[] enfermos = new Enfermo[habitaciones.length];
		for(int i=0 ; i<pacientes.length ; i++) {
			if(j<habitaciones.length) {
				int numero = (int) (Math.random()*10);
				System.out.println(numero);
				if( numero >= 8 ) {
					estadoDelPaciente = false;
					Log.info("En la habitacion " + habitaciones[j].getNumero() + " "+doctor.getNombre() + " atiende al paciente y encuentra que esta enfermo alli se queda hasta que se mejore");
	//				habitaciones[j]=;
					Enfermo enfermo = new Enfermo ( pacientes[i].getNombre(), pacientes[i].getEdad(), "lupus");
					enfermos[j]= enfermo;
					pacientes[i]= null;
					
					j++;
					
				}
				else {
					estadoDelPaciente = true;
					Log.info("En la habitacion " + habitaciones[j].getNumero() +" "+ doctor.getNombre() + " atiende al paciente y encuentra que esta sano");
	
					pacientes[i]= null;
				}
			}
			else {
				Log.error("No hay mas espacio para los pacientes entonces le envia a otro hospital");
			}
		}
		return enfermos;
	}
}
