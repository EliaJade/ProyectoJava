package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;


public class JudiasVerdes extends Verdura{
	
	boolean tieneVaina;

	public JudiasVerdes(String procedencia, boolean tieneVaina) {
		super(procedencia);
		this.tieneVaina=tieneVaina;
	}

//	@Override
//	public void limpiar() {
//		super.limpiar();
//		System.out.println("La mesa " + tieneVaina + " se esta limpiando");
//	
//		
//	}

	@Override
	public void desifectar() {
		System.out.println("Se esta desinfectando las judias verdes con " + tieneVaina);
	}
	
	

}
