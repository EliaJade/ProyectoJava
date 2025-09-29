package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;

public class Lechuga extends Verdura{
	
	String tipo;

	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo=tipo;
	}

	@Override
	public void limpiar() {

		System.out.println("La mesa " + tipo + " se esta limpiando");
		
	}

	@Override
	public void desifectar() {
		System.out.println("Se esta desinfectando la lechuga de tipo "+tipo);
		
	}
	
	

}
