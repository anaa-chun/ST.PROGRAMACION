package Ejercicio01_CreaciónyUsoBásicodelaClaseEmpleado;

import java.util.*;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM1

public class Empleado {

	/*
	 * Crea un objeto de la clase Empleado llamado empleado1, con tu nombre, un
	 * sueldo de 3000.0, y una fecha de contrato del 1 de enero de 2022. Luego,
	 * imprime el nombre, sueldo y fecha de contrato de empleado1.
	 * 
	 * Solución Paso a Paso: 
	 * 1. En la función main de Uso_Empleado, crea un objeto Empleado. 
	 * 2. Pasa los parámetros apropiados al constructor (tu nombre, 000.0, 2022, 1, 1). 
	 * 3. Utiliza los métodos dameNombre, dameSueldo y
	 * dameFechaContrato para obtener los datos del empleado. 
	 * 4. Imprime estos datos en la consola.
	 * 
	 */

	private String nombre;
	private double sueldo;
	private Date fechaContrato;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		fechaContrato = calendario.getTime();
	}

	public String dameNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double dameSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date dameFechaContrato() {
		return fechaContrato;
	}

	public void setFecha_contrato(Date fecha_contrato) {
		this.fechaContrato = fecha_contrato;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado(JOptionPane.showInputDialog("Dime el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca tu sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de incorporacion")));
		mostrarinfo(empleado1);
	}

	public static void mostrarinfo(Empleado a) {

		JOptionPane.showMessageDialog(null, "Tu Nombre: " + a.dameNombre() + " \nSueldo: " + a.dameSueldo()
				+ " \nAlta de contrato: " + a.dameFechaContrato());
		System.out.println("Nombre: " + a.dameNombre() + " \nSueldo: " + a.dameSueldo() + " \nAlta de contrato: "
				+ a.dameFechaContrato());
	}

}