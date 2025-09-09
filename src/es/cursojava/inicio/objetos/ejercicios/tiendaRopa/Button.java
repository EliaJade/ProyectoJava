package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Button {
	private String color;
	private String size;
	private String shape;
	
	
	//CONSTRUCTOR

	public Button(String color, String size, String shape) {
		
		this.color=color;
		this.size=size;
		this.shape=shape;
		
	}
	
	
	//GET & SET
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size=size;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		this.shape=shape;
	}
	
	//METODOS
	
	public void showButton() {
		System.out.println(color + shape + size);
	}
}


