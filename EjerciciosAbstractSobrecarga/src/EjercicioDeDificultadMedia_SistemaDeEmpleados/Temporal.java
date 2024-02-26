package EjercicioDeDificultadMedia_SistemaDeEmpleados;

import javax.swing.JOptionPane;

//Clase que representa a un empleado temporal, que hereda de la clase Empleado.
class Temporal extends Empleado {
	private int periodoContrato; // atributo

	public Temporal(String nombre, int id, double salario, int periodoContrato) {// constructor
		super(nombre, id, salario);
		this.periodoContrato = periodoContrato;
	}

	public Temporal(String nombre, int id, int periodoContrato) {// otro constructor
		super(nombre, id);
		this.periodoContrato = periodoContrato;
	}

	// getter y setter para el periodo de contrato
	public int getPeriodoContrato() {
		return periodoContrato;
	}

	public void setPeriodoContrato(int periodoContrato) {
		this.periodoContrato = periodoContrato;
	}

	@Override
	public double calcularSalario() { // Calcula el salario del empleado temporal
		return getSalario();
	}

	@Override
	public void mostrarDetalles() { // muestra los detalles
		String mensaje = "2) EMPLEADO TEMPORAL" + "\nNombre: " + getNombre() + "\nID: " + getID() + "\nSalario: "
				+ calcularSalario() + "\nPeriodo de contrato: " + periodoContrato;

		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);

		System.out.println("");

	}

}
