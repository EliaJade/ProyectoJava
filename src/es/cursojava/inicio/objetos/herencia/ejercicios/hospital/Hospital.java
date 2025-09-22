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

//		horaDeComer();
	}
	
	

	//METODOS
	public void abrirHospital() {
		
		crearHabitaciones();
		crearSalasDeEspera();
		
		crearPacientes();
		ficharEmpleados(crearEmpleados());
		
		///crear un array de personas para devolverlo y usarlo en hora de comer
		
	}
	
	
	
	public void ficharEmpleados(EmpleadosHospital[] empleados) {
		for (EmpleadosHospital empleado : empleados) {
			empleado.fichar();
		}
	}
	
	
	public void horaDeComer(Persona[] personas) {
		
		Log.warn("Es hora de comer");
		
	
		for (Persona persona : personas) {
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
			persona.comer();
		}
		
	}
	
	public void pasarConsultas() {
		
	}
	
	public Habitacion[] crearHabitaciones() {
		Habitacion hab1 = new Habitacion(1);
		Habitacion hab2 = new Habitacion(2);
		//añadir texto para que sepamos que se han creado los objetos
		
		
		Habitacion[] habitaciones = {hab1, hab2};
		return habitaciones;
	}
	
	public Habitacion[] crearSalasDeEspera() {
		Habitacion sala1 = new Habitacion(3);
		Habitacion sala2 = new Habitacion(4);
		Habitacion sala3 = new Habitacion(5);

		Habitacion[] salasDeEspera = {sala1, sala2, sala3};
		return salasDeEspera;
		
	}
	
	public Paciente[] crearPacientes() {
		Paciente paciente1 = new Paciente("Bob", 20, new String[]{"Tos", "Dolor de cabeza"});
		Paciente paciente2 = new Paciente("Juan", 50, new String[]{"Dolor de pecho", "Poca circulacion de sangre en las manos"});
		Paciente paciente3 = new Paciente("Natalia", 38, new String[]{"Dolor de tripa", "Perdida de apetito", "Vomitos"});
		
//		Persona paciente0 = new Persona("Joe", 30);
//		
//		EmpleadosHospital doctor0 = (EmpleadosHospital) paciente0;
		
		Paciente[] pacientes = {paciente1, paciente2, paciente3};
		
		return pacientes;
	}
	
	public EmpleadosHospital[] crearEmpleados() {
		EmpleadosHospital doctor = new Doctor("Dr. Blanco", 34, "Turno de mañana", "Doctor de familia");
		EmpleadosHospital enfermero = new Enfermero("Enfermero Guille", 28, "turno de mañana", 1);
		
		EmpleadosHospital[] empleados = {doctor, enfermero};
		
		return empleados;
	}
}
