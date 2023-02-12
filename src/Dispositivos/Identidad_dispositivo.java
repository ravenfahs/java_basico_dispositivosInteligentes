package Dispositivos;

public class  Identidad_dispositivo {
    String fabricante;
    String nombreDispositivo;

    public Identidad_dispositivo(String fabricante, String nombreDispositivo) {
        this.fabricante = fabricante;
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }


    public String nombreDispositivo() {
        return ("   Fabricante: " +fabricante +"\n   Dispositivo: "+ nombreDispositivo)+"\n";
    }
}
