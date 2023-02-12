package Dispositivos;

public class PantallaSensores {
    String densidadPixeles;
    String caracteristicasPantalla;
    String tipoPantalla;
    String resolucionPantallaAncho;
    String resolucionPantallaLargo;
    String sensores;
    String size;

    public PantallaSensores(String densidadPixeles, String caracteristicasPantalla,
                            String tipoPantalla, String resolucionPantallaAncho,
                            String resolucionPantallaLargo, String sensores, String size) {
        this.densidadPixeles = densidadPixeles;
        this.caracteristicasPantalla = caracteristicasPantalla;
        this.tipoPantalla = tipoPantalla;
        this.resolucionPantallaAncho = resolucionPantallaAncho;
        this.resolucionPantallaLargo = resolucionPantallaLargo;
        this.sensores = sensores;
        this.size = size;
    }

    public String getDensidadPixeles() {
        return densidadPixeles;
    }

    public void setDensidadPixeles(String densidadPixeles) {
        this.densidadPixeles = densidadPixeles;
    }

    public String getCaracteristicasPantalla() {
        return caracteristicasPantalla;
    }

    public void setCaracteristicasPantalla(String caracteristicasPantalla) {
        this.caracteristicasPantalla = caracteristicasPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getResolucionPantallaAncho() {
        return resolucionPantallaAncho;
    }

    public void setResolucionPantallaAncho(String resolucionPantallaAncho) {
        this.resolucionPantallaAncho = resolucionPantallaAncho;
    }

    public String getResolucionPantallaLargo() {
        return resolucionPantallaLargo;
    }

    public void setResolucionPantallaLargo(String resolucionPantallaLargo) {
        this.resolucionPantallaLargo = resolucionPantallaLargo;
    }

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String pantalla() {
        return  ("   Densidad de píxeles: " + densidadPixeles + '\n' +
                "   Características de la pantalla: " + caracteristicasPantalla + '\n' +
                "   Tipo de pantalla: " + tipoPantalla + '\n' +
                "   Resolución de pantalla ancho: " + resolucionPantallaAncho + '\n' +
                "   Resolución de pantalla largo: " + resolucionPantallaLargo + '\n' +
                "   Sensores: " + sensores + '\n' +
                "   Tamaño de la pantalla: " + size + '\n') ;
    }
}
