package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital{

	private int planta;

	
	//CONSTR
	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		planta = this.planta;
	}

	//GET&SET
	public int getPlanta() {
		return planta;
	}


	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	//METODOS
	public void atenderPaciente() {
		
	}
	
}
