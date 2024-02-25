package Ejercicio03_Métodos_Sobrescritos;

//@author: Ana Chun Gómez de Castro DAM1

import javax.swing.JOptionPane;

public class Perro extends Animal {
	@Override // Evita errores?

    // Sobrescribe el método "emitirSonido" para mostrar el sonido específico del perro.
	public void emitirSonido() {
		JOptionPane.showMessageDialog(null, "El perro emite un sonido");
	}

}


