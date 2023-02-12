package Dispositivos;

public class Camarasfotograficas {
    String caracteristicaCPrincipal;
    String caracteristicaCSecundaria;
    String resolucionCPrincipal;
    String resolucionCSecundaria;
    String flash;

    public Camarasfotograficas(String caracteristicaCPrincipal, String caracteristicaCSecundaria,
                               String resolucionCPrincipal, String resolucionCSecundaria, String flash) {
        this.caracteristicaCPrincipal = caracteristicaCPrincipal;
        this.caracteristicaCSecundaria = caracteristicaCSecundaria;
        this.resolucionCPrincipal = resolucionCPrincipal;
        this.resolucionCSecundaria = resolucionCSecundaria;
        this.flash = flash;
    }

    public String getCaracteristicaCPrincipal() {
        return caracteristicaCPrincipal;
    }

    public String getCaracteristicaCSecundaria() {
        return caracteristicaCSecundaria;
    }

    public String getResolucionCPrincipal() {
        return resolucionCPrincipal;
    }

    public String getResolucionCSecundaria() {
        return resolucionCSecundaria;
    }

    public String getlash() {
        return flash;
    }

    public void setCaracteristicaCPrincipal(String caracteristicaCPrincipal) {
        this.caracteristicaCPrincipal = caracteristicaCPrincipal;
    }

    public void setCaracteristicaCSecundaria(String caracteristicaCSecundaria) {
        this.caracteristicaCSecundaria = caracteristicaCSecundaria;
    }

    public void setResolucionCPrincipal(String resolucionCPrincipal) {
        this.resolucionCPrincipal = resolucionCPrincipal;
    }

    public void setResolucionCSecundaria(String resolucionCSecundaria) {
        this.resolucionCSecundaria = resolucionCSecundaria;
    }

    public void setFlash(String flash) {
        flash = flash;
    }

    public String camaras() {
        return ("   Característica de la camara principal: " + caracteristicaCPrincipal + '\n' +
                "   Característica de la camara secundaria: " + caracteristicaCSecundaria + '\n' +
                "   Resolución camara principal: " + resolucionCPrincipal + '\n' +
                "   Resolución camara secundaria: " + resolucionCSecundaria + '\n' +
                "   Flash: " + flash + '\n');
    }
}
