package Dispositivos;

public class Multimedia {
    String audio;
    String video;
    String radio;
    String tonos;

    String altavoces;

    public Multimedia(String audio, String video, String radio, String tonos, String altavoces) {
        this.audio = audio;
        this.video = video;
        this.radio = radio;
        this.tonos = tonos;
        this.altavoces = altavoces;
    }

    public String getAudio() {
        return audio;
    }

    public String getVideo() {
        return video;
    }

    public String getRadio() {
        return radio;
    }

    public String getTonos() {
        return tonos;
    }

    public String getAltavoces() {
        return altavoces;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void setTonos(String tonos) {
        this.tonos = tonos;
    }

    public void setAltavoces(String altavoces) {
        this.altavoces = altavoces;
    }

    public String multimedia() {
        return ("   audio: " + audio + '\n' +
                "   Video: " + video + '\n' +
                "   Radio: " + radio + '\n' +
                "   Tonos: " + tonos + '\n' +
                "   Altavoces: " + altavoces) + "\n";
    }
}
