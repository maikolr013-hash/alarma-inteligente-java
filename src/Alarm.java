public class Alarm {
    private String time; // Formato "HH:mm"
    private String label;
    private boolean isActive;
    private boolean isRepeating; // Para saber si suena un día o varios

    public Alarm(String time, String label, boolean isRepeating) {
        this.time = time;
        this.label = label;
        this.isRepeating = isRepeating;
        this.isActive = true; 
    }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getLabel() { return label; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}