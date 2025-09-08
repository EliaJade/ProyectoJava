package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Shirt {
	
	private Color color;
	private Size size;
	private Price price;
	private Button[] button;
	

	//CONSTRUCTOR

	public Shirt(Color color, Size size, Price price, Button[] button) {
		this.color=color;
		this.price=price;
		this.size=size;
		this.button=button;
	}
	
	
	
	//GET & SET
	
	public Color getColor() {
		return color;
	}
	
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	public Size getSize() {
		return size;
	}
	
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	
	public Price getPrice() {
		return price;
	}
	
	
	public void setPrice(Price price) {
		this.price = price;
	}



	public Button getButton() {
		
		return button;
	}



	public void setButton(Button button) {
		this.button = button;
	}
	
	public void showShirt() {
		System.out.println(color+ "\n" + size + "\n" + price + "\n" + button );
	}
	

}
