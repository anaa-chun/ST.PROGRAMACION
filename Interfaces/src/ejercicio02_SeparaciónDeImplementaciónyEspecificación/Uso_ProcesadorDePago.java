	package ejercicio02_SeparaciónDeImplementaciónyEspecificación;
	
	import javax.swing.JOptionPane;
	
	// @author: Ana Chun Gómez de Castro DAM 1
	
	public class Uso_ProcesadorDePago {
	
		public static void main(String[] args) {
			/*
			 * 2. Separación de implementación y especificación: Para el desarrollo de una
			 * aplicación de procesamiento de pagos, se utiliza la interfaz ProcesadorDePago
			 * que declara métodos como realizarPago y reembolsarPago, permitiendo cambiar
			 * entre diferentes proveedores de servicios de pago sin modificar el código que
			 * utiliza esta interfaz
			 */
	
			ProcesadorDePago a = new CaixaBank();
	        // Creación de una instancia de la clase CaixaBank que implementa la interfaz ProcesadorDePago
	
	
	        // Solicitar al usuario introducir la cantidad para realizar el pago
			double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad para pagar: "));
			a.realizarPago(cantidad); //llamo a este método
	
	        // Llamar al método reembolsarPago del objeto a (CaixaBank en este caso)
			double cantidadReembolso = Double
					.parseDouble(JOptionPane.showInputDialog("Ahora introduzca la cantidad para reembolsar"));
			a.reembolsarPago(cantidadReembolso); //llamo a este método
	
		}
	
	}
