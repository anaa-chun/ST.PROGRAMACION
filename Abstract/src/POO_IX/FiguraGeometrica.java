package POO_IX;

//@author: Ana Chun Gómez DAM 1

// Clase abstracta que define un método abstracto calcularArea()
public abstract class FiguraGeometrica {

	/*
	 * Crea una clase abstracta FiguraGeometrica que contenga un método abstracto
	 * calcularArea(). Luego, implementa subclases concretas como Rectangulo y
	 * Circulo que hereden de esta clase y proporcionen implementaciones para
	 * calcular el área específica de cada figura.
	 */

	public abstract double calcularArea();

	// Método main donde se crean instancias de Rectangulo y Circulo, y se muestra el resultado
	public static void main(String[] args) {
		// Creación de un objeto Rectangulo con base 11 y altura 6
		Rectangulo R = new Rectangulo(11, 6);
		
		// Creación de un objeto Circulo con radio 3
		Circulo C = new Circulo(3);

		// Muestra el área del rectángulo en cm^2
		System.out.println("El área del rectángulo es: " + R.calcularArea() + " cm ⬛");

		// Muestra el área del círculo en cm^2
		System.out.println("El área del círculo es: " + C.calcularArea() +  " cm ⚫");
	}
}

// Subclase Rectangulo que hereda de FiguraGeometrica
class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	// Constructor que recibe la base y la altura del rectángulo
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Implementación del método abstracto calcularArea() para el rectángulo
	public double calcularArea() {
		return base * altura;
	}
}

// Subclase Circulo que hereda de FiguraGeometrica
class Circulo extends FiguraGeometrica {
	private double radio;

	// Constructor que recibe el radio del círculo
	public Circulo(double radio) {
		this.radio = radio;
	}

	// Implementación del método abstracto calcularArea() para el círculo
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
}
