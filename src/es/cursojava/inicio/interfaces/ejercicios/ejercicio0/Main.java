package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;

public class Main implements Desinfectable{

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crearObjeto();
		
	}
	
	public void crearObjeto() {
		Mueble silla1 = new Silla ("","");
		Mueble mesa1 = new Mesa ("","");
		Verdura lechuga1 = new Lechuga ("","");
		Verdura judias1 = new JudiasVerdes("", false) ;
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando" + getClass() );
	}

	@Override
	public void desifectar() {
		System.out.println("Desinfetando" + getClass() );
		
		
	}
	
	

}
