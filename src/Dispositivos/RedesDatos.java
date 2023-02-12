package Dispositivos;

import java.awt.*;

public class RedesDatos {
    String Red3G;
    String RedCDMA;
    String RedGSM;
    String RedLTE;

    public RedesDatos(String red3G, String redCDMA, String redGSM, String redLTE) {
        Red3G = red3G;
        RedCDMA = redCDMA;
        RedGSM = redGSM;
        RedLTE = redLTE;
    }

    public String getRed3G() {
        return Red3G;
    }

    public String getRedCDMA() {
        return RedCDMA;
    }

    public String getRedGSM() {
        return RedGSM;
    }

    public String getRedLTE() {
        return RedLTE;
    }

    public void setRed3G(String red3G) {
        Red3G = red3G;
    }

    public void setRedCDMA(String redCDMA) {
        RedCDMA = redCDMA;
    }

    public void setRedGSM(String redGSM) {
        RedGSM = redGSM;
    }

    public void setRedLTE(String redLTE) {
        RedLTE = redLTE;
    }

    public String redesDatos() {
        return ("   Red 3G: " + Red3G + '\n' +
               "   Red CDMA: " + RedCDMA + '\n' +
               "   Red GSM: " + RedGSM + '\n' +
               "   Red LTE: " + RedLTE + '\n' );
    }
}
