package Clases;

public class Libro {
	private String Isbn;
	private String Autor;
	private int Año;
	private static int numero = 0;

	public Libro(String isbn, String autor, int año) {
		super();
		Isbn = isbn;
		Autor = autor;
		Año = año;
		numero++;
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Libro [Isbn=" + Isbn + ", Autor=" + Autor + ", Año=" + Año + "]";
	}

}
