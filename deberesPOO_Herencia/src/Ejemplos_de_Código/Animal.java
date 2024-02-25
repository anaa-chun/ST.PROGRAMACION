package Ejemplos_de_Código;

// Clase base que representa un animal genérico
public class Animal {
	String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public void emitirSonido() {
		System.out.println("El animal emite sonido");
	}
}

// Clase que representa una vaca y hereda de la clase Animal
class Vaca extends Animal {
	public Vaca(String nombre) {
		super(nombre);
	}

	@Override
	public void emitirSonido() {
		System.out.println("¡Muuu, muuu!");
	}

}