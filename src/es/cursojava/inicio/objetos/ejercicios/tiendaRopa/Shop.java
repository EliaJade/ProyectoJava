package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Shop {

	
	private String name;
	private Mannequin[] mannequins;
	
	
	//CONSTRUCTORES
	
	public Shop(String name) {
		this.name=name;
	}
	
	//GET & SET
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mannequin[] getMannequins() {
		return mannequins;
	}
	public void setMannequins(Mannequin[] mannequin) {
		this.mannequins = mannequin;
	}
	
	
	Shop shop1 = new Shop("Shop 1");

	static Button button1 = new Button("red", "S", "round");
	static Mannequin mannequin1 = new Mannequin();

	static Mannequin mannequin2 = new Mannequin();
	static Dress dress1 = new Dress("red", "M", 10);
	static Shirt shirt1 = new Shirt("blue", "S", 20, setButton(button1));

	static Mannequin mannequin3 = new Mannequin();
	

	
	public static void main(String[]args) {
		

		mannequin2.setDress(dress1);
		mannequin2.setId("2222");

		mannequin2.showMannequin();
		
		
	}
}

