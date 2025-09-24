package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

public class Habitacion {

	private int numero;
	private Enfermo enfermo;
	private Paciente paciente;
	
	
	//CONSTR
	public Habitacion(int numero) {
		super();
		this.numero = numero;
//		this.enfermo = enfermo;
	}

	
	//GET&SET

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Enfermo getEnfermo() {
		return enfermo;
	}


	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	
}

