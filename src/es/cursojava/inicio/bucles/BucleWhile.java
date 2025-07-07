package es.cursojava.inicio.bucles;

public class BucleWhile {
	
	public static void main(String[] args) {
	
	
		int number = 10;
		while (number>0) {
			number--;
			System.out.println(number);
			if (number%3==0) {
				continue;
			}
			
			number--;
		}
		
		System.out.println("Finished");
	}

}
