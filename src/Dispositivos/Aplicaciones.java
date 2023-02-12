package Dispositivos;

public class Aplicaciones {
    String nombreApp;
    String descripcion;


     public String getDescripcion() {
        return descripcion;
    }

    public String getNombreApp() {
        return nombreApp;
    }

    public void setNombreApp(String nombreApp)
    {
        this.nombreApp = nombreApp;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public Aplicaciones(String nombreApp, String descripcion) {
        this.nombreApp = nombreApp;
        this.descripcion = descripcion;
    }

    public String NombreApps()
    {
        return ("   Nombre de la aplicación: " + nombreApp + "\n   Descripción" + descripcion);
    }
}
