package EjercicioDeDificultadMedia_SistemaDeEmpleados;

import javax.swing.JOptionPane;

// @author: Ana Chun Gómez de Castro DAM 1

public class Uso_Empleado {

	public static void main(String[] args) {

		/*
		 * En una empresa, existen diferentes tipos de empleados como Permanente,
		 * Temporal y Contratista. Todos comparten ciertos atributos como nombre, ID y
		 * salario, pero también tienen sus especificidades, como el periodo de contrato
		 * para los temporales y contratistas, o beneficios adicionales para los
		 * permanentes. - Crea una clase abstracta Empleado que contenga la información
		 * básica de los empleados y métodos abstractos que puedan ser relevantes, como
		 * calcularSalario() o mostrarDetalles(). - Implementa clases concretas para
		 * Permanente, Temporal y Contratista. Cada una de estas clases debe tener
		 * múltiples constructores que permitan la creación de objetos con diferentes
		 * sets de datos iniciales. Por ejemplo, un EmpleadoPermanente podría ser creado
		 * solo con información básica o con información básica más beneficios
		 * adicionales. - Utiliza la sobrecarga de constructores en la clase abstracta
		 * Empleado para permitir diferentes formas de inicializar los objetos
		 * empleados, considerando variaciones como con o sin salario inicial
		 * especificado.
		 */

		// Ingresar información para EmpleadoPermanente
		String nombrePermanente = JOptionPane.showInputDialog(
				"Dime el nombre:" );
		int idPermanente = Integer.parseInt(JOptionPane.showInputDialog("Su ID:"));
		double salarioPermanente = Double
				.parseDouble(JOptionPane.showInputDialog("Dime su salario"));
		double beneficiosPermanente = Double
				.parseDouble(JOptionPane.showInputDialog("Introduzca beneficios adicionales para Empleado Permanente:"));
	

		EmpleadoPermanente empPermanente = new EmpleadoPermanente(nombrePermanente, idPermanente, salarioPermanente,
				beneficiosPermanente);
		empPermanente.mostrarDetalles();
		

		// Ingresar información para EmpleadoTemporal
		String nombreTemporal = JOptionPane.showInputDialog(
				"Introduzca nombre para Empleado Temporal:" );
		int idTemporal = Integer.parseInt(JOptionPane.showInputDialog("Dime ID: "));
		double salarioTemporal = Double
				.parseDouble(JOptionPane.showInputDialog("Dime salario:"));
		int periodoTemporal = Integer
				.parseInt(JOptionPane.showInputDialog("Introduzca periodo de contrato para Empleado Temporal:"));

		Temporal empTemporal = new Temporal(nombreTemporal, idTemporal, salarioTemporal, periodoTemporal);
		empTemporal.mostrarDetalles();

		// Ingresar información para EmpleadoContratista
		String nombreContratista = JOptionPane.showInputDialog(
				"Introduzca nombre para Empleado Contratista:" );
		int idContratista = Integer.parseInt(JOptionPane.showInputDialog("Dime ID para Empleado Contratista:"));
		double salarioContratista = Double
				.parseDouble(JOptionPane.showInputDialog("Dime salario :"));
		int periodoContratista = Integer
				.parseInt(JOptionPane.showInputDialog("Introduzca periodo de contrato: "));

		Contratista empContratista = new Contratista(nombreContratista, idContratista, salarioContratista,
				periodoContratista);
		empContratista.mostrarDetalles();

	}

}
