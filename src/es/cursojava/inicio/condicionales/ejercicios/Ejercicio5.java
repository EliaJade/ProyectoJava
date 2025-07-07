package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		double priceTotal = 0;
		double priceByMinute = 0;
		double priceByDate = 0;
		double priceByTime = 0;
		 
		System.out.println("EXERCISE 5:");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How long was the call? (in minutes)");
		int minute = scan.nextInt();
		
		scan = new Scanner(System.in);
		
		System.out.println("What day of the week was the call made?");
		String date = scan.nextLine();
		
		scan = new Scanner(System.in);
		
		System.out.println("What time of the day was the call made?");
		double time = scan.nextDouble();
		
		//double time = 12.30;
				
		if (minute<=5) {
			priceByMinute = 100; 
		} 
		else if (minute<=8) {
			priceByMinute = 100 + 80;
		}
		else if (minute<=10) {
			priceByMinute = 100 + 80 + 70;
		} else {
			priceByMinute = 100 + 80 + 70 + 50*(minute-10);
		}
		
		System.out.println("The price of the call without tax is " + priceByMinute/100 + " euro");
		
		if (time<=6) {
			priceByTime = -(priceByMinute*0.1);
		}
		else if (time<=12) {
			priceByTime = (priceByMinute*0.15);			
		}
		else if (time<24) {
			priceByTime = (priceByMinute*0.1);			
		}
		else {
			System.out.println("That time doesn't exist");
		}
		
		if (date.equalsIgnoreCase("Sunday")) {
			priceByDate = priceByMinute*(0.03);
			priceByTime = 0;
		}
		else if (date.equalsIgnoreCase("Monday") || date.equalsIgnoreCase("Tuesday") || date.equalsIgnoreCase("wednesday") || date.equalsIgnoreCase("thursday") || date.equalsIgnoreCase("friday") || date.equalsIgnoreCase("saturday")) {
			priceByDate = 0;
		}
		else {
			System.out.println("That day doesn't exist");
		}
		
		System.out.println("The cost of the call with tax is " + (priceByMinute + priceByDate + priceByTime)/100 + " euro");
		
		System.out.println("You must pay " + (priceByMinute + priceByDate + priceByTime) / 100 + " euros for your call.");
		
		
		
//		switch (minute) {
//		
//		case 1 : 
//		case 2 : 
//		case 3 : 
//		case 4 : 
//		case 5 : price = 100; break;
//		case 6 : 
//		case 7 : 
//		case 8 : price = 100 + 80; break;
//		case 9 :
//		case 10 : price = 100 + 80 + 70;
//		
//		
//		}
		
	}
}
