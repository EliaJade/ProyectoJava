package es.cursojava.inicio.interfaces.ejercicios.ejercicio0;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crearObjeto();
		
	}
	
	public void crearObjeto() {
		Mueble silla1 = new Silla ("","");
		Mueble mesa1 = new Mesa ("","");
		Verdura lechuga1 = new Lechuga ("","");
		Verdura judias1 = new JudiasVerdes("", true)  ;
		desifectar(lechuga1);
	}

	public void limpiar() {
		System.out.println("Limpiando" + getClass() );
	}

	
	public void desifectar(Desinfectable d) {
		d.limpiar();
		d.desifectar();
		System.out.println("Desinfetando" + getClass() );
		
		
	}

	
	
	

}
