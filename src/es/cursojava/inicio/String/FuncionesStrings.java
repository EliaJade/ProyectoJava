package es.cursojava.inicio.String;

public class FuncionesStrings {

	public static void main(String[] args) {
		
		String name = "Marta";
		String name2 = "Eva";
		String separator = "\n=========================================\n";

		String name3 = null;
		
		name3 = name2;
		name2 = name;
		name2.toUpperCase();
		System.out.println(name);
		System.out.println(name3.toUpperCase());
		

		System.out.println(separator);
		
		System.out.println(name.charAt(name.length()-1));
		

		System.out.println(separator);
		

		System.out.println(name.toLowerCase().contains("ma"));

		System.out.println(separator);
		
		System.out.println(name.endsWith("va"));

		System.out.println(name.startsWith("Ma"));
		

		System.out.println(separator);
		
		String cadena = "Esto es una prueba de Strings.";
//		String E = "";
		System.out.println(cadena.indexOf("e"));
		System.out.println(cadena.lastIndexOf("e"));
//		int firstE = cadena.indexOf("e".toUpperCase());
//		String cadena2 = cadena.substring(6);
		String cadena2 = cadena.substring(cadena.indexOf("e")+1);
//		System.out.println(cadena2);
		System.out.println(cadena2.indexOf("e")+6);
		
		System.out.println(separator);
		
		cadena = "   ";
		
		System.out.println(cadena.isBlank());
		System.out.println(cadena.isEmpty());
		
		cadena.strip();
		
		cadena.substring(0);
	}

}
