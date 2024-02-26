package EjerciciodeDificultadIntermedia_SistemadeFigurasGeométricas;

import javax.swing.JOptionPane;

public class triángulos extends FiguraGeometrica {
	private double base;
	private double altura;

	public triángulos(String colorLinea, String colorRelleno, double base, double altura) {
		super(colorLinea, colorRelleno);
		this.base = base;
		this.altura = altura;
	}

	//metodo getter y setter para la altura
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//metodo getter y setter para la base
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void dibujar() {
		JOptionPane.showMessageDialog(null,"TRIÁNGULO " + "\nDibujando un triángulo de base " + base +" cm"+ " y altura " + altura
				+" cm"+ ", \nColor de línea: " + getColorLinea() + " \nColor de relleno: " + getColorRelleno());
	}

	public double calcularArea() { //Calcula el área del triángulo.
		return base * altura / 2;
	}

}
