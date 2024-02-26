package POO_IX;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM 1

// Clase abstracta que define métodos abstractos acelerar() y frenar()
public abstract class Vehiculo {

	/*
	 * Diseña una clase abstracta Vehiculo con métodos abstractos como acelerar() y
	 * frenar(). Implementa subclases concretas como Automovil y Motocicleta que
	 * hereden de esta clase y proporcionen implementaciones específicas de
	 * aceleración y frenado para cada tipo de vehículo.
	 */

	 // Declarar un método en una clase abstracta que debe ser implementado por las subclases,
	public abstract void acelerar();
	public abstract void frenar();

	// Método main donde se crean instancias de Automovil y Motocicleta y se prueba su comportamiento
	public static void main(String[] args) {
		// Creación de un objeto Automovil
		Automovil auto = new Automovil();
		
		// Creación de un objeto Motocicleta
		Motocicleta moto = new Motocicleta();

		// Muestra un mensaje indicando que se está acelerando el automóvil
		JOptionPane.showMessageDialog(null, "Acelerando el automóvil 🚗");
		
		// Llama al método acelerar() de Automovil
		auto.acelerar();
		
		// Llama al método frenar() de Automovil
		auto.frenar();

		// Muestra un mensaje indicando que se está acelerando la motocicleta
		JOptionPane.showMessageDialog(null, "\nAcelerando la motocicleta 🛵");
		
		// Llama al método acelerar() de Motocicleta
		moto.acelerar();
		
		// Llama al método frenar() de Motocicleta
		moto.frenar();
	}
}

// Subclase concreta Automovil que hereda de Vehiculo
class Automovil extends Vehiculo {
	
	/*Override: Sobreescribe los métodos abstractos
	correspondientes de la clase padre Vehiculo.*/

	@Override
	public void acelerar() {
		// Muestra un mensaje indicando que el automóvil está acelerando
		JOptionPane.showMessageDialog(null, "El automóvil está acelerando ⚡");
	}

	@Override
	public void frenar() {
		// Muestra un mensaje indicando que el automóvil está frenando
		JOptionPane.showMessageDialog(null, "Ahora el automóvil frena 🛑");
	}
}

// Subclase concreta Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {

	@Override
	public void acelerar() {
		// Muestra un mensaje indicando que la motocicleta está acelerando
		JOptionPane.showMessageDialog(null, "La motocicleta está acelerando ⚡");
	}

	@Override
	public void frenar() {
		// Muestra un mensaje indicando que la motocicleta está frenando
		JOptionPane.showMessageDialog(null, "Ahora la motocicleta frena 🛑");
	}
}
