package POO_X;

import javax.swing.JOptionPane;

// @author: Ana Chun Gómez de Castro DAM 1

public class Estudiante {

	private int edad;
	private double promedioAcademico;

	// Constructor por defecto
	public Estudiante() {
		this.nombre = "";
		this.edad = 0;
		this.promedioAcademico = 0;
	}

	// Atributos de la clase
	private String nombre;

	// Métodos getter y setter para el atributo "nombre"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para el atributo "Edad"
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Métodos getter y setter para el atributo "PromedioAcademico"
	public double getPromedioAcademico() {
		return promedioAcademico;
	}

	public void setPromedioAcademico(double promedioAcademico) {
		this.promedioAcademico = promedioAcademico;
	}

	// Constructor que toma parámetros para inicializar nombre, edad y promedio académico
	public Estudiante(String nombre, int edad, double promedioAcademico) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedioAcademico = promedioAcademico;
	}

	// Método para mostrar información sobre el estudiante
	public static void mostrarInformacionEstudiante(Estudiante estudiante, String T) {
		// Construcción del mensaje con información del estudiante
		String mensaje = "\n" + T + "\n1) Nombre: " + estudiante.getNombre() + " 👤" + "\n2) Edad: "
				+ estudiante.getEdad() + " 🎂" + "\n3) Promedio Académico: " + estudiante.getPromedioAcademico()
				+ " 📚";

		// Mostrar el mensaje en un cuadro de diálogo y en la consola
		JOptionPane.showMessageDialog(null, mensaje);
		System.out.println(mensaje);
	}

	public static void main(String[] args) {
		/*
		 * 5. Crea una clase Estudiante que tenga constructores sobrecargados para
		 * inicializar su nombre, edad y promedio académico. Después, en el programa
		 * principal, genera instancias de esta clase utilizando distintas combinaciones
		 * de parámetros en los constructores para representar estudiantes con
		 * diferentes perfiles y logros académicos.
		 */

		// Crear una instancia de la clase Estudiante
		Estudiante estudiante = new Estudiante();

		// Solicito información al usuario mediante JOptionPane
		estudiante.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del estudiante: ");
		estudiante.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ahora dime su edad: "));
		estudiante.promedioAcademico = Double
				.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es su promedio académico?: "));

		// Mostrar información del estudiante
		mostrarInformacionEstudiante(estudiante, "DATOS DEL/LA ESTUDIANTE");
	}
}
