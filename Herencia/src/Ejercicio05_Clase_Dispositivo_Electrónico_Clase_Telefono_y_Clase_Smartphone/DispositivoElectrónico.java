package Ejercicio05_Clase_Dispositivo_Electrónico_Clase_Telefono_y_Clase_Smartphone;

// @author: Ana Chun Gómez De Castro DAM1

public class DispositivoElectrónico {
	private String fabricante;
	private int añoFabricacion;

	public DispositivoElectrónico(String fabricante, int añoFabricacion) {
		this.setFabricante(fabricante);
		this.setAñoFabricacion(añoFabricacion);
	}

	// Método getter y setter para el atributo "Fabricante"
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	// Método getter y setter para el atributo "año Fabricante"
	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

}
