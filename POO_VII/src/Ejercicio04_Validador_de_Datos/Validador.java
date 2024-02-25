package Ejercicio04_Validador_de_Datos;

import javax.swing.JOptionPane;

public class Validador {

	// @author: Ana Chun Gómez De Castro DAM1

	public static void main(String[] args) {

		/*
		 * Objetivo: Crear una clase con métodos estáticos para validar diferentes tipos
		 * de datos. 
		 * Descripción: 
		 * - Crea una clase llamada Validador. 
		 * - Implementa métodos estáticos para validar diferentes tipos de datos (por ejemplo, si una
		 * cadena es un número, si un número está en un rango específico, etc.). 
		 * - Usa estos métodos en el método main para validar algunos datos de prueba.
		 */

		// Prueba de los métodos estáticos
		String cadena = JOptionPane.showInputDialog("Introduzca una cadena para validar:");
		double inputNumero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número para validar:"));
		int rangoInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el inicio del rango:"));
		int rangoFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el fin del rango:"));

		// Validar si la cadena es un número
		boolean esNumero = esNumero(cadena);

		// Validar si el número está en el rango específico
		boolean enRango = estaEnRango(inputNumero, rangoInicio, rangoFinal);

		// Crear el mensaje combinando los resultados de validación
		String mensaje = "Es número: " + esNumero + "\nNúmero en rango: " + enRango;

		// Mostrar el mensaje
		JOptionPane.showMessageDialog(null, mensaje);
	}

    // Método estático para validar si una cadena es un número
	public static boolean esNumero(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

    // Método estático para validar si un número está en un rango específico
	public static boolean estaEnRango(double numero, int rangoInicio, int rangoFin) {
		return numero >= rangoInicio && numero <= rangoFin;
	}
}
