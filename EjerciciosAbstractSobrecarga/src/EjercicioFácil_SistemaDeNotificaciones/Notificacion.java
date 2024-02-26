package EjercicioFácil_SistemaDeNotificaciones;

// Clase abstracta que representa una notificación con un mensaje y destinatario.
public abstract class Notificacion {
    private String mensaje;      
    private String destinatario;  

    // Constructor que inicializa el mensaje y destinatario.
    public Notificacion(String mensaje, String destinatario) {
        this.setMensaje(mensaje);
        this.setDestinatario(destinatario);
    }

    // Método abstracto para enviar la notificación.
    public abstract void enviar();

    // Método para obtener y establecer el mensaje de la notificación.
    public String getMensaje() {
        return mensaje;
    }

   
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Método para obtener  y establecerel destinatario de la notificación.
    public String getDestinatario() {
        return destinatario;
    }

    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
