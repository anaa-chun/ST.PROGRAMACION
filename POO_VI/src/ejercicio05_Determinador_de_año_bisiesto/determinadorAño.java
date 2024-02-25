package ejercicio05_Determinador_de_año_bisiesto;

import javax.swing.*;

//@author: Ana Chun Gómez De Castro DAM1

public class determinadorAño {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que determine si un año es bisiesto o no. Usa constantes
		 * `final` para los números relevantes en la lógica de los años bisiestos (por
		 * ejemplo, 4, 100, 400). El usuario introduce un año mediante `JOptionPane`, y
		 * el programa muestra si es un año bisiesto o no siguiendo las reglas de que un
		 * año divisible por 4 es bisiesto, excepto si es divisible por 100, a menos que
		 * también sea divisible por 400.
		 */

		// Crear una instancia de la clase Determinador
		Determinador Bisiesto = new Determinador();

		// Obtener el año del usuario mediante JOptionPane
		Bisiesto.getAño(Integer.parseInt(JOptionPane.showInputDialog("Dime el año: ")));

		// Comprobar si el año es bisiesto y mostrar el resultado
		if (Bisiesto.comprueboAño()) {
			JOptionPane.showMessageDialog(null, "¡El año es bisiesto! :) ");
		} else {
			JOptionPane.showMessageDialog(null, "El año no es bisiesto :(");
		}
	}
}

// Clase para determinar si un año es bisiesto
class Determinador {
	// Constantes para los números relevantes en la lógica de años bisiestos
	private final int divisible4;
	private final int divisible100;
	private final int divisible400;

	// Atributos de la clase Determinador
	private int año;
	private boolean compruebo;

	// Constructor para inicializar las constantes
	public Determinador() {
		divisible4 = 4;
		divisible100 = 100;
		divisible400 = 400;
	}

	// Getter para obtener el año
	public int getAño() {
		return año;
	}

	// Setter para establecer el año
	public void getAño(int año) {
		this.año = año;
	}

	// Getter para obtener el estado de comprobación
	public boolean esComprobado() {
		return compruebo;
	}

	// Método para comprobar si el año es bisiesto
	public boolean comprueboAño() {
		return this.setCompruebo((año % divisible4 == 0 && año % divisible100 != 0)
				|| (año % divisible100 != 0 && año % divisible400 == 0));
	}

	// Setter para establecer el estado de comprobación
	public boolean setCompruebo(boolean comprobado) {
		this.compruebo = comprobado;
		return comprobado;
	}
}
