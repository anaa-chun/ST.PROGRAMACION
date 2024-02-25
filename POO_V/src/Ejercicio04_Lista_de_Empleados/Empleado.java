package Ejercicio04_Lista_de_Empleados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM1

class Empleado {

	/*
	 * Crea una lista de tres empleados y muestra sus nombres y sueldos utilizando
	 * un bucle.
	 * 
	 * Solución Paso a Paso: 
	 * 1. Crea una ArrayList de objetos Empleado. 
	 * 2.Agrega tres empleados a la lista. 
	 * 3. Utiliza un bucle (por ejemplo, un for-each) para recorrer la lista. 
	 * 4. Dentro del bucle, utiliza los métodos dameNombre y dameSueldo para obtener y mostrar 
	 * los datos de cada empleado.
	 */

	private String nombre;
	private double sueldo;

	// Constructor para inicializar un objeto Empleado con nombre y sueldo
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	// metodo getter para el nombre
	public String dameNombre() {
		return nombre;
	}

	// metodo getter para el salario
	public double dameSueldo() {
		return sueldo;
	}

	public static void main(String[] args) {
		// Paso 1: Creo un ArrayList de objetos Empleado
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();

		// Paso 2: En ese caso agrego a tres empleados a la lista
		for (int i = 0; i < 3; i++) {
			String nombre = JOptionPane.showInputDialog("Dime el nombre del empleado: ");
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Dime el sueldo del empleado: "));

			Empleado empleado = new Empleado(nombre, sueldo);
			listaEmpleados.add(empleado);
		}

		// Paso 3: Utilizo un bucle para recorrer la lista
		StringBuilder resultado = new StringBuilder("\nLista de l@s emplead@s ");

		// Paso 4: Obtener y mostrar los datos de cada empleado
		for (Empleado empleado : listaEmpleados) {
			resultado.append(" \nNombre: ").append(empleado.dameNombre()).append("\nSueldo: ")
					.append(empleado.dameSueldo()).append("\n");
		}

		// Muestro el resultado utilizando JOptionPane
		JOptionPane.showMessageDialog(null, resultado.toString());
	}
}
