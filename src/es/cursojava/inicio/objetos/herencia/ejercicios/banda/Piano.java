package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Piano extends Instrumento{
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	

	
	int numeroOctavas;
	String tipoPiano;
	
	
	public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		numeroOctavas=this.numeroOctavas;
		tipoPiano=this.tipoPiano;
	}
	
	public void afinar() {
		super.afinar();
		Log.warn("Afinando piano");
//		afinado=true;
	}
}
