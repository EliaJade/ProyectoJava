package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Dress {

	private String color;
	private String size;
	private double price;
	

	//CONSTRUCTOR

	public Dress(String color, String size, double price) {
		this.color=color;
		this.price=price;
		this.size=size;
	}
	
	
	
	
	//GET & SET
	
	public String getColor() {
//		System.out.println(color.getBlue());
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getSize() {
		System.out.println(getSize());
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
	
	

	public void showDress() {
		System.out.println("This mannequin has a dress" + "\nCOLOR: " + color + "\nSIZE: " + size + "\nPRICE: " + price);
	}

}


