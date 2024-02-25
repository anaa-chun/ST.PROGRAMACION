package ejercicio04_Calculadora_de_descuentos;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class calculadoraDescuentos {

	// Método principal
	public static void main(String[] args) {

		/*
		 * Crea un programa que aplique un descuento a un precio de producto basado en
		 * la cantidad adquirida. Utiliza una constante `final` para el porcentaje de
		 * descuento (por ejemplo, 10% para más de 5 unidades). El usuario ingresa el
		 * precio unitario y la cantidad de unidades mediante `JOptionPane`, y el
		 * programa calcula y muestra el precio total con el descuento aplicado si
		 * corresponde.
		 */

		// Creamos una instancia de la clase CalculadoraDescuentos
		calculadoraDescuentos calculadora = new calculadoraDescuentos();

		// Solicitamos al usuario ingresar el precio unitario
		String precioUnitarioStr = JOptionPane.showInputDialog("Introduzca el precio por unidad del producto:");
		double precioUnitario = Double.parseDouble(precioUnitarioStr);
		calculadora.setPrecioUnitario(precioUnitario);

		// Solicitamos al usuario ingresar la cantidad de unidades
		String cantidadStr = JOptionPane.showInputDialog("Dime la cantidad de unidades:");
		int cantidad = Integer.parseInt(cantidadStr);
		calculadora.setCantidad(cantidad);

		// Calculamos el precio total con descuento
		double precioTotal = calculadora.calcularPrecioTotal();

		// Mostramos el resultado utilizando JOptionPane.showMessageDialog
		JOptionPane.showMessageDialog(null, "El precio total con descuento es: " + precioTotal + " €");
	}

	private double precioUnitario;
	private int cantidad;

	// Constante para el porcentaje de descuento
	private static final double descuentoCantidad = 10.0;

	// Constructor
	public calculadoraDescuentos() {
		// Constructor vacío
	}

	// Getter para el precio unitario
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	// Setter para el precio unitario
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	// Getter para la cantidad
	public int getCantidad() {
		return cantidad;
	}

	// Setter para la cantidad
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Método para calcular el precio total con descuento
	public double calcularPrecioTotal() {
		double precioTotal = precioUnitario * cantidad;

		// Aplicar descuento si la cantidad es mayor a 5 unidades
		if (cantidad > 5) {
			double descuento = (descuentoCantidad / 100) * precioTotal;
			precioTotal -= descuento;
		}

		return precioTotal;
	}

}
