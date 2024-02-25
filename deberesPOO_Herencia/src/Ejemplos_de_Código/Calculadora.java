package Ejemplos_de_Código;

/*3) Polimorfismo Paramétrico*/

public class Calculadora {

	// Método suma en enteros
	public int suma(int a, int b) {
		return a + b;
	}

	// Método suma en decimales
	public double suma(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		// Uso de los métodos sobrecargados
		System.out.println("Suma de dos enteros: " + calculadora.suma(5, 10));
		System.out.println("Suma de dos números de punto flotante: " + calculadora.suma(3.7, 2.3));
	}
}
