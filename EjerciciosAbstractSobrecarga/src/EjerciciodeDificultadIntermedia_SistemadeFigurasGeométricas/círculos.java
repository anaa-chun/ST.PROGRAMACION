package EjerciciodeDificultadIntermedia_SistemadeFigurasGeométricas;

import javax.swing.JOptionPane;

public class círculos extends FiguraGeometrica {
	private double radio; // Atributo específico para círculos

	// Constructor para crear un círculo con colores de línea y relleno especificados,
	// y un radio predeterminado de 1.0.

	public círculos(String colorLinea, String colorRelleno, double radio) {
		super(colorLinea, colorRelleno);
		radio = 1.0;
	}

	// metodo getter y setter para radio
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void dibujar() { // Método para dibujar el círculo.
		JOptionPane.showMessageDialog(null, "CÍRCULO" + "\nDibujando un círculo de radio " + radio + " cm"
				+ " \nColor de línea: " + getColorLinea() + "\nColor de relleno: " + getColorRelleno());
	}

	public double calcularArea() { // Calcula el área del círculo.
		return Math.PI * radio * radio;
	}

}
