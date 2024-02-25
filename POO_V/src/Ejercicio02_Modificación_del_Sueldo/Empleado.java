package Ejercicio02_Modificación_del_Sueldo;

//@author: Ana Chun Gómez de Castro DAM1

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Empleado {// Definición de la clase Empleado

	/*
	 * Crea un objeto Empleado llamado empleado2 con datos a tu elección. Aumenta el
	 * sueldo de empleado2 en un 10% y muestra su nuevo sueldo.
	 * 
	 * Solución Paso a Paso: 
	 * 1. Crea un nuevo objeto Empleado. 
	 * 2. Utiliza el método subeSueldo para aumentar el sueldo en un 10%. 
	 * 3. Llama al método dameSueldo para obtener el nuevo sueldo. 
	 * 4. Imprime el nuevo sueldo en la consola
	 */

	// Variables de instancia para el nombre, salario y fecha de contrato del empleado
	private String nombre;
	private double sueldo;
	private Date fechaContrato;

	// Constructor para crear un objeto Empleado con los parámetros proporcionados
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {

		// Inicializar las variables de instancia con los valores proporcionados
		this.nombre = nombre;
		this.sueldo = sueldo;

		// Creo un objeto GregorianCalendar para representar la fecha de contrato
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		// Establezco la fecha de contrato usando GregorianCalendar
		fechaContrato = calendario.getTime();

	}

	// Método getter y setter para obtener el nombre del empleado
	public String dameNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método getter y setter para obtener el salario del empleado
	public double dameSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// Método getter y setter para obtener la fecha del contrato
	public Date dameFechaContrato() {
		return fechaContrato;
	}

	public void setFecha_contrato(Date fecha_contrato) {
		this.fechaContrato = fecha_contrato;
	}

	public static void main(String[] args) {
		// Creo un empleado (empleado1) usando la entrada del usuario
		Empleado empleado1 = new Empleado(JOptionPane.showInputDialog("Dime el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca tu sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de incorporacion")));
		mostrarInfo(empleado1);
		// Mostrar información sobre empleado1

		// Creo otro empleado (empleado2) usando la entrada del usuario
		Empleado empleado2 = new Empleado(JOptionPane.showInputDialog("Dime el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca tu sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de incorporacion")));

		mostrarInfo(empleado2); // muestra la información sobre empleado2

		// Solicito al usuario un porcentaje de aumento de salario y aplico a empleado2
		subeSueldo(empleado2, Double.parseDouble(JOptionPane.showInputDialog("Dime cual es el aumento del salario: ")));

	}

	// Método estático para aumentar el salario de un empleado
	public static void subeSueldo(Empleado a, double porcentaje) {
		// Calculo el aumento de salario
		double aumentoSueldo = a.dameSueldo() * porcentaje / 100;
		// Establezco el nuevo salario para el empleado
		a.setSueldo(a.dameSueldo() + aumentoSueldo);
	}

	public static void mostrarInfo(Empleado b) {
		// Mostrar un cuadro de diálogo con la información del empleado
		JOptionPane.showMessageDialog(null, "Nombre: " + b.dameNombre() + "\nSueldo: " + b.dameSueldo()
				+ "\nAlta de Contrato: " + b.dameFechaContrato());
		// Imprimir la información del empleado en la consola

		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("Nombre: " + b.dameNombre() + "\nSueldo: " + b.dameSueldo() + "\nAlta de contrato: "
				+ b.dameFechaContrato());
	}

}
