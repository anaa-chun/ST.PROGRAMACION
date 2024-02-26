package POO_IX;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM 1

//Clase abstracta Empleado
public abstract class Empleado {

	public static void main(String[] args) {
		/*
		 * Crea una clase abstracta Empleado con métodos abstractos como
		 * calcularSalario(). Luego, implementa subclases concretas como
		 * EmpleadoTiempoCompleto y EmpleadoTiempoParcial que hereden de esta clase y
		 * proporcionen implementaciones específicas para calcular el salario de cada
		 * tipo de empleado.
		 */

		// Obtener la información del empleado a tiempo completo desde el usuario
		String nombreTiempoCompleto = JOptionPane.showInputDialog("Introduzca el nombre del empleado ♂️ o la empleada ♀️:");
		int horasTrabajadasTiempoCompleto = Integer
				.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas ⏰:"));
		double salarioMensualTiempoCompleto = Double.parseDouble(
				JOptionPane.showInputDialog("Ahora Ingrese el salario mensual 🤑:"));

		// Crear el empleado a tiempo completo con la información ingresada por el usuario
		Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto(nombreTiempoCompleto,
				horasTrabajadasTiempoCompleto, salarioMensualTiempoCompleto);

		// Obtiene la información del empleado a tiempo parcial desde el usuario
		String nombreTiempoParcial = JOptionPane
				.showInputDialog("Introduzca otro nombre 👤:");
		int horasTrabajadasTiempoParcial = Integer
				.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas ⏰:"));
		double salarioPorHoraTiempoParcial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario 🤑:"));

		// Crea el empleado a tiempo parcial con la información ingresada por el usuario
		Empleado empleadoTiempoParcial = new EmpleadoTiempoParcial(nombreTiempoParcial, horasTrabajadasTiempoParcial,
				salarioPorHoraTiempoParcial);

		// Muestra el salario de cada empleado usando JOptionPane
		JOptionPane.showMessageDialog(null,
				"Salario de " + empleadoTiempoCompleto.getNombre() + ": " + empleadoTiempoCompleto.calcularSalario() +" €");

		JOptionPane.showMessageDialog(null,
				"Salario de " + empleadoTiempoParcial.getNombre() + ": " + empleadoTiempoParcial.calcularSalario()+" €");
	}

	private String nombre;
	private int horasTrabajadas;

	public Empleado(String nombre, int horasTrabajadas) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}

	// metodo getter y setter para el "Nombre"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodo getter y setter para las HorasTrabajadas
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas() { 
		return horasTrabajadas;
	}

	// Método abstracto para calcular el salario
	public abstract double calcularSalario();
}

//Subclase concreta EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto extends Empleado {
	private double salarioMensual;

	public EmpleadoTiempoCompleto(String nombre, int horasTrabajadas, double salarioMensual) {
		super(nombre, horasTrabajadas);
		this.salarioMensual = salarioMensual;
	}

	// Implementación del método abstracto calcularSalario()
	@Override
	public double calcularSalario() {
		return salarioMensual;
	}
}

//Subclase concreta EmpleadoTiempoParcial
class EmpleadoTiempoParcial extends Empleado {
	private double salarioPorHora;

	public EmpleadoTiempoParcial(String nombre, int horasTrabajadas, double salarioPorHora) {
		super(nombre, horasTrabajadas);
		this.salarioPorHora = salarioPorHora;
	}

	// Implementación del método abstracto calcularSalario()
	@Override
	public double calcularSalario() {
		return getHorasTrabajadas() * salarioPorHora;
	}
}
