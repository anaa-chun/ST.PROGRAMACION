package ejercicio01_DefiniciónDeUnContratoParaClasesRelacionadas;

//@author: Ana Chun Gómez de Castro DAM 1

import javax.swing.JOptionPane;

public class Uso_Inventariable {// clase principal

	public static void main(String[] args) {
		/*
		 * 1. Definición de un contrato para clases relacionadas: En un sistema de
		 * gestión de inventarios, se define la interfaz Inventariable con métodos como
		 * obtenerStock y actualizarStock, que todas las clases representando diferentes
		 * tipos de productos deben implementar para asegurar que se puedan gestionar de
		 * manera uniforme dentro del sistema.
		 */

		Producto bolsoLongchamp = new Producto(11); // instancio la clase
		
		//muestra el mensaje
		JOptionPane.showMessageDialog(null, "Stock inicial " + bolsoLongchamp.obtenerStock());

		bolsoLongchamp.actualizarStock(5); //actualiza sumando 5 unidades

		JOptionPane.showMessageDialog(null, "Stock actualizado " + bolsoLongchamp.obtenerStock());

	}

}
