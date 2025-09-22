package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Instrumento {
	
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	
	
	String nombre;
	String tipo;
	boolean afinado = false;
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	public String getTipo() {
		return tipo;
	}
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
	public boolean getAfinado() {
		return afinado;
	}
//	public void setAfinado(boolean afinado) {
//		this.afinado = afinado;
//	}

	public void afinar() {
		double numero = Math.random();
		if(numero>=0.4) {
			afinado=true;

			Log.info("El instrumento "+ nombre + " esta afinado");
		} else   {
			afinado = false;

			Log.error("El instrumento "+ nombre + " no esta afinado");
		}
		
	}
	
	public void tocar() {
		Log.info("Tocando " + nombre);
		
	}
	
}
