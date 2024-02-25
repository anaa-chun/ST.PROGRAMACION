package Ejercicio1_ClaseAutomovil;

//@author: Ana Chun Gómez de Castro DAM1 

public class Automovil { // Declaro la clase principal llamada Automovil

	/*
	 * Objetivo: Crear una clase Automovil con dos propiedades privadas: marca
	 * (String) y modelo (String). Implementa los métodos getter y setter para estas
	 * propiedades.
	 * 
	 * Desafío adicional: Asegúrate de que el modelo no sea nulo ni esté vacío en el
	 * setter.
	 */

	// Propiedades privadas de la clase Automovil que almacena su marca y su modelo
	private String marca;
	private String modelo;

	public Automovil() {
		marca = "BMV"; // Asigno un valor que quieras a la marca
		modelo = "Carrocería"; // Nombro un valor al modelo
	}

	// Método getter
	public String getModelo() {
		return modelo;
	}

	// Método getter
	public String getMarca() {
		return marca;
	}

	// Es un método que devuelve un mensaje sobre la marca del automóvil
	public String dimeMarca() {
		return "No me gusta el coche que es de la marca " + marca;
	}

	// Método que devuelve un mensaje sobre el modelo del automóvil
	public String dimeModelo() {
		return " pero es de modelo " + modelo;
	}

}
