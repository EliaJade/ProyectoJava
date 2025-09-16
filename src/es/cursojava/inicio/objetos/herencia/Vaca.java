package es.cursojava.inicio.objetos.herencia;

public class Vaca extends Animal{

	private int numCuernos;

	

	public Vaca(String nombre, double peso, long identificador, int numCuernos) {
		super(nombre, peso, identificador);
		numCuernos = this.numCuernos;
	}



	public int getNumCuernos() {
		return numCuernos;
	}



	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}
	
	
	public void mugir() {
		System.out.println("La vaca " + this.getNombre() + " esta mugiendo");
	}

	public void comer() {
		System.out.println("La vaca "+ getNombre() + " está pastando");
	}
	
}
