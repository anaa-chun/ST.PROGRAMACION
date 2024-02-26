package EjercicioDeDificultadMedia_SistemaDeEmpleados;

import javax.swing.JOptionPane;

class Contratista extends Empleado {
	private int beneficiosAdicionales; //atributo específico

	public Contratista(String nombre, int ID, double Salario, int beneficiosAdicionales) { //constructor
		super(nombre, ID, Salario);
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	public Contratista(String nombre, int ID, int beneficiosAdicionales) { // otro constructor
		super(nombre, ID);
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	//metodo getter y setter para el atrubuto BeneficiosAdicionales
	public int getBeneficiosAdicionales() {
		return beneficiosAdicionales;
	}

	public void setBeneficiosAdicionales(int beneficiosAdicionales) {
		this.beneficiosAdicionales = beneficiosAdicionales;
	}

	@Override
	public double calcularSalario() { // calcula el salario 
		return getSalario();
	}

	@Override
	public void mostrarDetalles() { // muestra los detalles
		
		
		String mensaje = "3) EMPLEADO CONTRATISTA" + "\nNombre: " + getNombre() + "\nID: " + getID()
				+ "\nSalario: " + calcularSalario() + "\nBeneficios Adicionales: " + beneficiosAdicionales;

		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);

	}

}
