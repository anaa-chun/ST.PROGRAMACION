package POO_X;

import javax.swing.JOptionPane;

// @author: Ana Chun Gñomez de Castro DAM1

public class Empleado {

	private String nombre;
	private double salario;
	private String departamentoEmpleado;

	public static void main(String[] args) {
		/*
		 * 1. Implementa una clase llamada Empleado con constructores sobrecargados que
		 * permitan inicializar el nombre, el salario y el departamento del empleado.
		 * Luego, en el programa principal, crea instancias de esta clase utilizando
		 * diferentes combinaciones de parámetros en los constructores para representar
		 * empleados con distintas características.
		 */

		// Crear una instancia de la clase Empleado con valores proporcionados
		Empleado a = new Empleado("Ana Chun", 8685.3, "Ciencia de la Computación e Inteligencia Artificial.");

		// Crear un mensaje con la información del empleado
		String mensaje = "\n1) Nombre: " + a.getNombre() + " ♀️‍" + "\n2) Salario: " + a.getSalario() + " 💶"
				+ "\n3) Departamento del empleado: " + a.getDepartamentoEmpleado() + " 🏢";

		// Mostrar el mensaje en un panel de mensajes y en la consola
		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
	}

	// Constructor sin parámetros
	public Empleado() {
		this.nombre = " ";
		this.salario = 0.0;
		this.departamentoEmpleado = " ";
	}

	// Constructor con nombre y salario
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamentoEmpleado = " ";
	}

	// Constructor con nombre, salario y departamento
	public Empleado(String nombre, double salario, String departamentoEmpleado) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamentoEmpleado = departamentoEmpleado;
	}

	// Métodos getter y setter para el atributo "Salario"
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Métodos getter y setter para el atributo "nombre"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para el atributo "departamento"
	public String getDepartamentoEmpleado() {
		return departamentoEmpleado;
	}

	public void setDepartamentoEmpleado(String departamentoEmpleado) {
		this.departamentoEmpleado = departamentoEmpleado;
	}
}
