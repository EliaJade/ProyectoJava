package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioRuleta {
	
	public static void main(String[]args) {
	
		System.out.println("EXERCISE 4:");
		
	//Variables
		
		String action = "";
		int randomNumber;
		double moneyBet;
		int numberBet;
		String option = "";
		
		
		int betOptionChoose = 0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("\nHow much money do you have?");
		double moneyAmount = scan.nextDouble();
		scan = new Scanner (System.in);
		
		
		while (moneyAmount>0) {
			randomNumber =  (int) (Math.random()*37);
			System.out.println(randomNumber);
			System.out.println("\nWould you like to bet?");
			 	action = scan.nextLine();
			 	scan = new Scanner (System.in);
			 if (action.equalsIgnoreCase("no")){
				 break;
			 }
			 
			 while (action!="no") {
				 System.out.println("\nWhat would you like to bet on?\n----------------------------------\n\n1. A number\n2. Even numbers");
				 System.out.println("3. Odd numbers");
				 System.out.println("4. 1-12");
				 System.out.println("5. 12-24");
				 System.out.println("6. 24-36\n\n----------------------------------");
				 betOptionChoose = scan.nextInt();
				 	scan = new Scanner (System.in);
				 	
				 	
				 	option =  switch (betOptionChoose) {
				 	case 1 -> "a number";
				 	case 2 -> "even numbers";
				 	case 3 -> "odd numbers";
				 	case 4 -> "1-12";
				 	case 5 -> "12-24";
				 	case 6 -> "24-36";
				 	default -> "\nYou have not selected an option, please choose the option by writing only the number.";
				 };
				 
				 if (betOptionChoose>6) {
					 System.out.println(option);
					 
				 } else {
					 break;
					 }
				 }
			 
			 
			 //IF THEY CHOOSE TO BET ON A NUMBER:
			 
			 while(betOptionChoose == 1) {
				 
				 System.out.println("\nYou have chosen to bet on " + option);
				 System.out.println("What number are you betting on?");
						numberBet = scan.nextInt();	
						scan = new Scanner (System.in);
						if (numberBet>=36) {
							System.out.println("\nThat number doesn't exist.\nIt has to be between 0 and 36\n\n----------------------------------");
							continue;
						}
				 while (betOptionChoose == 1) {		
				
					System.out.println("\nHow much do you want to bet?");
						moneyBet = scan.nextDouble();
						scan = new Scanner (System.in);

						
						if (moneyBet>moneyAmount) {
							System.out.println("\nYou don't have enough money.\\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
							continue;
						}
						
					System.out.print("\nThe number is " + randomNumber);
					moneyAmount -= moneyBet;
					if (randomNumber==numberBet) {
						moneyAmount = moneyBet*36+(moneyAmount);
						System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
					} else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
					}
					break;
				 }
				 break;
			 }
			 
			 
			 //IF THEY CHOOSE TO BET ON EVEN NUMBERS:
			 
					 
			 while (betOptionChoose == 2) {
				 System.out.println("\nYou have chosen to bet on " + option);
				 System.out.println("How much do you want to bet?");
					moneyBet = scan.nextDouble();
					scan = new Scanner (System.in);
					if (moneyBet>moneyAmount) {
						System.out.println("\nYou don't have enough money.\\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
						continue;
					}
					
				 System.out.println("\nThe number is " + randomNumber);
				 moneyAmount -= moneyBet;
				 if (randomNumber%2==0) {
					 moneyAmount = moneyBet*2+(moneyAmount);
					 System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 break;
			 }
			 
			 
			 //IF THEY CHOOSE TO BET ON ODD NUMBERS:
			 
			 while (betOptionChoose == 3) {
				 System.out.println("\nYou have chosen to bet on " + option);
				 System.out.println("How much do you want to bet?");
					moneyBet = scan.nextDouble();
					scan = new Scanner (System.in);
					if (moneyBet>moneyAmount) {
						System.out.println("\nYou don't have enough money.\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
						continue;
					}
					
				 System.out.println("\nThe number is " + randomNumber);
				 moneyAmount -= moneyBet;
				 if (!(randomNumber%2==0)) {
					 moneyAmount = moneyBet*2+(moneyAmount);
					 System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 break;
			 }
			 
			 
			 
			 
			//IF THEY CHOOSE TO BET ON 1-12: 
				
			 
			 while (betOptionChoose == 4) {
				 System.out.println("\nYou have chosen to bet on the numbers " + option);
				 System.out.println("How much do you want to bet?");
					moneyBet = scan.nextDouble();
					scan = new Scanner (System.in);
					
					if (moneyBet>moneyAmount) {
						System.out.println("\nYou don't have enough money.\\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
						continue;
					}
					
				 System.out.println("\nThe number is " + randomNumber);
				 moneyAmount -= moneyBet;
				 if ((randomNumber<=12)) {
					 moneyAmount = moneyBet*5+(moneyAmount);
					 System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 break;
			 }
			 
			 //IF THEY CHOOSE TO BET ON 12-24: 
				
			 
			 while (betOptionChoose == 5) {
				 System.out.println("\nYou have chosen to bet on the numbers " + option);
				 System.out.println("How much do you want to bet?");
					moneyBet = scan.nextDouble();
					scan = new Scanner (System.in);
					
					if (moneyBet>moneyAmount) {
						System.out.println("\nYou don't have enough money.\\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
						continue;
					}
					
				 System.out.println("\nThe number is " + randomNumber);
				 moneyAmount -= moneyBet;
				 if ((randomNumber>12) && (randomNumber<=24)) {
					 moneyAmount = moneyBet*5+(moneyAmount);
					 System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 break;
			 }
			 
			 
			 //IF THEY CHOOSE TO BET ON 25-36: 
				
			 
			 while (betOptionChoose == 6) {
				 System.out.println("\nYou have chosen to bet on the numbers " + option);
				 System.out.println("How much do you want to bet?");
					moneyBet = scan.nextDouble();
					scan = new Scanner (System.in);
					
					if (moneyBet>moneyAmount) {
						System.out.println("\nYou don't have enough money.\\nYou only have" + moneyAmount + "\\n\\n----------------------------------");
						continue;
					}
					
				 System.out.println("\nThe number is " + randomNumber);
				 moneyAmount -= moneyBet;
				 if (randomNumber>24) {
					 moneyAmount = moneyBet*5+(moneyAmount);
					 System.out.println("\nYou win! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 else {
						System.out.println("\nYou lose! \n\nYour total money is " + moneyAmount + "\n");
				 }
				 break;
			 }
		}
		
		System.out.println("Goodbye!\n\nYou are leaving with " + moneyAmount);
	}
}
//int number = (int) (Math.random()*10)