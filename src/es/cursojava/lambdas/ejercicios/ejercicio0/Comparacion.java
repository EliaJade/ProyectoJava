package es.cursojava.lambdas.ejercicios.ejercicio0;

public class Comparacion {

	public static void main(String[] args) {
		
		String cadena1 = "Hola";
		String cadena2 = "Holiwis";
		ComparaCadenas comparacionLambda = (s1) -> s1.length() <5;
		System.out.println(comparacionLambda.comparar(cadena2));
		System.out.println(comparacionLambda.comparar(cadena1));
		ComparaCadenas contieneTextLambda = s1 -> (s1.contains("Hola")||s1.contains("Holi"));
		System.out.println(contieneTextLambda.comparar(cadena2));
		System.out.println(contieneTextLambda.comparar(cadena1));
		
		
	}
}
