package es.cursojava.inicio.objetos.ejercicios.biblioteca;

public class Direccion {

	private String street;
	private String city;
	private String postCode;
	
	//CONSTRUCTOR
	
	public Direccion(String street, String city, String postCode) {
		this.street=street;
		this.city=city;
		this.postCode=postCode;
	}
	
	
	//GET & SET
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode=postCode;
	}
	
	
	//METODOS
	
	public void showAdress() {
		System.out.println("ADDRESS:\n\tSTREET: " + street + "\n\tCITY: " + city + "\n\tPOSTCODE: " + postCode);
	}
}
