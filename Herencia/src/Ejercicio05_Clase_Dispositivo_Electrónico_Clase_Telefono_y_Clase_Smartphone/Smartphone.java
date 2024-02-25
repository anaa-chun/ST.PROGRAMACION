package Ejercicio05_Clase_Dispositivo_Electrónico_Clase_Telefono_y_Clase_Smartphone;

//@author: Ana Chun Gómez De Castro DAM1

import javax.swing.JOptionPane;

//
public class Smartphone extends DispositivoElectrónico implements Telefono {
    // Variable que indica si se puede instalar una aplicación en el Smartphone
	private boolean instalarAplicacion;

    // Constructor que inicializa el fabricante y el año de fabricación del Smartphone
	public Smartphone(String fabricante, int añoFabricacion) {
		super(fabricante, añoFabricacion);
	}

	
    // Implementación del método de la interfaz Telefono para realizar una llamada
	@Override
	public void llamar(String numero) {
		JOptionPane.showInternalMessageDialog(null, "Llama al número: " + numero);
	}

	@Override
	public void recibirLlamadas() {
		JOptionPane.showMessageDialog(null, "Recibiendo llamada: " + instalarAplicacion);
	}

    // Método que devuelve el estado de instalación de la aplicación en el Smartphone
	public boolean instalarAplicacion() {
		return instalarAplicacion;
	}

	public void setInstalarAplicacion(boolean instalarAplicacion) {
		this.instalarAplicacion = instalarAplicacion;
	}

}
