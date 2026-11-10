//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LocalDateTime ahora = LocalDateTime.of(2026, 11, 10, 9, 30);

    Notificacion email = new NotificacionEmail(
            "La reunión de equipo se movió a las 15:00.", ahora, "laura.gomez@empresa.com");
    Notificacion sms = new NotificacionSMS(
            "Su código de verificación es 482913.", ahora, "+54 9 261 555 0123");
    Notificacion push = new NotificacionPush(
            "Tenés 3 tareas pendientes de aprobación.", ahora, "device-7F3A-92C1");
    Notificacion generica = new Notificacion(
            "Aviso sin canal definido.", ahora);

    Notificacion[] alertas = { email, sms, push, generica };

    System.out.println("=== ENVÍO DE NOTIFICACIONES ===\n");
    for (Notificacion n : alertas) {
        n.enviar();
        System.out.println();
    }

}
