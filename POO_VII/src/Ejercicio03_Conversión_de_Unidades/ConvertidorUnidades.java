package Ejercicio03_Conversión_de_Unidades;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class ConvertidorUnidades {

	/*
	 * Objetivo: Crear una clase para convertir unidades de medida. 
	 * Descripción: 
	 * - Crea una clase llamada ConvertidorUnidades. 
	 * - Añade métodos estáticos para diferentes conversiones (por ejemplo, de kilómetros a millas, de grados
	 * Celsius a Fahrenheit). 
	 * - Los métodos deben tomar un valor como parámetro y devolver el valor convertido.
	 */

	public static void main(String[] args) {
		// Prueba de los métodos estáticos
		double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad en kilómetros:"));

		// Conversión de kilómetros a millas
		double millas = convertirKilometrosAMillas(kilometros);

		// Conversión de grados Celsius a Fahrenheit
		double gradosCelsius = Double
				.parseDouble(JOptionPane.showInputDialog("Dime la temperatura en grados Celsius:"));
		double gradosFahrenheit = convertirCelsiusAFahrenheit(gradosCelsius);

		// Creamos el mensaje combinando los resultados
		String mensaje = "El resultado de la conversión a millas es: " + millas + "\nConversión a Fahrenheit: "
				+ gradosFahrenheit;

		// Mostramos el mensaje
		JOptionPane.showMessageDialog(null, mensaje);
	}

	// Método estático para convertir kilómetros a millas
	public static double convertirKilometrosAMillas(double kilometros) {
		return kilometros * 0.621371;
	}

	// Método estático para convertir grados Celsius a Fahrenheit
	public static double convertirCelsiusAFahrenheit(double gradosCelsius) {
		return (gradosCelsius * 9 / 5) + 32;
	}
}
