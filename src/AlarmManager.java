import java.util.ArrayList;
import java.util.List;

public class AlarmManager {
    private List<Alarm> alarms;
    private boolean isVacationModeActive; // Nueva variable para el modo vacaciones

    public AlarmManager() {
        this.alarms = new ArrayList<>();
        this.isVacationModeActive = false; // Por defecto no estamos de vacaciones
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println("✅ Alarma creada: " + alarm.getTime() + " - " + alarm.getLabel());
    }

    public void removeAlarm(Alarm alarm) {
        if (alarms.remove(alarm)) {
            System.out.println("🗑️ Alarma eliminada: " + alarm.getLabel());
        }
    }

    // --- NUEVO: Activar o desactivar el Modo Vacaciones ---
    public void setVacationMode(boolean active) {
        this.isVacationModeActive = active;
        if (active) {
            System.out.println("🌴 MODO VACACIONES ACTIVADO: Ninguna alarma sonará.");
        } else {
            System.out.println("💼 MODO VACACIONES DESACTIVADO: Las alarmas vuelven a la normalidad.");
        }
    }

    // Modificamos la consulta para que tenga en cuenta si estamos de vacaciones
    public void showActiveAlarms() {
        System.out.println("\n--- PRÓXIMAS ALARMAS ACTIVAS ---");
        
        if (isVacationModeActive) {
            System.out.println("Modo vacaciones activo. Todas las alarmas están silenciadas.");
            System.out.println("--------------------------------\n");
            return; // Cortamos la ejecución aquí, no mostramos nada más
        }

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
 // --- NUEVO: Funcionalidad Avanzada 3 - Despertar Circadiano ---
    public void simulateCircadianAwakening(Alarm alarm) {
        if (isVacationModeActive || !alarm.isActive()) {
            return; // Si estamos de vacaciones o inactiva, no hacemos nada
        }

        System.out.println("\n🌅 Iniciando Despertar Circadiano para: " + alarm.getLabel());
        System.out.println("Encendiendo pantalla con brillo gradual...");

        // Bucle que simula la subida de volumen del 1 al 5
        for (int volume = 1; volume <= 5; volume++) {
            System.out.println("🔊 Sonido de naturaleza... Volumen al " + (volume * 20) + "%");
            try {
                Thread.sleep(1000); // Pausa el programa 1 segundo para dar realismo
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación del tiempo.");
            }
        }
        System.out.println("⏰ ¡Alarma sonando al máximo volumen! Arriba.");
    }
}