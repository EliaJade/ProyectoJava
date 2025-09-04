package es.cursojava.inicio.objetos;

public class Colegio {

	
	public static void main (String[]args) {
		
		Alumno alumno1= new Alumno();
		alumno1.setName("Alumno 1");
		alumno1.setDni("111A");
		alumno1.setNotaMedia(3.2);
		alumno1.setAsignaturas(new String[]{"Mates", "Castellano"});
		
		Alumno alumno2= new Alumno();
		alumno2.setName("Alumno 2");
		alumno2.setDni("222B");
		alumno2.setNotaMedia(7.9);
		alumno2.setAsignaturas(new String[]{"Ingles", "Castellano"});
		
		Alumno alumno3= new Alumno();
		alumno3.setName("Alumno 3");
		alumno3.setDni("333C");
		alumno3.setNotaMedia(9.7);
		alumno3.setAsignaturas(new String[]{"Mates", "Ingles", "Castellano"});
		
		Alumno alumno4 = new Alumno("Alumno 4", "444D"); 
			alumno4.setNotaMedia(4.9);
			alumno4.setAsignaturas(new String[]{"Mates", "Filosofia", "Biologia"});
			
		Alumno alumno5 = new Alumno("Alumno 5", "555E", 7.9, (new String[] {"Ingles", "Filosofia", "Castellano"}));
		
//		alumno1.estudiar();
//		alumno2.estudiar();
//		alumno3.estudiar();
		
		Alumno[] alumnos= {alumno1, alumno2, alumno3, alumno4, alumno5};
		Colegio colegio = new Colegio();
		
		Colegio.estudiarAlumnos(alumnos);
	}
	
	public static void estudiarAlumnos(Alumno[] alumnos) {
		for(Alumno alumno:alumnos) {
			alumno.estudiar();
		}
		
	}
}
