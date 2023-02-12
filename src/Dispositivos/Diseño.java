package Dispositivos;

public class Diseño {
    String colores;
    String dimensionesAlto;
    String dimensionesAncho;
    String dimensionesFondo;
    String material;
    String peso;

    public Diseño(String colores, String dimensionesAlto,
                  String dimensionesAncho, String dimensionesFondo, String material,
                  String peso) {
        this.colores = colores;
        this.dimensionesAlto = dimensionesAlto;
        this.dimensionesAncho = dimensionesAncho;
        this.dimensionesFondo = dimensionesFondo;
        this.material = material;
        this.peso = peso;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getDimensionesAlto() {
        return dimensionesAlto;
    }

    public void setDimensionesAlto(String dimensionesAlto) {
        this.dimensionesAlto = dimensionesAlto;
    }

    public String getDimensionesAncho() {
        return dimensionesAncho;
    }

    public void setDimensionesAncho(String dimensionesAncho) {
        this.dimensionesAncho = dimensionesAncho;
    }

    public String getDimensionesFondo() {
        return dimensionesFondo;
    }

    public void setDimensionesFondo(String dimensionesFondo) {
        this.dimensionesFondo = dimensionesFondo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String diseño() {
        return ("   Colores: " + colores + '\n' +
                "   Dimensiones alto: " + dimensionesAlto + '\n' +
                "   Dimensiones ancho: " + dimensionesAncho + '\n' +
                "   Dimensiones fondo: " + dimensionesFondo + '\n' +
                "   Material: " + material + '\n'+
                "   Peso: " + peso + '\n') ;
    }
}
