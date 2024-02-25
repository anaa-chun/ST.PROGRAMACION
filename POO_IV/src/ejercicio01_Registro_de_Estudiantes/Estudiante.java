package ejercicio01_Registro_de_Estudiantes;

//@author: Ans Chun Gómez de Castro DAM1

// Defino la clase Estudiante
class Estudiante {
	/*
	 * Crea una clase Estudiante con atributos como nombre, edad y grado. Implementa
	 * métodos getter y setter para cada atributo. En el archivo principal, utiliza
	 * JOptionPane para ingresar los datos de 3 estudiantes y muestra la información
	 * de cada uno utilizando los getters.
	 */

	private String nombreEstudiante;
	private int edadEstudiante;
	private String gradoEstudiante;

	// Constructor
	public Estudiante(String nombre, int edad, String grado) {
		this.nombreEstudiante = nombre;
		this.edadEstudiante = edad;
		this.gradoEstudiante = grado;
	}

	// Métodos getter y setter para el atributo "nombre"
	public String getNombre() {
		return nombreEstudiante;
	}

	public void setNombre(String nombre) {
		this.nombreEstudiante = nombre;
	}

	// Métodos getter y setter para el atributo "edad"
	public int getEdad() {
		return edadEstudiante;
	}

	public void setEdad(int edad) {
		this.edadEstudiante = edad;
	}

	// Métodos getter y setter para el atributo "grado"
	public String getGrado() {
		return gradoEstudiante;
	}

	public void setGrado(String grado) {
		this.gradoEstudiante = grado;
	}

}
