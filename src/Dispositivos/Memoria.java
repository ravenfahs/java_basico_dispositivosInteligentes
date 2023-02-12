package Dispositivos;

public class Memoria {
    String expansionMemoria;
    String memoriaRAM;
    String memoriaROM;

    public Memoria(String expansionMemoria, String memoriaRAM, String memoriaROM) {
        this.expansionMemoria = expansionMemoria;
        this.memoriaRAM = memoriaRAM;
        this.memoriaROM = memoriaROM;
    }

    public String getExpansionMemoria() {
        return expansionMemoria;
    }

    public void setExpansionMemoria(String expansionMemoria) {
        this.expansionMemoria = expansionMemoria;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getMemoriaROM() {
        return memoriaROM;
    }

    public void setMemoriaROM(String memoriaROM) {
        this.memoriaROM = memoriaROM;
    }

    public String memoria() {
        return ("   Expansión de memoria: " + expansionMemoria + '\n' +
                "   Memoria RAM: " + memoriaRAM + '\n' +
                "   Memoria ROM: " + memoriaROM + '\n') ;
    }
}
