package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuitarraElectrica extends Guitarra{
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	
	int potencia;

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
		super(nombre, tipo, numCuerdas);
		potencia = this.potencia;
		
		
	}
	
	public void tocar() {
		Log.info("Tocando muy alto");
	}
	
	
}
