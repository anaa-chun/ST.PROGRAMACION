package Ejercicio1_ClaseAutomovil;

//@author: Ana Chun Gómez De Castro DAM1

public class Uso_Automovil {

	// Este es el método main, punto de entrada principal del programa
	public static void main(String[] args) {
		/*
		 * Objetivo: Crear una clase Automovil con dos propiedades privadas: marca
		 * (String) y modelo (String). Implementa los métodos getter y setter para estas
		 * propiedades.
		 * 
		 * Desafío adicional: Asegúrate de que el modelo no sea nulo ni esté vacío en el
		 * setter.
		 */

		Automovil BMV = new Automovil(); // Instancio de la clase Automovil llamada BMV

		System.out.println(BMV.dimeMarca() + BMV.dimeModelo()); // Imprimir un mensaje sobre la marca y modelo de BMV

	}

}
