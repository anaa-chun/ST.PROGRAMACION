package Clases;

public class Utiles {
	public static double redondear(double numero, int n) {
		// 145.678 , 2
		// 145.678*100 -----> 14567.8
		// Math.round(14567.8) -----14568
		// 14568/100

		double potencia = Math.pow(10, n);
		return Math.round(numero * potencia) / potencia;

	}

	public static double truncar(double numero, int n) {
		// 145.678 , 2
		// 145.678*100 -----> 14567.8
		// Math.round(14567.8) -----14568
		// 14568/100

		double potencia = Math.pow(10, n);
		return ((int) (numero * potencia)) / potencia;

	}
}
