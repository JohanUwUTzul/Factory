public class SMSNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Cargando para el envio de un mensajes... " + mensaje);
    }
}