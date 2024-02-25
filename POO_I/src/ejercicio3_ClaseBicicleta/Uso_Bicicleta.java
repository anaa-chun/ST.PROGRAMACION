package ejercicio3_ClaseBicicleta;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Bicicleta {

	// Método principal (main) que se ejecuta al correr el programa
	public static void main(String[] args) {

		// Creación de un objeto de tipo Bicicleta llamado 'a' mediante el constructor
		Bicicleta a = new Bicicleta();

		// Imprime por consola de información sobre la bicicleta "a"
		System.out.println("Mi bicileta tiene " + a.numRuedas + " ruedas, es una bicicleta " + a.tipo +" cuyo tamaño es de " + a.tamaño);

	}
}
