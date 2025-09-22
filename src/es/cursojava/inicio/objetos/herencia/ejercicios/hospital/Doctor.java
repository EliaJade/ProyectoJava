package es.cursojava.inicio.objetos.herencia.ejercicios.hospital;

public class Doctor extends EmpleadosHospital{

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
//	public Enfermo diagnosticarPaciente(Paciente) {
//		return;
//	}
}
