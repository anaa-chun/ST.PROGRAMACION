package ejercicio03_Sistema_de_Calificaciones;

//@author: Ana Chun Gómez de Castro DAM1

public class Curso {

	/*
	 * Crea una clase Curso con atributos para el nombre del curso y la
	 * calificación. Usa JOptionPane para permitir al usuario ingresar el nombre del
	 * curso y la calificación, y almacénalos usando setters. Usa un switch case
	 * para categorizar la calificación en A, B, C, D, o F y muestra el resultado
	 */

	private String nombre;
	private double calificacion;

	public Curso() {

		this.nombre = "";
		this.calificacion = 0;
	}

	// Métodos de getter y setter para el atributo nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// Métodos de getter y setter para el atributo calificacion
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

}
