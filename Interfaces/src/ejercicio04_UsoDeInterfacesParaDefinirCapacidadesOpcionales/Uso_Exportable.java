package ejercicio04_UsoDeInterfacesParaDefinirCapacidadesOpcionales;

//@auhtor: Ana Chun Gómez de Castro DAM 1

// Clase principal 
public class Uso_Exportable {

	public static void main(String[] args) {
		/*
		 * Uso de interfaces para definir capacidades opcionales: Se define la interfaz
		 * Exportable con el método exportarDatos, que es implementada por aquellas
		 * clases de un sistema de reportes que son capaces de exportar sus datos a
		 * diferentes formatos, como CSV o PDF, proporcionando flexibilidad en las
		 * capacidades de exportación.
		 */

		// Creación de instancias de clases que implementan la interfaz Exportable
		Exportable a = new CSV();
		a.exportarDatos(); //llamo a este metodo

		Exportable b = new PDF();
		b.exportarDatos(); //llamo a este metodo

		Exportable c = new Reporte();
		c.exportarDatos(); //llamo a este metodo
	}

	// Método estático que acepta un objeto que implementa la interfaz Exportable y
	// llama a su método exportarDatos
	public static void exportarDatos(Exportable exportable) {
		exportable.exportarDatos();
	}
}
