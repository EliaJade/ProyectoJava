package es.cursojava.inicio.objetos.herencia;

public class Animal {

	private String nombre;
	private double peso;
	private long Identificador;
	
//	public Animal () {
//		
//	}
	
	public Animal(String nombre, double peso, long identificador) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		Identificador = identificador;
	}
	
	public void comer() {
		System.out.println("El animal " + this.nombre + " esta comiendo");
	}

	public String getNombre() {
		return nombre;
	}

//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	public double getPeso() {
		return peso;
	}

//	public void setPeso(double peso) {
//		this.peso = peso;
//	}

	public long getIdentificador() {
		return Identificador;
	}

//	public void setIdentificador(long identificador) {
//		Identificador = identificador;
//	}
//	
	
	
}
