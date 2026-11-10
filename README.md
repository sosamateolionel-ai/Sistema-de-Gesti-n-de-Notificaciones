# Sistema de Gestión de Notificaciones

## Descripción
Este proyecto desarrolla un sistema de gestión y envío de notificaciones utilizando Java y Programación Orientada a Objetos.

Permite representar diferentes canales de comunicación, como correo electrónico, SMS y notificaciones push, utilizando una clase base común y métodos especializados para cada tipo de envío.

## Funcionamiento del programa

El programa crea cuatro notificaciones con una fecha de envío establecida: 10 de noviembre de 2026 a las 09:30.

Los tipos de notificaciones son:

- **Email:** envía un aviso a `laura.gomez@empresa.com` informando que la reunión de equipo se cambió a las 15:00.
- **SMS:** envía un código de verificación al número indicado.
- **Push:** informa que existen tres tareas pendientes de aprobación y utiliza un identificador de dispositivo.
- **Genérica:** representa un aviso sin un canal de comunicación definido.

Las cuatro notificaciones se almacenan en un arreglo de tipo `Notificacion[]`.

Mediante un ciclo `for`, el programa recorre el arreglo y ejecuta el método `enviar()` de cada objeto. Java determina automáticamente qué implementación utilizar según el tipo real de notificación.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `Notificacion` | Clase base que almacena el mensaje, la fecha de envío y define el comportamiento general. |
| `NotificacionEmail` | Hereda de `Notificacion` y representa el envío de correos electrónicos. |
| `NotificacionSMS` | Hereda de `Notificacion` y controla el envío de mensajes de texto, limitando su longitud. |
| `NotificacionPush` | Hereda de `Notificacion` y representa notificaciones dirigidas a dispositivos. |
| `Main` | Crea las notificaciones, las almacena en un arreglo y ejecuta sus métodos de envío. |

## Conceptos de programación aplicados

- **Herencia:** las clases especializadas heredan los atributos y métodos de `Notificacion`.
- **Polimorfismo:** se utiliza un arreglo `Notificacion[]` para almacenar distintos tipos de notificaciones.
- **Sobrescritura de métodos:** cada subclase redefine el método `enviar()` mediante `@Override`.
- **Encapsulamiento:** se utilizan atributos `protected` en la clase base y atributos `private` en las clases derivadas.
- **Constructores con `super()`:** permiten inicializar los atributos heredados.
- **Constantes:** `LIMITE_CARACTERES` establece el máximo de 160 caracteres para los SMS.
- **Validación y manipulación de cadenas:** el SMS verifica la longitud del mensaje y lo recorta cuando supera el límite.
- **Manejo de fechas:** se utiliza `LocalDateTime` para representar la fecha y hora de envío y `DateTimeFormatter` para darle formato.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- API de fechas: `java.time`.
- Formato de fechas: `DateTimeFormatter`.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="841" height="440" alt="image" src="https://github.com/user-attachments/assets/8ba71c54-6972-49cc-99c8-3e2fa7387097" />

## Resultado esperado

La consola muestra cuatro procesos de envío:

1. **Email:** conexión simulada al servidor SMTP, destinatario, asunto y cuerpo del mensaje.
2. **SMS:** conexión simulada con la pasarela SMS, número de destino y texto del mensaje.
3. **Push:** solicitud de entrega, identificador del dispositivo y contenido de la notificación.
4. **Genérica:** envío del mensaje mediante la implementación de la clase base.

Cada notificación presenta la fecha con el formato `dd/MM/yyyy HH:mm`.

## Objetivo del ejercicio

Aplicar los conceptos de herencia, polimorfismo y sobrescritura de métodos mediante un sistema que permita representar distintos canales de notificación, reutilizando una estructura común y especializando el comportamiento de cada tipo.

## Estructura del proyecto

```text
SistemaNotificaciones/
├── Notificacion.java
├── NotificacionEmail.java
├── NotificacionSMS.java
├── NotificacionPush.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `sistema-gestion-notificaciones`

## Observación

El programa simula los procesos de envío de notificaciones mediante mensajes en consola. No establece conexiones reales con servidores SMTP, pasarelas SMS ni servicios de notificaciones push.
