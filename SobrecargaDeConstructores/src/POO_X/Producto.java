package POO_X;

import javax.swing.JOptionPane;

// @author: Ana Chun Gómez de Castro DAM 1

public class Producto {

	private String nombre;
	private double precio;
	private int cantidadEnStock;

	// Constructor sin parámetros
	public Producto() {
		this.nombre = "";
		this.precio = 0.0;
		this.cantidadEnStock = 0;
	}

	// Constructor con nombre y precio
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = 0;
	}

	// Constructor con nombre, precio y cantidad en stock
	public Producto(String nombre, double precio, int cantidadEnStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}

	// Métodos getter y setter para el atributo "nombre"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para el atributo "precio"
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Métodos getter y setter para el atributo "cantidadEnStock"
	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}

	public static void main(String[] args) {
		/*
		 * 3. Desarrolla una clase Producto que tenga constructores sobrecargados para
		 * inicializar su nombre, precio y cantidad en stock. A continuación, en el
		 * programa principal, crea objetos de esta clase utilizando diferentes
		 * variantes de los constructores para representar productos con distintas
		 * características y cantidades disponibles.
		 */

		// Creo una instancia de la clase Producto con valores que he puesto
		Producto producto = new Producto("Laptop Razer Blade 16 2024", 5299.0, 11);

		// Crear un mensaje con la información de los productos
		String mensaje = "\nNombre del producto: " + producto.getNombre() + " 💻" + "\nPrecio: " + producto.getPrecio()
				+ " € 💶" + "\nCantidad en Stock: " + producto.getCantidadEnStock() + " 🗠";

		// Mostrar el mensaje en la consola
		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
	}
}
