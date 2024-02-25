package Ejercicio05_Aumento_de_Sueldo_Condicionado;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM1

public class Empleado {

	/*
	 * Dada una lista de empleados, aumenta el sueldo en un 5% solo a aquellos que
	 * fueron contratados antes de 2021. Muestra los nombres y los sueldos actualizados. 
	 * 
	 * Solución Paso a Paso: 
	 * 1. Crea una lista de empleados, algunos contratados antes de 2021. 
	 * 2. Recorre la lista con un bucle. 
	 * 3. Para cada empleado, utiliza dameFechaContrato y compara el año de la fecha con 2021. 
	 * 4.Si el empleado fue contratado antes de 2021, usa subeSueldo para aumentar su sueldo en un 5%. 
	 * 5. Finalmente, muestra los nombres y sueldos actualizados de
	 * todos los empleados.
	 */

	// Atributos de la clase
	private String nombre;
	private double sueldo;
	private Date fecha_contrato;

	// Constructor que inicializa los atributos de la clase.
	public Empleado(String nombree, double sueldoo, int agno, int mes, int dia) {
		nombre = nombree;
		sueldo = sueldoo;

		// Creación de una instancia de GregorianCalendar con la fecha de contratación.
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		fecha_contrato = calendario.getTime();
	}

	// metodos de getter y setter para obtener el nombre
	public String dameNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodos de getter y setter para obtener el salario
	public double dameSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// metodos de getter y setter para obtener la fecha de contratación
	public Date dameFechaContrato() {
		return fecha_contrato;
	}

	public void setFecha_contrato(Date fecha_contrato) {
		this.fecha_contrato = fecha_contrato;
	}

	public static void main(String[] args) {
		Date fechaComparar = new Date(); // Obtiene la fecha actual.
		List<Empleado> ListaEmpleados = new ArrayList<>();

		// Crea tres empleados introducidaas por el usuario.
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Introduzca el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de incorporacion"))));

		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Dime el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Dime el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el día de incorporacion"))));

		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));

		// Añade los empleados a la lista.
		for (Empleado empleado : ListaEmpleados) {
			// Compara la fecha de contratación con el año 2021.
			int comparar = empleado.dameFechaContrato().compareTo(fechaComparar);

			if (comparar < 0) {
				subeSueldo(empleado, 5);
				mostrarInformacion(empleado);

			} else {
				mostrarInformacion(empleado); // Muestra la información del empleado.

			}

		}
	}

	// Método que aumenta el sueldo de un empleado en un porcentaje dado.
	public static void subeSueldo(Empleado a, double porcentaje) {
		double aumento = a.dameSueldo() * porcentaje / 100;
		a.setSueldo(a.dameSueldo() + aumento);
	}

	// Método que muestra la información de un empleado por ventana de diálogo y por consola.
	public static void mostrarInformacion(Empleado b) {

		// imprime por ventana dialogo//
		JOptionPane.showMessageDialog(null, "Nombre: " + b.dameNombre() + " \nSueldo: " + b.dameSueldo()
				+ " \nAlta de contrato: " + b.dameFechaContrato());
		// Línea de separación para que cuando se imprima quede dividida
		System.out.println("-----------------------------------------------------------------------------");
		// Muestra la información por consola.
		System.out.println("Nombre: " + b.dameNombre() + " \nSueldo: " + b.dameSueldo() + " \nAlta de contrato: "
				+ b.dameFechaContrato());
	}

}
