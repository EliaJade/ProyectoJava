package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Shop {

	
	private String name;
	private Mannequin[] mannequins;
	
	
	//CONSTRUCTORES
	
	public Shop(String name) {
		this.name=name;
		this.mannequins= new Mannequin[3];
		
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
	
//	
//	//BUTTONS
//	 Button button1 = new Button("red", "S", "round");
//	 Button button2 = new Button("blue", "S", "round");
//	 Button button3 = new Button("green", "S", "star");
//	 Button[] buttons = {button1, button2, button3};
//
//	//CLOTHES
//	
//	 Dress dress1 = new Dress("red", "M", 10);
//	 Shirt shirt1 = new Shirt("green", "S", 20, buttons);
//	 Trousers trousers1 = new Trousers ("yellow", "L", 25, button1);
//
//	
//	
//	//MANNEQUINS
//	
//	 Mannequin mannequin1 = new Mannequin("111", dress1);
//
//	 Mannequin mannequin2 = new Mannequin("222", shirt1, trousers1);
//
//	 Mannequin mannequin3 = new Mannequin("333");
	
	
	
	

	
	public static void main(String[]args) {
		//SHOPS
		Shop shop1 = new Shop("Shop 1");
		
		
		shop1.openShop();
		shop1.showWindow();
		
//		mannequin3.dressed();
		
		
		
		
		
		
		
		
		
		
	}
	
	public void openShop() {
		
		
		//BUTTONS
		 Button button1 = new Button("red", "S", "round");
		 Button button2 = new Button("blue", "S", "round");
		 Button button3 = new Button("green", "S", "star");
		 Button[] buttons = {button1, button2, button3};

		//CLOTHES
		
		 Dress dress1 = new Dress("red", "M", 10);
		 Shirt shirt1 = new Shirt("green", "S", 20, buttons);
		 Trousers trousers1 = new Trousers ("yellow", "L", 25, button3);

		
		
		//MANNEQUINS
		
		 Mannequin mannequin1 = new Mannequin("1", dress1);

		 Mannequin mannequin2 = new Mannequin("2", shirt1, trousers1);

		 Mannequin mannequin3 = new Mannequin("3");
		 
		 buttons[0] = button1;
		 buttons[1] = button2;
		 buttons[2] = button1;
		 mannequins[0] = mannequin1;
		 mannequins[1] = mannequin2;
		 mannequins[2] = mannequin3;
		 
		 
		 
	}
	
	public void showWindow() {
//		
		mannequins[1].getShirt().getButton()[2].getShape();
		
		for(Mannequin mannequin : mannequins) {
			mannequin.showMannequin();
		}
		
//		mannequin1.showMannequin();
//		
//		mannequin2.showMannequin();
//
//		mannequin3.showMannequin();
		
		
	}
	
	
	public void dressMannequin(Mannequin[] mannequinsdress) {
		
		for (Mannequin mannequin : mannequinsdress) {
			
		}
	}
	
}

