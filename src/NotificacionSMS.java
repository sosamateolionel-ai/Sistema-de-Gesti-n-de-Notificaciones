import java.time.LocalDateTime;

public class NotificacionSMS extends Notificacion {
    private static final int LIMITE_CARACTERES = 160;

    private String numeroTelefono;

    public NotificacionSMS(String mensaje, LocalDateTime fechaEnvio, String numeroTelefono) {
        super(mensaje, fechaEnvio);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() { return numeroTelefono; }

    @Override
    public void enviar() {
        String texto = mensaje;
        if (texto.length() > LIMITE_CARACTERES) {
            texto = texto.substring(0, LIMITE_CARACTERES - 3) + "...";
            System.out.println("[SMS] Aviso: el mensaje se recortó a " + LIMITE_CARACTERES + " caracteres.");
        }
        System.out.println("[SMS] Conectando con la pasarela SMS...");
        System.out.println("[SMS] Número destino: " + numeroTelefono);
        System.out.println("[SMS] Texto: " + texto + " | Fecha: " + getFechaFormateada());
        System.out.println("[SMS] Mensaje enviado a la red celular.");
    }
}