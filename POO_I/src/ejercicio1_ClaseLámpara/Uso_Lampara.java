package ejercicio1_ClaseLámpara;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Lampara {

	// Método principal (main) que se ejecuta al correr el programa
	public static void main(String[] args) {

		// Creación de un objeto de tipo Lampara llamado 'caracteristicas' mediante el constructor
		Lampara caracteristicas = new Lampara();

		// Impresión por consola de las características de la lámpara utilizando sus atributos
		System.out.println("El tipo de lampara es " + caracteristicas.tipo + " que tiene " + caracteristicas.potencia
		+ " de potencia y es de color " + caracteristicas.color);

	}
}
