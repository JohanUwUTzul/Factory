public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Cargando tus mensajes de Gmail... " + mensaje);
    }
}