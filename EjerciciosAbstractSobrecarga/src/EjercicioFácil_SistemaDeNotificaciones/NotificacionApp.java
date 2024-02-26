package EjercicioFácil_SistemaDeNotificaciones;

import javax.swing.JOptionPane;

// Clase que hereda de Notificacion y representa una notificación de una aplicación.
class NotificacionApp extends Notificacion {
    private String identificadorDispositivo;  // Identificador del dispositivo de la aplicación.

    // Constructor que inicializa el mensaje, destinatario y el identificador del dispositivo de la aplicación.
    public NotificacionApp(String mensaje, String destinatario, String identificadorDispositivo) {
        super(mensaje, destinatario);
        this.identificadorDispositivo = identificadorDispositivo;
    }

    // Método para obtener el identificador del dispositivo de la aplicación.
    public String getIdentificadorDispositivo() {
        return identificadorDispositivo;
    }

    // Método para establecer el identificador del dispositivo de la aplicación.
    public void setIdentificadorDispositivo(String identificadorDispositivo) {
        this.identificadorDispositivo = identificadorDispositivo;
    }

    // Implementación del método abstracto enviar() para la notificación de la aplicación.
    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null,
                "Recibiendo notificación de la aplicación al dispositivo " + getIdentificadorDispositivo()
                        + " \ncon mensajes: " + getMensaje() + " 👋" + " de parte de " + getDestinatario(),
                "NOTIFICACIÓN DE LA APP", JOptionPane.INFORMATION_MESSAGE);
    }
}
