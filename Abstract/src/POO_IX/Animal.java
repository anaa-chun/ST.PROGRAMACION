package POO_IX;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

// Clase abstracta que define métodos abstractos hacerSonido() y moverse()
public abstract class Animal {

	/*
	 * Crea una clase abstracta Animal con métodos abstractos como hacerSonido() y
	 * moverse(). Luego, implementa subclases concretas como Perro y Gato que
	 * hereden de esta clase y proporcionen implementaciones específicas para los
	 * sonidos y movimientos de cada animal.
	 */

	// Declarar un método en una clase abstracta que debe ser implementado por las subclases
	public abstract void hacerSonido();
	public abstract void moverse();

	// Método main donde se elige entre Perro y Gato y se prueba su comportamiento
	public static void main(String[] args) {
		// Solicitar al usuario que elija entre Perro y Gato
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1) Perro 🐶 \n2) Gato 😺"));

		switch (option) {
		// Crear instancia de Perro, mostrar el sonido y el movimiento
		case 1:
			Perro perro = new Perro();
			JOptionPane.showMessageDialog(null, "Sonido del perro 🔊");
			perro.hacerSonido();
			perro.moverse();
			break;
		// Crear instancia de Gato, mostrar el sonido y el movimiento
		case 2:
			Gato gato = new Gato();
			JOptionPane.showMessageDialog(null, "Sonido del gato 🔊");
			gato.hacerSonido();
			gato.moverse();
			break;
		}
	}
}

// Subclase concreta Perro que hereda de Animal
class Perro extends Animal {

	@Override
	public void hacerSonido() {
		// Mostrar un mensaje indicando que el perro está ladrando
		JOptionPane.showMessageDialog(null, "El perro está ladrando 🐕");
	}

	@Override
	public void moverse() {
		// Mostrar un mensaje indicando que el perro está moviéndose y meando
		JOptionPane.showMessageDialog(null, "Ahora el perro está meando 💦");
	}
}

// Subclase concreta Gato que hereda de Animal
class Gato extends Animal {

	@Override
	public void hacerSonido() {
		// Mostrar un mensaje indicando que el gato está maullando
		JOptionPane.showMessageDialog(null, "El gato maulla 🔊");
	}

	@Override
	public void moverse() {
		// Mostrar un mensaje indicando que el gato ha roto las cortinas
		JOptionPane.showMessageDialog(null, "¡¡¡Oh no!!! El gato ha roto las cortinas 💔");
	}
}
