package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tambor extends Instrumento{
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	
	String material;

	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		material=this.material;
	}
	
	public void afinar() {
		Log.warn("Afinando tambor");
		afinado=true;
	}
	
	public void aporrear() {
//		super.tocar();
		Log.warn("Aporreando tambor");
	}
}
