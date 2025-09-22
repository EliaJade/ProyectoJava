package es.cursojava.inicio.metodos.ejercicio2;

public class Ejercicio2Repaso {
	
	
	public static void main(String[]args) {
		String[] names= {"Anthony", "Beth", "Sam", "Anton", "Annabelle"};
		analizer(names);
	}

	public static int analizer(String[] names) {
		int totalNames = 0;
		for (String name : names) {
			if((name.contains("t"))&&(name.startsWith("A"))) {
				totalNames++;
				System.out.println(name +" starts with a A and has a t\n The total names is " + totalNames);
			} else if(name.contains("t")&&!(name.startsWith("A"))) {
				System.out.println(name + " though it has a t it doesn`t start with a A");
			}else if(name.startsWith("A")&&!(name.contains("t"))) {
				System.out.println(name + " though it starts with a A it doesn`t have a t");
			}else {
				System.out.println(name + " doesn't have a A or a t");
				
			}
		}
		return totalNames;
	}
}
