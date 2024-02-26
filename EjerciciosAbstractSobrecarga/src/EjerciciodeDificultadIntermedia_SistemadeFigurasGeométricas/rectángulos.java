package EjerciciodeDificultadIntermedia_SistemadeFigurasGeométricas;

import javax.swing.JOptionPane;

public class rectángulos extends FiguraGeometrica {

	private double base;
	private double altura;

	public rectángulos(String colorLinea, String colorRelleno, double base, double altura) {
		super(colorLinea, colorRelleno);
		this.setBase(base);
		this.setAltura(altura);
	}

	// metodo getter y setter para la base
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	//metodo getter y setter para la altura
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void dibujar() {
		JOptionPane.showMessageDialog(null,
				"RECTÁNGULO " + "\nDibujando un rectángulo de base " + base + " cm" + " y de altura " + altura + " cm"
						+ ", \nColor de línea: " + getColorLinea() + " \nColor de relleno: " + getColorRelleno());
	}

	public double calcularArea() { // Calcula el área del rectángulo.
		return base * altura;
	}

}
