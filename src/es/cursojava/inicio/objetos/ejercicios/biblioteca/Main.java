package es.cursojava.inicio.objetos.ejercicios.biblioteca;

public class Main {

	public static void main(String[] args) {
		

		Biblioteca library1 = new Biblioteca("Book Store 1", (new Direccion("John Street, ", "Madrid, ", "28011") ),10);
		
		Libro book1 = new Libro("Mistborn", "Brandon Sanderson", "111A");
		library1.addLibro(book1); 											//Adds book to object library1 que tiene un array de libros vinculado al objeto
		Libro book2 = new Libro("Six Of Crow", "Leigh Bardugo", "222B");
		library1.addLibro(book2);
		Libro book3 = new Libro("A Court Of Thorns And Roses", "Sarah J. Mass", "333C");
		library1.addLibro(book3);                                                                                                                                                                                      
		
//		Libro[] libros = {book1, book2, book3};
		
		
//		Biblioteca[] bibliotecas = {library1};
		
		

		Biblioteca library2 = new Biblioteca("Book Store 2", (new Direccion("Roman Street, ", "Barcelona, ", "55555") ),8);
		
		Libro book4 = new Libro("The Hunger Games", "Suzanne Collins", "444A");
		
//		showAllLibraryInfo(bibliotecas, libros);
		
//		showBookInfo(libros);
		
//		System.out.println(library1.getLibros()[0].getIsbn());  	They do the same thing	
//		System.out.println(book1.getIsbn());						They do the same thing
		book4.getIsbn();
		
		System.out.println(library1.getName());
		library1.showInfoBiblioteca();
		
		
//		library1.showLibros();
		
		
		
		
		
		}
	public static void showBookInfo(Libro[] libros) {
		for (Libro libro : libros) {
			libro.showInfo();
		}
	}
	
	public static void showAllLibraryInfo(Biblioteca[] bibliotecas, Libro[] libros) {
		for (Biblioteca biblioteca : bibliotecas) {
			for(Libro libro : libros) {
				String bookTitle = libro.getTitle();
			}
			biblioteca.showInfoBiblioteca();
		}
	}

}
