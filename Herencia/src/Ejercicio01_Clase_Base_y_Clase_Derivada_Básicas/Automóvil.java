	package Ejercicio01_Clase_Base_y_Clase_Derivada_Básicas;

//@author: Ana Chun Gómez De Castro DAM1

//Define una clase llamada "Automóvil" que extiende la clase "Vehículo".
public class Automóvil extends Vehículo {

	// Declara una variable privada de tipo String para almacenar el tipo de combustible del automóvil.
	private String tipoDeCombustible;

	
	/*Constructor para la clase "Automóvil", que inicializa los atributos usando la palabra clave "super".*/
	public Automóvil(String marca, String modelo, int año, String tipoDeCombustible) {
		super(marca, modelo, año);
		/*Llama al constructor de la superclase ("Vehículo") con los parámetros proporcionados.*/

		this.setTipoDeCombustible(tipoDeCombustible);
		/*Establece el atributo específico para "Automóvil".*/
	}

	/*Método getter y setter para obtener el tipo de combustible del automóvil.*/
	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}

	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}

}
