package Ejercicio03_Métodos_Sobrescritos;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		/*
		 * Diseña una clase "Animal" con un método "emitirSonido" que simplemente
		 * imprima "Este animal hace un sonido". Luego, crea una clase "Perro" que
		 * herede de "Animal" y sobrescribe el método "emitirSonido" para que imprima
		 * "El perro ladra".
		 */

		// Crea una instancia de la clase "Perro" llamada "tara".
		Perro tara = new Perro();

		// Llama al método "emitirSonido" para mostrar el sonido específico del perro.
		tara.emitirSonido();

		// Muestra un cuadro de diálogo con el mensaje "El perro ladra".
		JOptionPane.showMessageDialog(null, "El perro ladra");
	}

}
