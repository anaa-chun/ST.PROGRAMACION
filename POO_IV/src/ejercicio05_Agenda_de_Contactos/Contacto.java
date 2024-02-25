package ejercicio05_Agenda_de_Contactos;

//@author: Ana Chun Gómez de Castro DAM1

class Contacto {

	/*
	 * 5.Agenda de Contactos: Implementa una clase Contacto con atributos para
	 * nombre, número de teléfono y dirección de email. Usa getters y setters para
	 * estos atributos. En el archivo principal, crea un menú con JOptionPane que
	 * permita al usuario añadir, buscar y mostrar contactos, usando un switch case
	 * para las diferentes opciones.
	 */

	private String nombreContacto;
	private String telefono;
	private String email;

	public Contacto(String nombreContacto, String telefono, String email) {
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
		this.email = email;
	}

	// Getters y Setters para el atributo "Nombre"
	public String get_Nombre() {
		return nombreContacto;
	}

	public void set_Nombre(String nombre) {
		this.nombreContacto = nombre;
	}

	// Getters y Setters para el atributo "teléfono"
	public String get_Telefono() {
		return telefono;
	}

	public void set_Telefono(String telefono) {
		this.telefono = telefono;
	}

	// Getters y Setters para el atributo "correo"
	public String get_Email() {
		return email;
	}

	public void set_Email(String email) {
		this.email = email;
	}
}
