package Dispositivos;

public class Sistema {
    String sistemaOperativo;
    String versionSO;
    String dualSim;
    String tipoSim;
    String Procesador;

    public Sistema(String sistemaOperativo, String versionSO, String dualSim, String tipoSim, String procesador) {
        this.sistemaOperativo = sistemaOperativo;
        this.versionSO = versionSO;
        this.dualSim = dualSim;
        this.tipoSim = tipoSim;
        Procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public String isDualSim() {
        return dualSim;
    }

    public String getTipoSim() {
        return tipoSim;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public void setDualSim(String dualSim) {
        this.dualSim = dualSim;
    }

    public void setTipoSim(String tipoSim) {
        this.tipoSim = tipoSim;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String sistemaDispositivo() {
        return ("   Sistema Operativo: " + sistemaOperativo + "\n" +
               "   Version del Sistema Operativo: " + versionSO + "\n" +
               "   dualSim: " + dualSim + "\n" +
               "   Tipo de Sim: " + tipoSim + "\n" +
               "   Procesador: " + Procesador + "\n");
    }
}
