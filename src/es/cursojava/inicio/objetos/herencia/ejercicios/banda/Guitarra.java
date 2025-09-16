package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarra extends Instrumento {
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	
	
	int numCuerdas;

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		numCuerdas = this.numCuerdas;
	}
	
	public void afinar() {
		super.afinar();
		Log.warn("Afinando guitarra");
//		afinado=true;
	}
	
}
