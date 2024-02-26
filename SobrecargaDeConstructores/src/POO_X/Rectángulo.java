package POO_X;

import javax.swing.JOptionPane;

// @author: Ana Chun Gómez de Castro DAM 1

public class Rectángulo {

	// Estas son las variables de instancia para almacenar el ancho y la altura del rectángulo
	private double ancho;
	private double altura;

	// Constructor
	public Rectángulo() {
		this.ancho = 0.0;
		this.altura = 0.0;
	}

	// Constructor que toma parámetros para inicializar el ancho y la altura
	public Rectángulo(double ancho, double altura) {
		this.ancho = ancho;
		this.altura = altura;
	}

	// Métodos de getters y setters del valor del ancho y de la altura
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static void main(String[] args) {
		/*
		 * 2. Crea una clase Rectángulo con constructores sobrecargados para definir su
		 * ancho y altura. Posteriormente, en el código principal, instanciar objetos de
		 * esta clase utilizando distintas combinaciones de parámetros en los
		 * constructores para representar rectángulos con diferentes dimensiones.
		 */

		// Obtener las dimensiones del primer rectángulo
		double anchoRectangulo1 = obtenerDoubleInput("Introduce el ancho del primer rectángulo:");
		double alturaRectangulo1 = obtenerDoubleInput("Introduce la altura del primer rectángulo:");

		// Primera instancia del primer rectángulo
		Rectángulo rectangulo1 = new Rectángulo(anchoRectangulo1, alturaRectangulo1);

		// Obtener las dimensiones del tercer rectángulo del usuario
		int anchoRectangulo2 = obtenerIntInput("Introduce el ancho del segundo rectángulo:");
		int alturaRectangulo2 = obtenerIntInput("Introduce la altura del segundo rectángulo:");

		// Segunda instancia del segundo rectángulo
		Rectángulo rectangulo2 = new Rectángulo(anchoRectangulo2, alturaRectangulo2);

		// Muestra información en el panel de mensajes y en la consola
		mostrarInformacion(rectangulo1, "PRIMER TRIÁNGULO");
		System.out.println(" ");
		System.out.println("------------------------------------------");
		mostrarInformacion(rectangulo2, "SEGUNDO TRIÁNGULO");

	}

	// Método para mostrar información del rectángulo
	public static void mostrarInformacion(Rectángulo r, String t) {

		String mensaje = "\n" + t + "\nAncho: " + r.getAncho() + " 📏" + "\nAltura: " + r.getAltura() + " 📐";

		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
	}

	// Método para obtener un valor double
	public static double obtenerDoubleInput(String mensaje) {
		String input = JOptionPane.showInputDialog(null, mensaje);
		return Double.parseDouble(input);
	}

	// Método para obtener un valor int
	public static int obtenerIntInput(String mensaje) {
		String input = JOptionPane.showInputDialog(null, mensaje);
		return Integer.parseInt(input);
	}
}
