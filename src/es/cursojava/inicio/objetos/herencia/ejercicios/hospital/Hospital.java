package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.objetos.herencia.ejercicios.banda.Tambor;

public class Hospital {

	private final static Logger Log = LoggerFactory.getLogger(Paciente.class);

	private String nombre;
	private Habitacion[] habiaciones = new Habitacion[2];
	private String[] salaDeEspera = new String[3];
	
	
	//CONSTR
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
//		this.habiaciones = habiaciones;
//		this.salaDeEspera = salaDeEspera;
	}

	
	//GET&SET

	public String getNombre() {
		return nombre;
	}


	public Habitacion[] getHabiaciones() {
		return habiaciones;
	}


	public String[] getSalaDeEspera() {
		return salaDeEspera;
	}


	
	//MAIN

	public static void main (String[]args){
		Hospital hospital = new Hospital("Hospital1");
		
		hospital.abrirHospital();

	}
	
	

	//METODOS
	public void abrirHospital() {
		
		Habitacion[] habitaciones = crearHabitaciones();
		Habitacion[] salasDeEspera = crearSalasDeEspera();
		
		Persona[] pacientes = crearPacientes();
		Persona[] empleados = crearEmpleados();
		Persona[][] personas = {pacientes, empleados};
		ficharEmpleados(empleados);
		
//		pasarConsultas(personas, habitaciones, salasDeEspera);

//		Log.warn("Es hora de comer");
//		horaDeComer(personas);
		
		pasarConsultas( empleados, pacientes, habitaciones, salasDeEspera);
//		Doctor.diagnosticarPaciente();
		

	
		
	}
	
	
	
	public void ficharEmpleados(Persona[] empleados) {
		for (Persona empleado : empleados) {
			((EmpleadosHospital) empleado).fichar();
		}
	}
	
	
	public void horaDeComer(Persona[][] personas) {
		
		
	
		for (Persona[] persona : personas) {
			for (Persona persona2 : persona) {

				persona2.comer();
			}
		}
		
	}
	
	public void horaDeComer(Persona[] personas) {
		
		
		
		for (Persona persona : personas) {
			if (persona!=null) {

				persona.comer();
			}
			
//			if(persona instanceof Paciente) {
//
//				((Paciente) persona).comer();
//				persona.comer();
//			}
//			if(persona instanceof Doctor) {
//				((Doctor) persona).comer();
//				persona.comer();
//			}
//			if(persona instanceof Enfermero) {
//				((Enfermero) persona).comer();
//				persona.comer();
//			}
//			if(persona instanceof Enfermo) {
//				((Enfermo) persona).comer();
//				persona.comer();
//			}
		}
		
	}
	
	public Enfermo[] pasarConsultas(Persona[][] persona, Habitacion[] habitaciones, Habitacion[] salaDeEspera) {
		boolean estadoDelPaciente; //false meaning sick, true meaning healthy
		int j=0;
		Enfermo[] enfermos = new Enfermo[habitaciones.length];
		for(int i=0 ; i<persona[0].length ; i++) {
			Log.info("El " + persona[1][1].getNombre() + " ha cogido el paciente " + persona[0][i].getNombre() + " de la sala " + salaDeEspera[i].getNumero());

			
			if(j<habitaciones.length) {
				int numero = (int) (Math.random()*10);
				System.out.println(numero);
				if( numero >= 8 ) {
					estadoDelPaciente = false;
					Log.info("En la habitacion " + habitaciones[j].getNumero() + " "+ persona[1][0].getNombre() + " atiende al paciente y encuentra que esta enfermo alli se queda hasta que se mejore");
//					habitaciones[j]=;
					Enfermo enfermo = new Enfermo ( persona[0][i].getNombre(), persona[0][i].getEdad(), "lupus");
					enfermos[j]= enfermo;
					
					j++;
					
				}
				else {
					estadoDelPaciente = true;
					Log.info("En la habitacion " + habitaciones[j].getNumero() +" "+ persona[1][0].getNombre() + " atiende al paciente y encuentra que esta sano");
					
				}
			}
			else {
				Log.error("No hay mas espacio para los pacientes entonces le envia a otro hospital");
			}
			
			}
		return enfermos;
		
	}
	public Enfermo[] pasarConsultas(Persona[] empleados, Persona[] pacientes, Habitacion[] habitaciones, Habitacion[] salaDeEspera) {
		boolean estadoDelPaciente; //false meaning sick, true meaning healthy
		int j=0;
		Enfermo[] enfermos = new Enfermo[habitaciones.length];
		for(int i=0 ; i<pacientes.length ; i++) {
			Log.info("El " + empleados[1].getNombre() + " ha cogido el paciente " + pacientes[i].getNombre() + " de la sala " + salaDeEspera[i].getNumero());

			
			if(j<habitaciones.length) {
				int numero = (int) (Math.random()*10);
				System.out.println(numero);
				if( numero >= 8 ) {
					estadoDelPaciente = false;
					Log.info("En la habitacion " + habitaciones[j].getNumero() + " "+empleados[0].getNombre() + " atiende al paciente y encuentra que esta enfermo alli se queda hasta que se mejore");
//					habitaciones[j]=;
					Enfermo enfermo = new Enfermo ( pacientes[i].getNombre(), pacientes[i].getEdad(), "lupus");
					enfermos[j]= enfermo;
					pacientes[i]= null;
					Log.warn("Es hora de comer");
					horaDeComer(empleados);
					horaDeComer(pacientes);
					horaDeComer(enfermos);
					j++;
					
				}
				else {
					estadoDelPaciente = true;
					Log.info("En la habitacion " + habitaciones[j].getNumero() +" "+ empleados[0].getNombre() + " atiende al paciente y encuentra que esta sano");

					pacientes[i]= null;
				}
			}
			else {
				Log.error("No hay mas espacio para los pacientes entonces le envia a otro hospital");
			}
			
			}
		return enfermos;
		
	}
	
	public Habitacion[] crearHabitaciones() {
		Habitacion hab1 = new Habitacion(1);
		Habitacion hab2 = new Habitacion(2);
		//añadir texto para que sepamos que se han creado los objetos

		Log.debug("Se ha creado las habitaciones:\n\t" + hab1.getNumero() + "\n\t" + hab2.getNumero());
		
		Habitacion[] habitaciones = {hab1, hab2};
		return habitaciones;
	}
	
	public Habitacion[] crearSalasDeEspera() {
		Habitacion sala1 = new Habitacion(3);
		Habitacion sala2 = new Habitacion(4);
		Habitacion sala3 = new Habitacion(5);

		Log.debug("Se ha creado las salas:\n\t" + sala1.getNumero() + "\n\t" + sala2.getNumero() + "\n\t" + sala3.getNumero());

		Habitacion[] salasDeEspera = {sala1, sala2, sala3};
		return salasDeEspera;
		
	}
	
	public Paciente[] crearPacientes() {
		Paciente paciente1 = new Paciente("Bob", 20, new String[]{"Tos", "Dolor de cabeza"});
		Paciente paciente2 = new Paciente("Juan", 50, new String[]{"Dolor de pecho", "Poca circulacion de sangre en las manos"});
		Paciente paciente3 = new Paciente("Natalia", 38, new String[]{"Dolor de tripa", "Perdida de apetito", "Vomitos"});
		
		Log.debug("Se ha creado los pacientes:\n\t" + paciente1.getNombre() + "\n\t" + paciente2.getNombre() + "\n\t" + paciente3.getNombre());
//		Persona paciente0 = new Persona("Joe", 30);
//		
//		EmpleadosHospital doctor0 = (EmpleadosHospital) paciente0;
		
		Paciente[] pacientes = {paciente1, paciente2, paciente3};
		
		return pacientes;
	}
	
	public EmpleadosHospital[] crearEmpleados() {
		EmpleadosHospital doctor = new Doctor("Dr. Blanco", 34, "Turno de mañana", "Doctor de familia");
		EmpleadosHospital enfermero = new Enfermero("Enfermero Guille", 28, "turno de mañana", 1);
		
		Log.info("Se ha creado los empleados:\n\t" + doctor.getNombre() + "\n\t" + enfermero.getNombre());
		
		EmpleadosHospital[] empleados = {doctor, enfermero};
		
		return empleados;
	}
}
