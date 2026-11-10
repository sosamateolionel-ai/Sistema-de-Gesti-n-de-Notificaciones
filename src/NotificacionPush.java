import java.time.LocalDateTime;

public class NotificacionPush extends Notificacion {
    private String idDispositivo;

    public NotificacionPush(String mensaje, LocalDateTime fechaEnvio, String idDispositivo) {
        super(mensaje, fechaEnvio);
        this.idDispositivo = idDispositivo;
    }

    public String getIdDispositivo() { return idDispositivo; }

    @Override
    public void enviar() {
        System.out.println("[PUSH] Solicitando entrega al servicio de notificaciones push...");
        System.out.println("[PUSH] Dispositivo: " + idDispositivo);
        System.out.println("[PUSH] Payload: {\"mensaje\": \"" + mensaje + "\", \"fecha\": \"" + getFechaFormateada() + "\"}");
        System.out.println("[PUSH] Notificación entregada al dispositivo.");
    }
}