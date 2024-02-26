package ejercicio01_DefiniciónDeUnContratoParaClasesRelacionadas;

// Definición de la clase Producto que implementa la interfaz Inventariable
class Producto implements Inventariable {
	private int Stock;

	// Constructor que inicializa el stock del producto
	public Producto(int stockInicial) {
		this.Stock = stockInicial;
	}

	// Método de la interfaz para obtener el stock del producto
	@Override
	public int obtenerStock() {
		return Stock;
	}

	// Método de la interfaz para actualizar el stock del producto
	@Override
	public void actualizarStock(int cantidad) {
		Stock += cantidad;
	}
}
