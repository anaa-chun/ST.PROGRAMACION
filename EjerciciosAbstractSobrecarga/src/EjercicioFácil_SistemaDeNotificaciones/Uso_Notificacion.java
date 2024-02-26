package EjercicioFácil_SistemaDeNotificaciones;

// @author: Ana Chun Gómez de Castro DAM 1

public class Uso_Notificacion {

	public static void main(String[] args) {
		/*
		 * 1. Ejercicio Fácil: Sistema de Notificaciones Imagina que estás diseñando un
		 * sistema de notificaciones para una aplicación. Las notificaciones pueden ser
		 * de varios tipos (por ejemplo, correo electrónico, SMS, notificaciones en la
		 * aplicación). Todas las notificaciones comparten algunas propiedades comunes,
		 * como el mensaje y el destinatario, pero cada tipo tiene también sus
		 * propiedades únicas. 
		 * 
		 * - Crea una clase abstracta llamada Notificacion que incluya propiedades básicas como mensaje 
		 * y destinatario, y defina un método abstracto enviar(). 
		 * 
		 * - Implementa al menos tres clases concretas que extiendan Notificacion: CorreoElectronico, SMS 
		 * y NotificacionApp. Cada una debe tener al menos un constructor adicional que acepte parámetros 
		 * específicos de su tipo. Por ejemplo, CorreoElectronico podría tener un parámetro adicional para
		 * el asunto, SMS podría tener un límite de caracteres, y NotificacionApp podría tener un identificador 
		 * de dispositivo. 
		 * 
		 * - Demuestra la sobrecarga de onstructores en la clase abstracta Notificacion permitiendo 
		 * inicializar el mensaje y el destinatario con diferentes formatos o detalles adicionales.
		 */

				
		
		// Creo tres instancias de las clases concretas CorreoElectronico, SMS y NotificacionApp
		Notificacion a = new CorreoElectronico("¡Adiós, puto cabrón! 😝", " donaldtrump@icloud.com 📧, ",
				"'Hola mundo 👋'");
		a.enviar();

		Notificacion b = new SMS(" al número de teléfono de Mickey Mouse 🐭", "657498052 📞", 9);
		b.enviar();

		Notificacion c = new NotificacionApp("Hey, que tal!", " Pato Donald 🦆", "ID583");
		c.enviar();
		
		//Llamo al método enviar() que eso hace que muestre los diferentes tipos de notificaciones

	}

}
