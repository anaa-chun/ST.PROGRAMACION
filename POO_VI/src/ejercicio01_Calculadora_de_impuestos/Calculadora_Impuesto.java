package ejercicio01_Calculadora_de_impuestos;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class Calculadora_Impuesto {

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que calcule el impuesto sobre un producto. Usa una
		 * constante `final` para representar el porcentaje de impuesto (por ejemplo,
		 * 15%). El usuario debe ingresar el precio del producto mediante `JOptionPane`,
		 * y la aplicación debe mostrar el precio final después de agregar el impuesto.
		 */

		// Solicitamos al usuario el nombre del producto
		String nombreProducto = JOptionPane.showInputDialog("Dime el nombre del producto:");

		// Solicitamos al usuario el precio del producto y convertir a double
		double precioProducto = Double
				.parseDouble(JOptionPane.showInputDialog("Ahora dime el precio de este producto: "));

		// Crear una instancia de la clase Uso_Calculadora con los datos proporcionados
		Uso_Calculadora calculadora = new Uso_Calculadora(nombreProducto, precioProducto, 15);

		// Mostrar un mensaje con el nombre del producto y el precio final con impuesto
		JOptionPane.showMessageDialog(null,
				calculadora.getNombre() + "\nPrecio Final: " + calculadora.calcularPrecioFinal() + " €");
	}

	// Clase interna que representa el uso de la calculadora de impuestos
	static class Uso_Calculadora {

		private String nombre;
		private double precioProducto;
		private final double porcentajeImpuesto; // Constante que representa el porcentaje de impuesto

		// Constructor para inicializar los atributos de la calculadora
		public Uso_Calculadora(String nombre, double precio, double porcentajeImpuesto) {
			this.nombre = nombre;
			this.precioProducto = precio;
			this.porcentajeImpuesto = porcentajeImpuesto;
		}

		// Getter para el atributo Nombre
		public String getNombre() {
			return "Producto: " + nombre;
		}

		// Getter para el atributo Precio
		public double getPrecio() {
			return precioProducto;
		}

		// Método para calcular el precio final con impuesto
		public double calcularPrecioFinal() {
			double impuesto = getPrecio() * (getPorcentajeImpuesto() / 100);
			return getPrecio() + impuesto;
		}

		// Getter para el atributo Porcentaje Impuesto
		public double getPorcentajeImpuesto() {
			return porcentajeImpuesto;
		}
	}
}
