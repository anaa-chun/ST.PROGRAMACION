package ejercicio5_ClaseCelular;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Celular {

	public static void main(String[] args) {

		Celular caracteristicas = new Celular(); //// Declaración de la clase Uso_Celular
		//Creo de un objeto de tipo Celular llamado 'caracteristicas' mediante el constructor
		
		
		System.out.println("EL modelo es el " + caracteristicas.modelo + ", de " + caracteristicas.almacenamiento
		+ "GB de almacenamiento. Tiene una cámara de " + caracteristicas.camaraMP + "MP");
		// Imprime por consola de las características del Celular utilizando sus atributos
		
	}
}
