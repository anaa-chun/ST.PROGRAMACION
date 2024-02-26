package ejercicio05_CombinaciónDeInterfacesParaAmpliarFuncionalidades;

//@author: Ana Chun Gómez de Castro DAM 1

public class Uso_Filtrable { // clase principal

	public static void main(String[] args) {
		/*
		 * Combinación de interfaces para ampliar funcionalidades: En una biblioteca de
		 * análisis de datos, se definen interfaces como Filtrable y Ordenable, con
		 * métodos para filtrar y ordenar conjuntos de datos, respectivamente. Las
		 * clases de datos pueden implementar ambas interfaces para proporcionar
		 * capacidades de filtrado y ordenamiento de manera flexible y modular.
		 */

		Datos d = new Datos(); // intancio la clase
		d.filtrar(); 
		d.ordenar();

	}

}
