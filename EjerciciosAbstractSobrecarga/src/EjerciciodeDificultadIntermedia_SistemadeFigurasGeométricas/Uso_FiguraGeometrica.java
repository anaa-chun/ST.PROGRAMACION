package EjerciciodeDificultadIntermedia_SistemadeFigurasGeométricas;

//@author: Ana Chun Gómez De Castro DAM 1

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM 1

public class Uso_FiguraGeometrica {

	public static void main(String[] args) {
		/*
		 * Considera un programa para dibujar figuras geométricas como círculos,
		 * rectángulos y triángulos. Cada figura tiene propiedades como el color de
		 * línea y relleno, pero también propiedades específicas como el radio para
		 * círculos o base y altura para triángulos y rectángulos. - Diseña una clase
		 * abstracta FiguraGeometrica que incluya propiedades comunes como colorLinea y
		 * colorRelleno, y métodos abstractos como dibujar() y calcularArea(). -
		 * Implementa clases concretas para cada tipo de figura geométrica. Cada clase
		 * debe tener varios constructores que permitan la creación de figuras con
		 * diferentes niveles de detalle. Por ejemplo, un círculo puede ser creado solo
		 * con su radio, o con su radio más colores de línea y relleno. - Aprovecha la
		 * sobrecarga de constructores en la clase abstracta FiguraGeometrica para
		 * ofrecer flexibilidad en la creación de figuras, permitiendo especificar solo
		 * algunos atributos y utilizando valores predeterminados para los demás.
		 */

		// Crear un círculo con parámetros
		FiguraGeometrica c = new círculos("oro", "plata", 4.0);
		c.dibujar();
		JOptionPane.showMessageDialog(null, "El área del círculo es " + c.calcularArea() + " ㎠");

		// Crear un rectángulo con parámetros
		FiguraGeometrica r = new rectángulos("rojo", "azul", 4.0, 3.0);
		JOptionPane.showMessageDialog(null, "El área del rectángulo es " + r.calcularArea() + " ㎠");
		r.dibujar();

		// Crear un triángulo con parámetros
		FiguraGeometrica t = new triángulos("verde", "amarillo", 5.0, 4.0);
		JOptionPane.showMessageDialog(null, "El área del triángulo es " + t.calcularArea() + " ㎠");
		t.dibujar();
	}
}
