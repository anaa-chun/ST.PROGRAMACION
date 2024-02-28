package Principal;

import Clases.Libro;

public class Ejer_01 {

	public static void main(String[] args) {
		Libro l1 = new Libro("111", "Rey Perez", 2000);
		System.out.println(l1.getNumero());

		Libro l2 = new Libro("222", "Rey Perez", 2022);
		System.out.println(l1.getNumero());
		System.out.println(l2.getNumero());

		Libro l3 = new Libro("333", "Rey Perez", 2022);
		System.out.println(l1.getNumero());
		System.out.println(l2.getNumero());
		System.out.println(l3.getNumero());

	}

}
