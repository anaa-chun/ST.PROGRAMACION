package ejercicio03_PolimorfismoATravésDeInterfaces;

import javax.swing.JOptionPane;

// Clase SMS que implementa la interfaz Notificable
class SMS implements Notificable {
    
    // Implementación del método enviarNotificacion de la interfaz Notificable
    @Override
    public void enviarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "\nNotificación por SMS:" + mensaje);
    }
}
