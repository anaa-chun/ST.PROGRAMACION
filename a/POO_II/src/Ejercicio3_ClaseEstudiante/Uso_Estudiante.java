package Ejercicio3_ClaseEstudiante;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Estudiante {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3: Clase Estudiante Objetivo: Construye una clase Estudiante con
		 * tres propiedades privadas: nombre (String), edad (int), y calificacion
		 * (double). Implementa los getters y setters correspondientes.
		 * 
		 * Desafío adicional: Asegúrate de que la edad sea un número positivo y que la
		 * calificación esté en el rango de 0 a 100.
		 */

		Estudiante AnaChun = new Estudiante(); // Instancio de la clase Estudiante llamada AnaChun

		// Imprimir información sobre el estudiante AnaChun
		System.out.println(AnaChun.dimeEstudiante() + AnaChun.dimeEdad() + AnaChun.dimeCalificacion());
	}
}
