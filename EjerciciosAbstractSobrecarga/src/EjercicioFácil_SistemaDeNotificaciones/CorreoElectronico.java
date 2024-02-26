package EjercicioFácil_SistemaDeNotificaciones;

import javax.swing.JOptionPane;

// Clase que hereda de Notificacion y representa un correo electrónico.
class CorreoElectronico extends Notificacion {
    private String asunto;  // Asunto del correo electrónico.

    // Constructor que inicializa el mensaje, destinatario y asunto del correo electrónico.
    public CorreoElectronico(String mensaje, String destinatario, String asunto) {
        super(mensaje, destinatario);
        this.setAsunto(asunto);
    }

    // Implementación del método abstracto enviar() para el correo electrónico.
    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Enviando el correo electrónico al presidente ➡️" + getDestinatario()
                + " \ncuyo asunto es ➡️ " + getAsunto() + " que incluye en el mensaje ➡️ " + getMensaje() + "'", "CORREO ELECTRÓNICO", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para obtener el asunto del correo electrónico.
    public String getAsunto() {
        return asunto;
    }

    // Método para establecer el asunto del correo electrónico.
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
}
