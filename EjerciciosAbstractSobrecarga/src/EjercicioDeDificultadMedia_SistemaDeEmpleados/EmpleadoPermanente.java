package EjercicioDeDificultadMedia_SistemaDeEmpleados;

import javax.swing.JOptionPane;

class EmpleadoPermanente extends Empleado {
	private double beneficiosAdicionales;

	public EmpleadoPermanente(String nombre, int id, double salario, double beneficiosAdicionales) { // constructor
		super(nombre, id, salario);
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	public EmpleadoPermanente(String nombre, int id, double beneficiosAdicionales) { // otro constructor
		super(nombre, id);
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	// getter y setter BeneficiosAdicionales
	public double getBeneficiosAdicionales() {
		return beneficiosAdicionales;
	}

	public void setBeneficiosAdicionales(double beneficiosAdicionales) {
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	@Override
	public double calcularSalario() { // calcula salario
		return getSalario() + beneficiosAdicionales;
	}

	@Override
	public void mostrarDetalles() { //muestra los detalles en mensaje de panel
		String mensaje = "1) EMPLEADO CONTRATISTA" + "\nNombre: " + getNombre() + "\nID: " + getID()
				+ "\nSalario: " + calcularSalario() + "\nBeneficios Adicionales: " + beneficiosAdicionales;

		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
		
		System.out.println("");
	}

}
