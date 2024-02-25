package Ejercicio01_Clase_Base_y_Clase_Derivada_Básicas;

//@author: Ana Chun Gómez De Castro DAM1

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		/*
		 * Crea una clase base Vehículo que tenga atributos como marca, modelo y año.
		 * Luego, crea una clase Automóvil que herede de Vehículo y añade un atributo
		 * específico de Automóvil, como tipoDeCombustible. Implementa métodos en ambas
		 * clases para establecer y obtener los valores de los atributos.
		 */

        // Crea una instancia de la clase "Automóvil" llamada "miCoche" con valores iniciales.
		Automóvil miCoche = new Automóvil("BMV", "Corolla", 2025, "Híbrido");

        // Muestra un cuadro de diálogo con información sobre el automóvil utilizando los métodos getter
		JOptionPane.showMessageDialog(null, "\nMarca: " + miCoche.getMarca() + "\nModelo: " + miCoche.getModelo()
				+ "\nAño: " + miCoche.getAño() + "\nTipo de combustible: " + miCoche.getTipoDeCombustible());
	}

}
