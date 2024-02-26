package ejercicio02_SeparaciónDeImplementaciónyEspecificación;

// Clase AplicacionPago que utiliza la interfaz ProcesadorDePago para realizar pagos y reembolsos
public class AplicacionPago {

    // Variable que almacena el procesador
    private double aProcesador;

    // Constructor que inicializa el procesador
    public AplicacionPago(double aProcesador) {
        this.setaProcesador(aProcesador);
    }

    // Método para realizar un pago con la cantidad especificada
    public void realizarPago(double a) {
        System.out.println("Pago realizado por €" + a);
    }

    // Método para reembolsar un pago con la cantidad especificada
    public void reembolsarPago(double a) {
        System.out.println("Reembolso por " + a + " €" + " procesado");
    }

    // Método getter para obtener el procesador
    public double getaProcesador() {
        return aProcesador;
    }

    // Método setter para establecer el procesador
    public void setaProcesador(double aProcesador) {
        this.aProcesador = aProcesador;
    }
}
