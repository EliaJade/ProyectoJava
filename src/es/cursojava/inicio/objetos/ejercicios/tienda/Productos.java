package es.cursojava.inicio.objetos.ejercicios.tienda;

public class Productos {

	private String name;
	private double price;
	private int amount;
	
	public Productos(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void muestraInfo() {
		System.out.println(name.toUpperCase() + ":\n\tPrice: " + price + " euros\n\tAmount: " + amount + "\n");
	}
	
	public double calculaValorTotal() {
		double total = price*amount;
		return total;
//		System.out.println("For all " + amount + name + " the total price will be " + total);
	}

	
	
	

}





