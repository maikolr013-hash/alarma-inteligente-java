import java.util.ArrayList;
import java.util.List;

public class AlarmManager {
    // Usamos una Lista para poder guardar infinitas alarmas
    private List<Alarm> alarms;

    // Constructor: Inicializa la lista vacía al arrancar el programa
    public AlarmManager() {
        this.alarms = new ArrayList<>();
    }

    // 1. Funcionalidad: Crear alarmas
    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println("✅ Alarma creada correctamente: " + alarm.getTime() + " - " + alarm.getLabel());
    }

    // 2. Funcionalidad: Eliminar alarmas
    public void removeAlarm(Alarm alarm) {
        if (alarms.remove(alarm)) {
            System.out.println("🗑️ Alarma eliminada: " + alarm.getLabel());
        } else {
            System.out.println("❌ Error: La alarma no existe.");
        }
    }

    // 3. Funcionalidad: Consultar próximas alarmas activas
    public void showActiveAlarms() {
        System.out.println("\n--- PRÓXIMAS ALARMAS ACTIVAS ---");
        boolean hasActive = false;
        
        for (Alarm alarm : alarms) {
            if (alarm.isActive()) {
                System.out.println("⏰ " + alarm.getTime() + " | Etiqueta: " + alarm.getLabel());
                hasActive = true;
            }
        }
        
        if (!hasActive) {
            System.out.println("No hay ninguna alarma activada en este momento.");
        }
        System.out.println("--------------------------------\n");
    }
}