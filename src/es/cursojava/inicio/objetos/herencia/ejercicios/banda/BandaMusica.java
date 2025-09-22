package es.cursojava.inicio.objetos.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandaMusica {
	
	private final static Logger Log = LoggerFactory.getLogger(Instrumento.class);
	


	
	public static void main(String[]args) {
		
		
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
		
	}
	
	
	public void empezarConcierto() {
		Instrumento[] instrumento = crearInstrumentos();
		afinarInstrumentos(instrumento);
		tocarInstrumentos(instrumento);
	}
	
	public void afinarInstrumentos(Instrumento[] instrumento) {
		for(Instrumento instrumentos: instrumento) {
			instrumentos.afinar();
		}
		
	}
	
	public void tocarInstrumentos(Instrumento[] instrumentos) {
		
		for(Instrumento instrumento:instrumentos) {
			if(instrumento instanceof Tambor) {

				((Tambor) instrumento).aporrear();
//				Tambor t =(Tambor)instrumento;
//				t.aporrear();
			} else {

				instrumento.tocar();	
			}
			if(instrumento.afinado==false) {
				Log.error("Suena Fatal");
			}
		}
	}
	
	public Instrumento[] crearInstrumentos() {
		Instrumento guitarra = new Guitarra("Guitarra", "cuerda", 6);

		Instrumento guitarraElectrica = new GuitarraElectrica("Guitarra Electrica", "cuerda", 8, 200);

		Instrumento piano = new Piano("Piano", "cuerda y percusion", 6, "Caro");

		Instrumento tambor = new Tambor("Tambor", "percursion", "piel");
//		Tambor t = (Tambor)tambor;
		Instrumento[] instrumentos = {guitarra, guitarraElectrica, piano, tambor};
		return instrumentos;
	}
}
