public class Main {
    public static void main(String[] args) {
        // Inicializamos nuestro gestor de alarmas
        AlarmManager manager = new AlarmManager();

        System.out.println("Iniciando Sistema de Alarma Inteligente...\n");

        // 1. Creamos un par de alarmas de prueba
        Alarm alarmaClase = new Alarm("07:00", "Despertador DAW", true);
        Alarm alarmaPadel = new Alarm("18:30", "Partido de Pádel", false);

        // 2. Las añadimos al gestor
        manager.addAlarm(alarmaClase);
        manager.addAlarm(alarmaPadel);

        // 3. Consultamos las alarmas activas
        manager.showActiveAlarms();

        // 4. Simulamos que apagamos una alarma y volvemos a consultar
        System.out.println("Desactivando la alarma del partido...");
        alarmaPadel.setActive(false);
        
        manager.showActiveAlarms();
    }
}