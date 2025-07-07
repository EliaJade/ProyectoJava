package es.cursojava.inicio.bucles.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int number1 = 2;
		int number2 = 99;
		
		System.out.println("EXERCISE 1:");
		
		
		//FOR
		
		for (number1=2 ; number1<=100 ; number1+=2){
			number2-=2;
		System.out.println(number1+","+(
				number2+2));
		}
		
		for (number1=0, number2=0; number1<100; number1+=2, number2-=2) {
			System.out.println(number1 + "," + number2);
		}
		
		
		//WHILE
		
//		while (number1<=100) {
//			System.out.println(number1+","+number2);
//			number1+=2;
//			number2-=2;
//		}
		
		
	}
}
