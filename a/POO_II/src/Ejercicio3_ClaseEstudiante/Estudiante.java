package Ejercicio3_ClaseEstudiante;

//@author: Ana Chun Gómez de Castro DAM1 

public class Estudiante { // Declaración de la clase principal llamada Estudiante

	/*
	 * Ejercicio 3: Clase Estudiante Objetivo: Construye una clase Estudiante con
	 * tres propiedades privadas: nombre (String), edad (int), y calificacion
	 * (double). Implementa los getters y setters correspondientes.
	 * 
	 * Desafío adicional: Asegúrate de que la edad sea un número positivo y que la
	 * calificación esté en el rango de 0 a 100.
	 */

	// Propiedades privadas que almacena nombre, edad y calificación del estudiante
	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante() {
		nombre = " Ana Chun"; // Nombro un valor al nombre
		edad = 19; // Asigna un valor a la edad
		calificacion = 8.5; // Llamo un valor a la calificación
	}

	// Método que devuelve una descripción del estudiante
	public String dimeEstudiante() {
		return " Soy la alumna " + nombre + " tengo " + edad + " años, y mi calificación de programación es un "
				+ calificacion;
	}

	// Método getter para obtener la edad del estudiante y la calificación del
	// estudiante
	public int dimeEdad() {
		return edad;
	}

	// Getter
	public double dimeCalificacion() {
		return calificacion;
	}

}
