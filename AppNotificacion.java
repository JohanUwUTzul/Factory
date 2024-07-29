public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensajes de la app " + mensaje);
    }
}