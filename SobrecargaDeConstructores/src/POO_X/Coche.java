package POO_X;

import javax.swing.JOptionPane;

// @author: Ana Chun Gómez de Castro DAM 1

public class Coche {

	// Variables de instancia para almacenar propiedades del coche
	private String marca;
	private String modelo;
	private int año;
	private String color;

	// Constructor por defecto
	public Coche() {
		this.marca = "";
		this.modelo = "";
		this.año = 0;
		this.color = "";
	}

	// Constructor que toma parámetros para inicializar marca, modelo, año y color
	public Coche(String marca, String modelo, int año, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
	}

	// Métodos de getters y setters del atributo "marca"
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Métodos de getters y setters del atributo "modelo"
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Métodos de getters y setters para el "año"
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// Métodos de getters y setters para el "color"
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		/*
		 * 4. Define una clase Coche con constructores sobrecargados para establecer
		 * propiedades como la marca, el modelo, el año y el color. Luego, en el código
		 * principal, instancia objetos de esta clase utilizando diversas combinaciones
		 * de parámetros en los constructores para representar coches con diferentes
		 * características visuales y técnicas.
		 */

		// Instancia de un coche utilizando el constructor por defecto
		Coche cocheAnaChun = new Coche();

		cocheAnaChun.setMarca("Apple");
		cocheAnaChun.setModelo("Apple Car Plus");
		cocheAnaChun.setAño(2028);
		cocheAnaChun.setColor("Azul");

		// Muestra información en el panel de mensajes y en la consola
		mostrarInformacionCoche(cocheAnaChun, "¡ESTE COCHE PERTENECE A ANA CHUN!");

	}

	// Método para mostrar información sobre el coche
	public static void mostrarInformacionCoche(Coche cocheAnaChun, String T) {
		String mensaje = "\n" + T + "\n1) Marca: " + cocheAnaChun.getMarca() + " 🍎" + "\n2) Modelo: "
				+ cocheAnaChun.getModelo() + " 🚘" + "\n3) Año: " + cocheAnaChun.getAño() + " 📆" + "\n4) Color: "
				+ cocheAnaChun.getColor() + " 🌈";

		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
	}

	// Métodos adicionales, como obtener input, pueden ser útiles aquí según tus
	// necesidades.
}
