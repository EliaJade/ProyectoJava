package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import java.util.Random;

public class Utilidades {

	public static TazaCafe crearCafe() {
		String[] tiposDeCafe = {"Cafe solo", "Cappuccino", "Cafe con leche", "Cafe affogato", "Cafe bonbon"};
		Random r = new Random();
		int tipoDeCafeNumero = r.nextInt(tiposDeCafe.length);
		String tipoDeCafe = tiposDeCafe[tipoDeCafeNumero];
		
		double temperatura = r.nextDouble()*100;
		
		TazaCafe cafe = new TazaCafe(tipoDeCafe, temperatura);
		return cafe;
		}
}
