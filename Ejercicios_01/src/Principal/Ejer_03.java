package Principal;


import java.util.ArrayList;

import Clases.Persona;

public class Ejer_03 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona ("jose manuel", 25));
		lista.add(new Persona ("ana jose manuel", 25));
		lista.add(new Persona ("jose andres", 25));
		lista.add(new Persona ("ana maria", 25));
		
		for(Persona p : lista) System.out.println(p);

	}

}
