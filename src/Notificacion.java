import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notificacion {
    protected String mensaje;
    protected LocalDateTime fechaEnvio;

    public Notificacion(String mensaje, LocalDateTime fechaEnvio) {
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    public String getMensaje() { return mensaje; }
    public LocalDateTime getFechaEnvio() { return fechaEnvio; }

    protected String getFechaFormateada() {
        return fechaEnvio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    // Comportamiento general: las subclases lo especializan
    public void enviar() {
        System.out.println("[GENÉRICA] Enviando \"" + mensaje + "\" (" + getFechaFormateada() + ")");
    }
}