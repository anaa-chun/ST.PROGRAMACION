package Ejercicio05_Clase_Dispositivo_Electrónico_Clase_Telefono_y_Clase_Smartphone;

//@author: Ana Chun Gómez De Castro DAM1

import javax.swing.JOptionPane;

public class Main {

	/*
	 * 5. Clase DispositivoElectrónico, Clase Telefono y Clase Smartphone: Aunque
	 * Java no soporta herencia múltiple directamente, este ejercicio busca simular
	 * una jerarquía que lo requiera. Crea una clase DispositivoElectrónico con
	 * atributos como fabricante y añoDeFabricación. Luego, define una interfaz
	 * Telefono con métodos llamar y recibirLlamadas. Finalmente, crea una clase
	 * Smartphone que herede de DispositivoElectrónico e implemente la interfaz
	 * Telefono, añadiendo características propias de un smartphone como
	 * instalarAplicacion.
	 */

	
	public static void main(String[] args) {
		//Instancio de la clase Smartphone con el fabricante "iPhone" + año de fabricación
		Smartphone a = new Smartphone("iPhone", 2007);

		// Se muestra un mensaje con el fabricante del Smartphone + el año de fabricación del Smartphone.
		JOptionPane.showMessageDialog(null, "\nFabricante: " + a.getFabricante() + "\nAño de Fabricación: " + a.getAñoFabricacion() );
		

		// Se realiza una llamada con el número especificado en el método llamar de la clase Smartphone.
		a.llamar("647 882 459");
		// Se muestra un mensaje indicando que se está recibiendo una llamada y el estado de instalación de la aplicación.
		a.recibirLlamadas();
		// Se intenta invocar el método instalarAplicacion() en la instancia de Smartphone, pero el resultado no se utiliza ni se muestra.
		a.instalarAplicacion();
	}

}
