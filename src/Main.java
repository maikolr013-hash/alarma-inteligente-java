public class Main {
    public static void main(String[] args) {
        AlarmManager manager = new AlarmManager();

        System.out.println("--- INICIANDO SISTEMA DE ALARMAS ---");

        // Creamos la alarma
        Alarm alarmaEntrenamiento = new Alarm("08:00", "Entrenamiento de Pádel", true);
        manager.addAlarm(alarmaEntrenamiento);

        // 🌟 PRUEBA DE FUNCIONALIDAD AVANZADA 3: DESPERTAR CIRCADIANO
        System.out.println("\nSimulando que llega la hora de despertarse...");
        manager.simulateCircadianAwakening(alarmaEntrenamiento);
    }
}