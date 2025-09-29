package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;

public abstract class Verdura implements Desinfectable{
	
	String procedencia;

	
	//CONSTR
	public Verdura(String procedencia) {
		super();
		this.procedencia = procedencia;
	}
	
	
	public void limpiar() {
		System.out.println("Primero hemos limpiado las verduras de " +procedencia);
	}
	

}
