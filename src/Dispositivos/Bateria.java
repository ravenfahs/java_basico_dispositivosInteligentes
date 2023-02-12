package Dispositivos;

public class Bateria {
    String tipoBateria;
    String capacidadBateria;
    String otrasCaracteristicas;

    public Bateria(String tipoBateria, String capacidadBateria, String otrasCaracteristicas) {
        this.tipoBateria = tipoBateria;
        this.capacidadBateria = capacidadBateria;
        this.otrasCaracteristicas = otrasCaracteristicas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getOtrasCaracteristicas() {
        return otrasCaracteristicas;
    }

    public void setOtrasCaracteristicas(String otrasCaracteristicas) {
        this.otrasCaracteristicas = otrasCaracteristicas;
    }

    public String bateria() {
        return  ("   Tipo de batería: " + tipoBateria + "\n" +
                 "   Capacidad de la batería: " + capacidadBateria + "\n" +
                 "   Otras características: " + otrasCaracteristicas + "\n" );
    }
}
