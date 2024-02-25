package Ejemplos_de_Código;

// Interfaz Figura: 
interface Figura {
	double calculoArea();
}

//Clase Circulo implementando la interfaz Figura

class Circulo implements Figura {
	/*
	 * Representa un círculo y implementa la interfaz Figura. Tiene un constructor
	 * que recibe el radio y una implementación del método calculoArea() para
	 * calcular el área del círculo.
	 */

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calculoArea() {
		return Math.PI * Math.pow(radio, 2);
	}
}

// Clase Rectangulo implementando la interfaz Figura
class Rectangulo implements Figura {
	/*
	 * Representa un rectángulo y también implementa la interfaz Figura. Tiene un
	 * constructor que recibe la longitud y la anchura, y una implementación del
	 * método calculoArea() para calcular el área del rectángulo.
	 */
	private double longitud;
	private double anchura;

	public Rectangulo(double longitud, double anchura) {
		this.longitud = longitud;
		this.anchura = anchura;
	}

	@Override
	public double calculoArea() {
		return longitud * anchura;
	}

	// Clase principal para demostrar el polimorfismo
	public class DemoPolimorfismo {
		public static void main(String[] args) {
			// Crear instancias de Circulo y Rectangulo
			Figura circulo = new Circulo(2.4);
			Figura rectangulo = new Rectangulo(3.754, 8.3);

			// Calcular áreas sin preocuparse por el tipo específico de figura
			double areaCirculo = circulo.calculoArea();
			double areaRectangulo = rectangulo.calculoArea();

			// Muestra los resultados
			System.out.println("Área del círculo: " + areaCirculo);
			System.out.println("Área del rectángulo: " + areaRectangulo);
		}
	}

}
