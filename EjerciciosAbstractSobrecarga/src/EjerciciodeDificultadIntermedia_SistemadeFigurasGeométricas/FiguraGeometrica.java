package EjerciciodeDificultadIntermedia_SistemadeFigurasGeométricas;

public abstract class FiguraGeometrica {
	private String colorLinea;
	private String colorRelleno;

	public abstract void dibujar(); // Método abstracto para dibujar la figura

	public abstract double calcularArea(); // Método abstracto para calcular el área de la figura.

	public FiguraGeometrica(String colorLinea, String colorRelleno) {
     //Constructor para inicializar los colores de línea y relleno de la figura.
		this.colorLinea=colorLinea;
		this.colorRelleno=colorRelleno;
	}

	//Método getter y setter para el color de línea
	public String getColorLinea() {
		return colorLinea;
	}

	public void setColorLinea(String colorLinea) {
		this.colorLinea = colorLinea;
	}
	
	
	//Método getter y setter para el color de relleno 
	public String getColorRelleno() {
		return colorRelleno;
	}

	public void setColorRelleno(String colorRelleno) {
		this.colorRelleno = colorRelleno;
	}
}
