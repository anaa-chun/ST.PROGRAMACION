package ejercicio03_Comprobador_de_edad_para_votar;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class comprobarEdad {

	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que determine si una persona es elegible para votar.
		 * Usa una constante `final` para la edad mínima requerida para votar (por
		 * ejemplo, 18 años). El usuario introduce su edad a través de `JOptionPane`, y
		 * el programa indica si es elegible o no para votar.
		 */

		// Creamos una instancia de la clase comprobarEdad
		comprobarEdad aplicacion = new comprobarEdad();

		// Solicitamos la edad al usuario
		String inputEdad = JOptionPane.showInputDialog("Dime la edad que tienes: ");

		// Verificamos si la entrada es un número válido
		if (esNumeroValido(inputEdad)) {
			// Convertimos la entrada a un entero
			int edadUsuario = Integer.parseInt(inputEdad);

			// Establecemos la edad en la aplicación
			aplicacion.setEdad(edadUsuario);

			// Determinamos la elegibilidad y mostrar el resultado
			String mensajeResultado = aplicacion.esElegibleParaVotar() ? "¡WOW!, Eres elegible para votar!"
					: "Lo siento, no eres elegible para votar :(";
			JOptionPane.showMessageDialog(null, mensajeResultado);
		} else {
			// Mostramos un mensaje de error si la entrada no es un número válido
			JOptionPane.showMessageDialog(null, "ERROR, debes introducir número entero.", "Error de entrada",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// Atributos de la clase comprobarEdad
	private int edad;
	private final int edadMinimaParaVotar = 18;

	// Getter y Setter para el atributo "la edad"
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método para verificar si la persona es elegible para votar
	public boolean esElegibleParaVotar() {
		return edad >= edadMinimaParaVotar;
	}

	// Método estático para verificar si una cadena es un número válido
	private static boolean esNumeroValido(String input) {
		// Verificamos si la cadena es numérica
		return input != null && input.matches("\\d+");
	}

}
