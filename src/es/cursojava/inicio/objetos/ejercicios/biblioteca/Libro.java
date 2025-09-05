package es.cursojava.inicio.objetos.ejercicios.biblioteca;

public class Libro {
	
	private String title;
	private String author;
	private String isbn;
	
	//CONSTRUCTOR
	
	public Libro(String title, String author, String isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	//GET & SET
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//METODOS

	public void showInfo() {
		System.out.println("BOOK:\n\tTITLE: " + title + "\n\tAUTHOR: " + author + "\n\tISBN: " + isbn + "\n\n");
	}
}


