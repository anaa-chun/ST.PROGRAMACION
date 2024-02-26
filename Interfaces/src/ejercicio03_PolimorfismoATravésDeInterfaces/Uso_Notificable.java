package ejercicio03_PolimorfismoATravésDeInterfaces;

//@author: Ana Chun Gómez de Castro DAM 1

public class Uso_Notificable {

	public static void main(String[] args) {
		/*
		 * 3. Polimorfismo a través de interfaces: En un sistema de notificaciones, se
		 * define la interfaz Notificable con un método enviarNotificacion, lo que
		 * permite tratar de manera polimórfica a todas las clases que envían diferentes
		 * tipos de notificaciones (como correos electrónicos, SMS, o mensajes en
		 * aplicaciones) al implementar esta interfaz.
		 */

		Notificable iCloud = new CorreoElectronico(); // instancia 1
		enviarNotificacionGenerico(iCloud, " ¡Nuevo correo recibido!");

		Notificable miMensaje = new SMS(); // instancia 2
		enviarNotificacionGenerico(miMensaje, " ¡Querido Papá Noel!");

		Notificable WhatsApp = new MensajeEnAplicacion(); //instancia 3
		enviarNotificacionGenerico(WhatsApp, " Es un placer conocerte, no puedo perderte 🎶");

	}
    // Método que utiliza polimorfismo para enviar notificaciones genéricas a través de la interfaz Notificable
	public static void enviarNotificacionGenerico(Notificable notificable, String mensaje) {
		notificable.enviarNotificacion(mensaje);
	}

}
