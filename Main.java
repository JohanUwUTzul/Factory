public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("EMAIL");
        email.enviarMensaje("Hola bienvenido por tu correo electronico ");

        Notificacion sms = factory.crearNotificacion("SMS");
        sms.enviarMensaje("Hola bienvenido por tu mensajes SMS ");

        Notificacion app = factory.crearNotificacion("APP");
        app.enviarMensaje("Hola bienvenido a la aplicacion ");

        NotificacionAbstractFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("Mensaje responde lo antes posible tu Gmail ");

        NotificacionAbstractFactory regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Mensaje mensaje de monitreo nada de que preocuparse ");
    }
}

