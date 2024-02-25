package Ejercicio03_Comparación_de_Fechas_de_Contrato;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM1

public class Empleado { // Definición de la clase Empleado

	/*
	 * Crea dos objetos Empleado, empleado3 y empleado4, con fechas de contrato
	 * diferentes. Escribe un código que compare sus fechas de contrato y determine
	 * cuál fue contratado primero.
	 * 
	 * Solución Paso a Paso: 
	 * 1. Crea dos objetos Empleado con fechas de contrato diferentes. 
	 * 2. Utiliza el método dameFechaContrato para obtener las fechas de ambos empleados. 
	 * 3. Compara las fechas utilizando los métodos de la clase Date. 
	 * 4. Imprime cuál empleado fue contratado primero.
	 * 
	 */

	// Variables privadas
	private String Nombre;
	private double sueldo;
	private Date fecha_contrato;

	// Constructor para inicializar el objeto Empleado con nombre, sueldo y fecha de
	// contrato
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		Nombre = nom;
		sueldo = sue;

		// Creación de un objeto GregorianCalendar para representar la fecha de contrato
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		fecha_contrato = calendario.getTime();
	}

	// Método getter y setter para el nombre
	public String dameNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	// Método getter y setter para el salario
	public double dameSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// Método getter y setter para la fecha de contratación
	public Date dameFechaContrato() {
		return fecha_contrato;
	}

	public void setFecha_contrato(Date fecha_contrato) {
		this.fecha_contrato = fecha_contrato;
	}

	public static void main(String[] args) {
		// Creación de dos objetos Empleado con entrada de usuario
		Empleado empleado3 = new Empleado(JOptionPane.showInputDialog("Introduzca el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de incorporacion")));

		Empleado empleado4 = new Empleado(JOptionPane.showInputDialog("Dime el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Dime el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Dime el día de incorporacion")));

		// Llamo al método para comparar y mostrar información sobre los empleados
		mostrarInformacion(empleado3, empleado4); // metodo de los objetos
	}

	// Método para comparar y mostrar información sobre dos empleados
	public static void mostrarInformacion(Empleado a, Empleado b) {
		// Comparación de las fechas de contrato utilizando el método compareTo de la
		// clase Date
		int comparar = a.dameFechaContrato().compareTo(b.dameFechaContrato());

		// Mostrar información basada en el resultado de la comparación
		if (comparar < 0) {
			JOptionPane.showConfirmDialog(null, "\nEl primer contrato fue: " + "\nNombre: " + a.dameNombre()
					+ "\nSueldo: " + a.dameSueldo() + "\nAlta de Contrato: " + a.dameFechaContrato());
		} else if (comparar > 0) {
			JOptionPane.showMessageDialog(null, "\nFue contratado primero: " + "\nNombre: " + b.dameNombre()
					+ " \nSueldo: " + b.dameSueldo() + " \nAlta de contrato: " + b.dameFechaContrato());

			System.out.println("\nFue contratado primero " + " Nombre: " + b.dameNombre() + " \nSueldo: "
					+ b.dameSueldo() + " \nAlta de contrato: " + b.dameFechaContrato());
		} else {
			JOptionPane.showMessageDialog(null, "\nDatos Incorrectos");
		}
	}

}
