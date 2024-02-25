package ejercicio01_Registro_de_Estudiantes;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class Uso_Estudiante {

	public static void main(String[] args) {

		/*
		 * Crea una clase Estudiante con atributos como nombre, edad y grado. Implementa
		 * métodos getter y setter para cada atributo. En el archivo principal, utiliza
		 * JOptionPane para ingresar los datos de 3 estudiantes y muestra la información
		 * de cada uno utilizando los getters.
		 */

		// Crear un array para almacenar los objetos Estudiante
		Estudiante[] alumnos = new Estudiante[3];

		// Llenar el array con objetos Estudiante creados con datos ingresados por el
		// usuario
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = crearEstudiante();
		}

		// Mostrar información utilizando getters y un bucle
		for (Estudiante estudiante : alumnos) {
			mostrarInformacionEstudiante(estudiante);
		}
	}

	// Método para crear un objeto Estudiante con datos introducidos por el usuario
	private static Estudiante crearEstudiante() {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del estudiante:");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad del estudiante:"));
		String grado = JOptionPane.showInputDialog("Cual es el grado del estudiante:");

		return new Estudiante(nombre, edad, grado);
	}

	// Método para mostrar la información de un estudiante utilizando getters
	private static void mostrarInformacionEstudiante(Estudiante estudiante) {
		JOptionPane.showMessageDialog(null, "\nNombre del estudiante: " + estudiante.getNombre() + " \nEdad: " + estudiante.getEdad()
				+ " \nGrado: " + estudiante.getGrado());

	}

}