package POO_IX;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez de Castro DAM 1

public abstract class Persistencia {
	public abstract void guardarDatos();

	// Corrige el nombre del método
	public abstract void cargarDatos();

	public static void main(String[] args) {

		/*
		 * Diseña una clase abstracta Persistencia con métodos abstractos como
		 * guardarDatos() y cargarDatos(). Implementa subclases concretas como
		 * PersistenciaArchivo y PersistenciaBaseDatos que hereden de esta clase y
		 * proporcionen implementaciones específicas para guardar y cargar datos en
		 * diferentes tipos de almacenamiento.
		 */

		int option = 0;
		option = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\n1) Persistencia de Archivo 📁" + "\n2) Persistencia de bases de datos 📊"));

		// Agrega un break después de cada case en el switch
		switch (option) {
		case 1:
			PersistenciaArchivo a = new PersistenciaArchivo();
			JOptionPane.showMessageDialog(null, "Operaciones con Persistencia de Archivo 📁");
			a.cargarDatos(); // Llama al método cargarDAtos() de PersistenciaArchivo
			a.guardarDatos();
			break; // sale de una estructura de control de flujo
		case 2:
			PersitenciaBaseDatos b = new PersitenciaBaseDatos();
			JOptionPane.showMessageDialog(null, "Operaciones con Persistencia de Bases de Datos ℹ️");
			b.cargarDatos();
			b.guardarDatos();
			break; // sale de una estructura de control de flujo
		}
	}

	// Clase estática interna que extiende la clase abstracta Persistencia
	static class PersistenciaArchivo extends Persistencia {
		/*
		 * Override: Sobreescribe los métodos abstractos correspondientes de la clase
		 * padre Vehiculo.
		 */

		@Override
		public void guardarDatos() {
			JOptionPane.showMessageDialog(null, "Guardando datos en un archivo");
		}

		@Override
		public void cargarDatos() {
			// Muestra el mensaje en un panel
			JOptionPane.showMessageDialog(null, "Ahora cargando datos en un archivo");
		}
	}

	static class PersitenciaBaseDatos extends Persistencia {
		@Override
		public void guardarDatos() {
			// Muestra el mensaje en un panel
			JOptionPane.showMessageDialog(null, "Guardando datos en base de datos...");
		}

		@Override
		public void cargarDatos() {
			// Muestra el mensaje en un panel
			JOptionPane.showMessageDialog(null, "Cargando datos en base de datos...");
		}
	}
}
