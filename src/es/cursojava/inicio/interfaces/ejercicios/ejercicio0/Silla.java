package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;

public class Silla extends Mueble{

	

	String material;

	
	//CONSTR
	
	public Silla(String color, String material) {
		super(color);
		this.material = material;
	}


	@Override
	public void limpiar() {

		System.out.println("La silla " + material + " se esta limpiando");
		
	}
	
	
}
