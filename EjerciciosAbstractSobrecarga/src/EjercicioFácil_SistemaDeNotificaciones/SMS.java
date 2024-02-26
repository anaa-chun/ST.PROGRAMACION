package EjercicioFácil_SistemaDeNotificaciones;

import javax.swing.JOptionPane;

// Clase que hereda de Notificacion y representa un mensaje de texto (SMS).
class SMS extends Notificacion {
    private int limiteCaracteres;  // Límite de caracteres para el SMS.

    // Constructor que inicializa el mensaje, destinatario y límite de caracteres del SMS.
    public SMS(String mensaje, String destinatario, int limiteCaracteres) {
        super(mensaje, destinatario);
        this.limiteCaracteres = limiteCaracteres;
    }

    // Implementación del método abstracto enviar() para el SMS.
    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Enviando SMS a ➡️" + getDestinatario() + " \ncon límites de caracteres ➡️"
                + getLimiteCaracteres() + " " + getMensaje(), "SMS", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para obtener el límite de caracteres del SMS.
    public int getLimiteCaracteres() {
        return limiteCaracteres;
    }

    // Método para establecer el límite de caracteres del SMS.
    public void setLimiteCaracteres(int limiteCaracteres) {
        this.limiteCaracteres = limiteCaracteres;
    }
}
