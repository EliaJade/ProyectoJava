package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

public class BandaMusica {
	
	

	
	public static void main(String[]args) {
		
		
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
		
		
	}
	
	
	public void empezarConcierto() {
		Instrumento guitarra = new Guitarra("Guitarra", "cuerda", 6);

		Instrumento guitarraElectrica = new GuitarraElectrica("Guitarra Electrica", "cuerda", 8, 200);

		Instrumento piano = new Piano("Guitarra", "cuerda y percusion", 6, "Caro");

		Instrumento tambor = new Guitarra("Guitarra", "percursion", 6);
	}
	
	public void afinarInstrumentos() {
		
	}
}
