package Ejercicio4_ClaseProducto;

//@author: Ana Chun Gómez de Castro DAM1 

public class Producto { // Declaración de la clase principal llamada Producto

	/*
	 * Objetivo: Crea una clase Producto con tres propiedades privadas: nombre
	 * (String), precio (double), y stock (int). Desarrolla los métodos getter y
	 * setter necesarios.
	 * 
	 * Desafío adicional: En el setter de stock, asegúrate de que no sea un número
	 * negativo.
	 */

	// Propiedades privadas que almacena nombre, precio y stock del producto
	private String nombre;
	private double precio;
	private int stock;

	// Construyo la clase llamada Producto
	public Producto() {
		nombre = "Caviar Almas Osetra"; // Nombro un valor al nombre
		precio = 30.001; // Nombro un valor al precio
		stock = 23; // Nombro un valor al stock
	}

	// Método que devuelve una descripción del producto y su exclusividad
	public String dimeNombre() {
		return "El " + nombre + " es una variedad particularmente exclusiva y costosa de caviar.";
	}

	// Método getter para obtener el precio y el stock del producto

	public double dimePrecio() {
		return precio;
	}

	// Método getter
	public int dimeStock() {
		return stock;
	}

}
