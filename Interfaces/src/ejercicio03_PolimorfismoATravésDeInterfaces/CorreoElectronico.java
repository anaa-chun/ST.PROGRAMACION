package ejercicio03_PolimorfismoATravésDeInterfaces;

import javax.swing.JOptionPane;

// Clase CorreoElectronico que implementa la interfaz Notificable
class CorreoElectronico implements Notificable {
    
    // Implementación del método enviarNotificacion de la interfaz Notificable
    @Override
    public void enviarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "\nNotificación por correo electrónico:" + mensaje);
    }
}
