import java.time.LocalDateTime;

public class NotificacionEmail extends Notificacion {
    private String direccionCorreo;

    public NotificacionEmail(String mensaje, LocalDateTime fechaEnvio, String direccionCorreo) {
        super(mensaje, fechaEnvio);
        this.direccionCorreo = direccionCorreo;
    }

    public String getDireccionCorreo() { return direccionCorreo; }

    @Override
    public void enviar() {
        System.out.println("[EMAIL] Conectando al servidor SMTP...");
        System.out.println("[EMAIL] Destinatario: " + direccionCorreo);
        System.out.println("[EMAIL] Asunto: Aviso corporativo | Fecha: " + getFechaFormateada());
        System.out.println("[EMAIL] Cuerpo: " + mensaje);
        System.out.println("[EMAIL] Mensaje entregado al servidor de correo.");
    }
}