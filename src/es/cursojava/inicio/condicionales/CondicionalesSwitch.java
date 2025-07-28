package es.cursojava.inicio.condicionales;

public class CondicionalesSwitch {
	
	public static void main (String[] args) {
		
		String month = "january";
		
		switch (month) {
		
			case "january" : System.out.println("Winter");
			case "febuary" : System.out.println("Winter");
			case "march" : System.out.println("Winter");
			case "april" : System.out.println("Spring");
			case "may" : System.out.println("Spring");
			case "june" : System.out.println("Spring");
			case "july" : System.out.println("Summer");break;
			case "august" : System.out.println("Summer");
			case "september" : System.out.println("Summer");
			case "october" : System.out.println("Autumn");
			case "november" : System.out.println("Autumn");
			case "december" : System.out.println("Autumn");
			default : System.out.println("No month selected");
		}
		
		System.out.println("Finished Old Switch");
		
		
		String season = switch (month) {
		
		case "december", "january", "febuary" -> "Winter";
		case "march", "april", "may" -> "Spring";
		case "june", "july", "august" -> "Summer";
		case "september", "october", "november" -> "Autumn";
		default -> "No month selected";
		};	
	
		System.out.println("Finished New Switch");
	}

}
