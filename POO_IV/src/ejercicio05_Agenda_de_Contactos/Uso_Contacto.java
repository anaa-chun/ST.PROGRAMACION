package ejercicio05_Agenda_de_Contactos;

//@author: Ana Chun Gómez de Castro DAM1

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Uso_Contacto {

	public static void main(String[] args) {

		/*
		 * 5.Agenda de Contactos: Implementa una clase Contacto con atributos para
		 * nombre, número de teléfono y dirección de email. Usa getters y setters para
		 * estos atributos. En el archivo principal, crea un menú con JOptionPane que
		 * permita al usuario añadir, buscar y mostrar contactos, usando un switch case
		 * para las diferentes opciones.
		 */

		ArrayList<Contacto> agenda = new ArrayList<>();

		while (true) {
			// Menú
			String opcionStr = JOptionPane.showInputDialog("1. Añadir contacto\n" + "2. Buscar contacto\n"
					+ "3. Mostrar contactos\n" + "4. Salir\n\n" + "Introduzca el número de la opción por favor:");

			int opcion = Integer.parseInt(opcionStr);

			switch (opcion) {
			case 1:
				// Añade contacto
				String nombre = JOptionPane.showInputDialog("Dime el nombre de una persona:");
				String telefono = JOptionPane.showInputDialog("Introduzca su número de teléfono:");
				String email = JOptionPane.showInputDialog("Ahora la dirección de correos electrónicos:");

				Contacto nuevoContacto = new Contacto(nombre, telefono, email);
				agenda.add(nuevoContacto);
				break;

			case 2:
				// Buscar contacto
				String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");

				boolean encontrado = false;
				for (Contacto contactoInfo : agenda) {
					if (contactoInfo.get_Nombre().equalsIgnoreCase(buscarNombre)) {
						JOptionPane.showMessageDialog(null,
								"Contacto encontrado:\n" + "Nombre: " + contactoInfo.get_Nombre() + "\nTeléfono: "
										+ contactoInfo.get_Telefono() + "\nEmail: " + contactoInfo.get_Email());
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					JOptionPane.showMessageDialog(null, "Contacto no encontrado");
				}
				break;

			case 3:
				// Esto mostra los contactos
				StringBuilder listaContactos = new StringBuilder("Contactos:\n");
				for (Contacto contacto : agenda) {
					listaContactos.append("Nombre: ").append(contacto.get_Nombre()).append("\n");
					listaContactos.append("Teléfono: ").append(contacto.get_Telefono()).append("\n");
					listaContactos.append("Email: ").append(contacto.get_Email()).append("\n\n");

					// append construye una cadena que contiene información sobre los contactos
				}
				JOptionPane.showMessageDialog(null, listaContactos.toString());
				break;

			case 4:
				// Salida
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
			}
		}
	}

}
