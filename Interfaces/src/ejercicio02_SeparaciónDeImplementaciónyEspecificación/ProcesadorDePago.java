package ejercicio02_SeparaciónDeImplementaciónyEspecificación;

// Interfaz ProcesadorDePago que define el contrato para procesadores de pago
public interface ProcesadorDePago {
    // Método para realizar un pago con la cantidad especificada
    public void realizarPago(double cantidad);

    // Método para reembolsar un pago con la cantidad especificada
    public void reembolsarPago(double cantidad);
}
