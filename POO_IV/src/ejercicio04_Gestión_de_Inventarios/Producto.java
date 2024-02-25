package ejercicio04_Gestión_de_Inventarios;

//@author: Ana Chun Gómez de Castro DAM1

public class Producto {

	/*
	 * Diseña una clase Producto con atributos para el nombre del producto, cantidad
	 * y precio. Implementa getters y setters. En el archivo principal, usa un bucle
	 * for y JOptionPane para ingresar información de varios productos. Luego,
	 * muestra un resumen del inventario
	 */

	private String nombre;
	private int cantidad;
	private double precio;

	// Constructor
	public Producto(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double calcularValorInventario() {
		return cantidad * precio;
	}

}
