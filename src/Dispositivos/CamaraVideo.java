package Dispositivos;

public class CamaraVideo {
    String Capturavideo;
    String caracteristicasCVideo;
    String resolucionCVideo;

    public CamaraVideo(String capturavideo, String caracteristicasCVideo, String resolucionCVideo) {
        Capturavideo = capturavideo;
        this.caracteristicasCVideo = caracteristicasCVideo;
        this.resolucionCVideo = resolucionCVideo;
    }

    public String getCapturavideo() {
        return Capturavideo;
    }

    public String getCaracteristicasCVideo() {
        return caracteristicasCVideo;
    }

    public String getResolucionCVideo() {
        return resolucionCVideo;
    }

    public void setCapturavideo(String capturavideo) {
        Capturavideo = capturavideo;
    }

    public void setCaracteristicasCVideo(String caracteristicasCVideo) {
        this.caracteristicasCVideo = caracteristicasCVideo;
    }

    public void setResolucionCVideo(String resolucionCVideo) {
        this.resolucionCVideo = resolucionCVideo;
    }

    public String video() {
        return  ("   Captura de video: " + Capturavideo + '\n' +
                "   Características Cámara de Video: " + caracteristicasCVideo + '\n' +
                "   Resolución de Cámara de Video: " + resolucionCVideo + '\n') ;
    }
}
