package ejercicio03_PolimorfismoATravésDeInterfaces;

import javax.swing.JOptionPane;

// Clase MensajeEnAplicacion que implementa la interfaz Notificable
class MensajeEnAplicacion implements Notificable {
    
    // Implementación del método enviarNotificacion de la interfaz Notificable
    @Override
    public void enviarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "\nNotificación en la aplicación:" + mensaje);
    }
}
