package Ejercicio01_Contador_de_Instancias;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class ContadorInstancias {

	public static void main(String[] args) {

		/*
		 * Objetivo: Crear una clase que cuente cuántas instancias de esa clase han sido
		 * creadas. Descripción: 
		 * 
		 * - Crea una clase llamada ContadorInstancias. 
		 * - Añade una variable estática que mantenga el recuento de las instancias creadas. 
		 * - Añade un constructor que incremente esta variable cada vez que se cree una
		 * nueva instancia. 
		 * - Añade un método estático que devuelva el número actual de instancias
		 */

		// Crear instancias de ContadorInstancias
		ContadorInstancias numInstancias = new ContadorInstancias();
		ContadorInstancias num2 = new ContadorInstancias();
		ContadorInstancias num3 = new ContadorInstancias();
		ContadorInstancias num4 = new ContadorInstancias();
		ContadorInstancias num5 = new ContadorInstancias();
		ContadorInstancias num6 = new ContadorInstancias();
		ContadorInstancias num7 = new ContadorInstancias();
		ContadorInstancias num8 = new ContadorInstancias();
		ContadorInstancias num9 = new ContadorInstancias();
		ContadorInstancias num10 = new ContadorInstancias();
		ContadorInstancias num11 = new ContadorInstancias();

		// Obtener y mostrar el número actual de instancias utilizando JOptionPane
		JOptionPane.showMessageDialog(null,
				"Número de instancias que se ha creado → " + ContadorInstancias.getContadorInstancias());
	}

	private static int contadorInstancias = 0;

	public ContadorInstancias() {
		// Incrementar el contador de instancias al crear una nueva instancia
		contadorInstancias++;
	}

	// Método estático para obtener el número actual de instancias
	public static int getContadorInstancias() {
		return contadorInstancias;
	}
}
