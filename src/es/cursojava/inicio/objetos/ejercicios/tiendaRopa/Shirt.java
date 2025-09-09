package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Shirt {
	
	private String color;
	private String size;
	private double price;
	private Button[] button;
	

	//CONSTRUCTOR

	public Shirt(String color, String size, double price, Button[] button) {
		this.color=color;
		this.price=price;
		this.size=size;
		this.button=button;
	}
	
	
	
	//GET & SET
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getSize() {
		return size;
	}
	
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}



	public Button[] getButton() {
		for (Button buttons : button) {
			buttons.showButton();
		}
		return button;
	}



	public void setButton(Button[] button) {
		this.button = button;
		
	}
	
	
	
	public void showShirt() {
		System.out.println("This mannequin has shirt" + "\nCOLOR: " + color + "\nSIZE: " + size + "\nPRICE: " + price + "\nBUTTONS: " + getButton() + "\n");
	}
	

}
