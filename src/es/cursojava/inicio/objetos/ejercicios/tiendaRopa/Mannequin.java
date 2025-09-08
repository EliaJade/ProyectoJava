package es.cursojava.inicio.objetos.ejercicios.tiendaRopa;

import java.util.Scanner;

public class Mannequin {
	
	private String id;
	private Shirt shirt;
	private Trousers trousers;
	private Dress dress;
	
	
	private boolean clothesOn; //default false
	private boolean shirtOn;
	private boolean trousersOn;
	private boolean dressOn;
	

	//CONSTRUCTORES
	
	public Mannequin() {
		
	}
	
	public Mannequin(Shirt shirt, Trousers trousers) {
		this.shirt=shirt;
		this.trousers=trousers;
		
	}
	
	public Mannequin(Dress dress) {
		this.dress=dress;
		
	}
	

	//GET & SET

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shirt getShirt() {
		return shirt;
	}

	public void setShirt(Shirt shirt) {
		this.shirt = shirt;
	}

	public Trousers getTrousers() {
		return trousers;
	}

	public void setTrousers(Trousers trousers) {
		this.trousers = trousers;
	}

	public Dress getDress() {
		return dress;
	}

	public void setDress(Dress dress) {
		this.dress = dress;
	}
	
	
	public void showMannequin() {
		dress.showDress();
//		trousers.showTrousers();
		shirt.showShirt();
		
		
	}
	//METODOS
	
	public void Dressed() {
		if (!(getShirt()==null)&&(getDress()==null)&&(getTrousers()==null)) {
			clothesOn=true; 
		}
		
		
		if (clothesOn==true) {	
			System.out.println("The mannequin already has clothes");
		
		} 
		if(clothesOn==false) {
			DressShirt(shirt);
			DressTrousers(trousers);
			DressDress(dress);
		} 
		else if ((shirtOn==true)||(trousersOn==false)) {
			DressTrousers(trousers);
		}
		else if ((shirtOn==false)||(trousersOn==true)) {
			DressShirt(shirt);
		}
		
		
		
	}
	public void DressShirt(Shirt shirt) {
		this.shirt=shirt;
		
	}
	public void DressTrousers(Trousers trousers) {
		this.trousers=trousers;
	}
	public void DressDress(Dress dress) {
		this.dress=dress;
	}
	
	
}
//			while(clothesOn!=true) {
//			System.out.println("How do you wish to dress the mannequin?\n\tA dress\n\tShirt and trousers");
//			Scanner scan = new Scanner (System.in);
//			String outfit = scan.nextLine();
//			outfit = outfit.toLowerCase();
//			if(outfit.equals("shirt")||outfit.equals("shirt and trousers")||outfit.equals("trousers")) {
//				setShirt();
//			}