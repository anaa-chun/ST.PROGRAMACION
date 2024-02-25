package ejercicio04_Gestión_de_Inventarios;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class Uso_Producto {

	/*
	 * Diseña una clase Producto con atributos para el nombre del producto, cantidad
	 * y precio. Implementa getters y setters. En el archivo principal, usa un bucle
	 * for y JOptionPane para ingresar información de varios productos. Luego,
	 * muestra un resumen del inventario
	 */

	public static void main(String[] args) {
		int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Dime la cantidad de productos:"));

		// Arreglo para almacenar objetos Producto
		Producto[] inventario = new Producto[cantidadProductos];

		// Bucle for usado
		for (int i = 0; i < cantidadProductos; i++) {
			String nombre = JOptionPane.showInputDialog("Dime el nombre del producto  por favor: ");
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto: "));
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Dime cual es el precio del producto: "));

			// Crear un nuevo objeto Producto y almacenarlo en el inventario
			inventario[i] = new Producto(nombre, cantidad, precio);
		}

		// Mostrar resumen del inventario
		StringBuilder resumenInventario = new StringBuilder("Resumen del Inventario:\n");
		for (Producto producto : inventario) {
			resumenInventario.append("Producto: ").append(producto.getNombre()).append(", Cantidad: ")
					.append(producto.getCantidad()).append(", Precio: $").append(producto.getPrecio())
					.append(", Valor total: $").append(producto.calcularValorInventario()).append("\n");
		}

		JOptionPane.showMessageDialog(null, resumenInventario.toString());
	}

}
