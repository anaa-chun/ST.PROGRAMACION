package Ejercicio05_Contador_de_Llamadas_a_Método;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class contadorLlamadas {

	/*
	 * Objetivo: Contar cuántas veces se ha llamado a un método específico.
	 * 
	 * Descripción: 
	 * - Crea una clase con un método que realice alguna operación simple (como imprimir un mensaje). 
	 * - Añade una variable estática para contar cuántas veces se ha llamado a este método. 
	 * - Cada vez que el método se llame, incrementa el contador. 
	 * - Añade un método estático que devuelva el número de veces que el método ha sido llamado.
	 */

	// Variable estática para contar las llamadas al método
	private static int contadorLlamadas = 0;

	public static void main(String[] args) {
		// Llamada al método para realizar alguna operación simple
		realizarOperacion();

		// Obtener el número de veces que el método ha sido llamado
		int llamadas = obtenerContadorLlamadas();
		int llamadas2 = obtenerContadorLlamadas();
		int llamadas3 = obtenerContadorLlamadas();

		// Mostrar el mensaje
		JOptionPane.showMessageDialog(null, "Número de llamadas al método: " + llamadas + llamadas2 + llamadas3);
	}

	// Método que realiza alguna operación simple
	private static void realizarOperacion() {
		// Incrementar el contador de llamadas cada vez que se llama al método
		contadorLlamadas++;
		// Realizar alguna operación simple, por ejemplo, imprimir un mensaje
		System.out.println("Operación realizada");
	}

	// Método estático que devuelve el número de veces que el método ha sido llamado
	private static int obtenerContadorLlamadas() {
		return contadorLlamadas;
	}
}
