package ejercicio02_SeparaciónDeImplementaciónyEspecificación;

import javax.swing.JOptionPane;

// Clase CaixaBank que implementa la interfaz ProcesadorDePago
public class CaixaBank implements ProcesadorDePago {
    
    // Implementación del método realizarPago de la interfaz ProcesadorDePago
    public void realizarPago(double dinero) {
        JOptionPane.showMessageDialog(null, "Realizo pago a través de CaixaBank por " + dinero + " €");
    }

    // Implementación del método reembolsarPago de la interfaz ProcesadorDePago
    public void reembolsarPago(double dinero) {
        JOptionPane.showMessageDialog(null, "Y reembolso por " + dinero + " €" + " procesado");
    }
}
