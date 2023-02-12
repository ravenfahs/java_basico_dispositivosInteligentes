package Dispositivos;

public class Conexiones {
    String conectividad;
    String conectividadDatos;
    String conectores;

    public Conexiones(String conectividad, String conectividadDatos, String conectores) {
        this.conectividad = conectividad;
        this.conectividadDatos = conectividadDatos;
        this.conectores = conectores;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getConectividadDatos() {
        return conectividadDatos;
    }

    public String getConectores() {
        return conectores;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public void setConectividadDatos(String conectividadDatos) {
        this.conectividadDatos = conectividadDatos;
    }

    public void setConectores(String conectores) {
        this.conectores = conectores;
    }


    public String tipoConecion() {
        return ("   Conectividad: " + conectividad + '\n' +
                "   Conectividad de Datos: " + conectividadDatos + '\n' +
                "   Conectores: " + conectores + '\n');
    }
}
