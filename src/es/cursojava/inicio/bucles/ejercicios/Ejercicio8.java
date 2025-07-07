package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		System.out.println("EXERCISE 8:");
		
		
		int playerScore = 0;
		int playersPlace = 0;
		int topTen = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many tennis players?");
		int amountOfPlayers = scan.nextInt();
		for (int i = 1; i<=amountOfPlayers; i++ ) {
			
			System.out.println("Write the players place in ATP "+ i);
			 playersPlace = scan.nextInt();
			 if ( playersPlace <= 10) {
				 topTen++;
			 }
			
				
			}
		
		System.out.println("The amount of tennis players that are in the top 10 are " + topTen);
		}
		
		
	}


