package ejercicio4_ClaseReloj;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Reloj {

	public static void main(String[] args) { // (main) se ejecuta al correr el programa

		Reloj caracteristicas = new Reloj();
		// Creación de un objeto de tipo Reloj llamado 'caracteristicas' mediante el constructor

		System.out.println("Quiero comprar un reloj de la marca " + caracteristicas.marca + " que cuesta "
		+ caracteristicas.precio + " € y además tiene que ser " + caracteristicas.digital);
		// Impresión por consola de las características del reloj utilizando sus atributos
	}
}
