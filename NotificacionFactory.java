public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Tu base de datos esta siendo robada asegurala lo antes posible " + tipo);
        }
    }
}