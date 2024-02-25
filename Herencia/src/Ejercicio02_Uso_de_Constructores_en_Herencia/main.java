package Ejercicio02_Uso_de_Constructores_en_Herencia;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		/*
		 * Define una clase Persona con atributos nombre y edad, y un constructor para
		 * inicializar esos atributos. Luego, crea una clase Estudiante que herede de
		 * Persona e incluya un atributo adicional carrera y un constructor que haga uso
		 * del constructor de la clase base para inicializar todos los atributos.
		 */

		// Solicita al usuario información sobre el estudiante.
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ahora dime su edad"));
        String carrera = JOptionPane.showInputDialog("¿Y en qué carrera está actualmente?");

        // Crea una instancia de la clase "Estudiante" con la información proporcionada.
        Estudiante estudiante = new Estudiante(nombre, edad, carrera);

        // Construye un mensaje con la información del estudiante.
        String mensaje = "\nNombre: " + estudiante.getNombre() + "\nEdad: " + estudiante.getEdad() + "\nCarrera: "
                + estudiante.getCarrera();

        // Muestra un cuadro de diálogo con la información del estudiante.
        JOptionPane.showInternalMessageDialog(null, mensaje);

	}
}


