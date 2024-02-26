package Principal;

import java.util.ArrayList;

import Clases.Persona;

public class Ejer_04 {

	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();

		Persona p1 = new Persona("maria", 50);
		lista.add(new Persona("ana", 20));
		lista.add(p1);
		lista.add(new Persona("maria", 50));
		lista.add(new Persona("ines", 33));
		lista.add(new Persona("andres", 33));

		lista.remove(new Persona("maria", 50));

		for (Persona p : lista)System.out.println(p);

	}
}
