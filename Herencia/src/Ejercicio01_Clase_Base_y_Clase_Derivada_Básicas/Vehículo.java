package Ejercicio01_Clase_Base_y_Clase_Derivada_Básicas;

//@author: Ana Chun Gómez De Castro DAM1

public class Vehículo {

	//Atributos privados de la clase "Vehículo"
	private String marca;
	private String modelo;
	private int año;

    // Constructor de la clase "Vehículo" que inicializa los atributos con valores dados.
	public Vehículo(String marca, String modelo, int año) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAño(año);
	}

	// Getters y Setters para el atributo de "marca"
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Getters y Setters para el atributo de "modelo"
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Getters y Setters para el atributo de "año"
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

}
