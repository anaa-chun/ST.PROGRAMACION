package Ejercicio02_Uso_de_Constructores_en_Herencia;

//@author: Ana Chun Gómez de Castro DAM1

public class Persona {

	// Atributos privados de la clase "Persona".
	private String nombre;
	private int edad;

	// Constructor de la persona
	public Persona(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	// Método getter y setter para obtener el valor del atributo "nombre".
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método getter y setter para obtener el valor del atributo "edad".
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
