package ejercicio02_Calculadora_de_Salario;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		 * 2.Calculadora de Salario: Desarrolla una clase Empleado con atributos para
		 * nombre, horas trabajadas y tarifa por hora. Usa getters y setters para
		 * manipular estos atributos. En el archivo principal, usa un bucle for para
		 * ingresar los datos de 5 empleados mediante JOptionPane y calcula su salario
		 * (horas trabajadas * tarifa por hora).
		 */

		// Creo el array de objetos Empleado para almacenar información sobre los empleados
		Empleado[] emp = new Empleado[4];

		// Bucle para introducir los datos de 4 empleados
		for (int i = 0; i < emp.length; i++) {

			// Pongo el nombre del empleado utilizando JOptionPane
			String nombre = JOptionPane.showInputDialog("Introduzca el nombre del empleado:");

			// Ingreso las horas trabajadas por el empleado utilizando JOptionPane
			int horasTrabajadas = Integer
					.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas por " + nombre + ":"));

			// Aquí ingreso las tarifas
			double tarifaHora = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora para " + nombre + ":"));

			// Crea un objeto Empleado con los datos introducidos y lo alaceno en un array
			emp[i] = new Empleado(nombre, horasTrabajadas, tarifaHora);

		}

		// Bucle para mostrar el salario calculado de cada empleado
		for (Empleado empleado : emp) {
			// Muestra el nombre del empleado y el salario calculado utilizando JOptionPane
			JOptionPane.showMessageDialog(null, "El salario del empleado de " + empleado.get_nombre() + " es: "
					+ (empleado.get_horasTrabajadas() * empleado.get_horasTarifas()));
		}

	}

}
