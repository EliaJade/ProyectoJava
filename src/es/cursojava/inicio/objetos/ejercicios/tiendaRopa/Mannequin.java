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
	
	public Mannequin(String id) {
		this.id=id;
	}
	
	public Mannequin(String id, Shirt shirt, Trousers trousers) {
		this.id=id;
		this.shirt=shirt;
		this.trousers=trousers;
		
	}
	
	public Mannequin(String id, Dress dress) {
		this.id=id;
		this.dress=dress;
		
	}
	

	//GET & SET

	public  String getId() {
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
		System.out.println("\nMannequin " + this.id + "\n");
		if (!(getShirt()==null)) {
			clothesOn=true; 
		}
		if (!(getDress()==null)) {
			clothesOn=true; 
		}
		if (!(getTrousers()==null)) {
			clothesOn=true; 
		}
		
		
		if (clothesOn==false) {
			System.out.println("The mannequin "  + id + " has no clothes\n");
		}
		if(dress!=null) {
			dress.showDress();
			
		}
		if(trousers!=null) {
			trousers.showTrousers();
			trousers.getButton();
			}
		if(shirt!=null) {
			shirt.showShirt();
		}
		
		
		
	}
	//METODOS
	
	public void dressed() {
		if (!(this.shirt==null)) {
			clothesOn=true; 
			shirtOn=true;
		}
		if (!(this.dress==null)) {
			clothesOn=true; 
			dressOn=true;
		}
		if (!(this.trousers==null)) {
			clothesOn=true;
			trousersOn=true;
		}
		
		if (clothesOn==true) {	
			if (dressOn==true) {
				System.out.println("Mannequin " + id + " already has a dress on");
			}
			if ((shirtOn==true)&&(trousersOn==false)) {
				System.out.println("Mannequin " + id + " already has a shirt on");
				setTrousers(trousers);
			}
			if ((shirtOn==false)&&(trousersOn==true)) {
				System.out.println("Mannequin " + id + " already has a trousers on");
				setShirt(shirt);
			}
			System.out.println("Mannequin " + id + " already has clothes\n");
		
		}
		
		if(clothesOn==false) {
			if ((shirtOn==true)||(trousersOn==false)) {
				System.out.println("This mannequin " + id + " doesn't have a shirt on");
				setTrousers(trousers);
			}
			if ((shirtOn==false)||(trousersOn==true)) {
				System.out.println("This mannequin " + id + " doesn't have a trousers on");
				setShirt(shirt);
			}
			if(dressOn==false) {
				System.out.println("Mannequin " + id + " doesn't have a dress on");
			}
			
			
		} 
		
		
		
	}
	
	
	public void undress() {
		shirt = null;
		trousers = null;
		dress = null;
		clothesOn = false;
	}
	
	
	public void dressShirt(Shirt shirt) {
		this.shirt=shirt;
		
	}
	public void dressTrousers(Trousers trousers) {
		this.trousers=trousers;
	}
	public void dressDress(Dress dress) {
		this.dress=dress;
	}
	
	
}




