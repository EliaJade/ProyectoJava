package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

public class ClienteAdicto extends Cliente{

	private String mote;
	
	
	public ClienteAdicto(String nombre, String mote) {
		super(nombre);
		this.mote=mote;
	}
}
