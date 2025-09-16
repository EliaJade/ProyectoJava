package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

public class Trousers {

		private String color;
		private String size;
		private double price;
		private Button button;
		

	
		//CONSTRUCTOR

		public Trousers(String color, String size, double price, Button button) {
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



		public Button getButton() {
			return button;
		}



		public void setButton(Button button) {
			this.button = button;
		}
		
		//METODOS
		
		public void showTrousers() {
			System.out.println("This mannequin has trousers" + "\nCOLOR: " + color + "\nSIZE: " + size + "\nPRICE: " + price + "\nBUTTON: " + button.getColor() + ", " + button.getShape() +  ", " + button.getSize()  + "\n");
		}
		
		
		
}
