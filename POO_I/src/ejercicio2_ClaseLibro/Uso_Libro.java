package ejercicio2_ClaseLibro;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Libro {

	public static void main(String[] args) {
		
		
        // Creación de un objeto de tipo Libro llamado 'propiedades' mediante el constructor
		Libro propiedades = new Libro();
		
        // Impresión por consola de las propiedades del libro utilizando sus atributos
		System.out.println("Muchas personas me han dicho que lea un libro que se titula " + propiedades.titulo
		+ " de la autora " + propiedades.autor + " y que tiene " + propiedades.numPaginas + " paginas.");

	}
}
