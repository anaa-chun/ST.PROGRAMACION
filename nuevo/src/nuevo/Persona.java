package nuevo;

// Explicaicond de Jose Manuel Rayo

public class Persona {
	private String Nombre;
	private int Edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		setNombre(nombre);
		setEdad(edad);
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}

}
