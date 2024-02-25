package ejercicio02_Conversor_de_temperatura;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class conversorTemperatura {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que convierta la temperatura de Celsius a Fahrenheit. Usa
		 * una constante `final` para el factor de conversión (1.8) y otra para el
		 * ajuste (32). El usuario introduce la temperatura en Celsius usando
		 * `JOptionPane`, y el programa muestra la temperatura convertida a Fahrenheit.
		 */

		// Obtener la temperatura en Celsius del usuario
		String input = JOptionPane.showInputDialog("Introduce la temperatura en Celsius:");
		double temperaturaCelsius = Double.parseDouble(input);

		// Crear una instancia del conversor
		ConversorTemperatura conversor = new ConversorTemperatura(temperaturaCelsius);

		// Convertir la temperatura de Celsius a Fahrenheit y mostrar el resultado
		conversor
				.setTemperatura((conversor.getTemperatura() * conversor.getFactorConversion()) + conversor.getAjuste());
		JOptionPane.showMessageDialog(null, "\nLa temperatura en Fahrenheit es: " + conversor.convertirAFahrenheit());
	}

	// Clase interna que representa el conversor de temperatura
	public static class ConversorTemperatura {

		// Constantes para el ajuste y el factor de conversión
		private final double ajuste;
		private final double factorConversion;

		// Variable para almacenar la temperatura en Celsius
		private double temperatura;

		// Constructor para inicializar la temperatura y las constantes
		public ConversorTemperatura(double temperatura) {
			this.temperatura = temperatura;
			this.factorConversion = 1.8;
			this.ajuste = 32;
		}

		// Getter para la temperatura en Celsius
		public double getTemperatura() {
			return temperatura;
		}

		// Setter para la temperatura en Celsius
		public void setTemperatura(double temperatura) {
			this.temperatura = temperatura;
		}

		// Getter para el ajuste
		public double getAjuste() {
			return ajuste;
		}

		// Getter para el factor de conversión
		public double getFactorConversion() {
			return factorConversion;
		}

		// Método para convertir la temperatura de Celsius a Fahrenheit
		public double convertirAFahrenheit() {
			return (temperatura * factorConversion) + ajuste;
		}
	}
}
