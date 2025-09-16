package es.cursojava.inicio.objetos.herencia;

public class Zoologico {
	public static void main(String[] args) {
	
	Vaca v = new Vaca("Sam", 100, 11111L,2);
//	Vaca y = new Animal(null, 0, 0);
	Animal a = new Animal("Animal", 50, 33333333L);
	Animal r = new Vaca ("Juan", 20, 33333L, 2);
	Lobo lobo = new Lobo("Lobo1", 20, 20,20);
	
	r.comer();
	v.comer();
	lobo.comer();
	}
}