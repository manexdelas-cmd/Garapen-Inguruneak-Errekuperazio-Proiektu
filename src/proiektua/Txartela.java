package proiektua;

public class Txartela {

    private int id;
    private String izenburua;
    private String deskribapena;
    private int lehentasuna; // zenbaki txikiagoa = lehentasun handiagoa
    private long data;       // formatua: yyyyMMdd, adibidez 20261030
    private String egoera;   // "ZAIN" edo "ATENDITUA"
 
    public Txartela(int id, String izenburua, String deskribapena, int lehentasuna, long data) {
        this.id = id;
        this.izenburua = izenburua;
        this.deskribapena = deskribapena;
        this.lehentasuna = lehentasuna;
        this.data = data;
        this.egoera = "ZAIN"; // txartel berria beti zain hasten da
    }
 
    public int getId() {
        return id;
    }
 
    public int getLehentasuna() {
        return lehentasuna;
    }
 
    public long getData() {
        return data;
    }
 
    public String getEgoera() {
        return egoera;
    }
 
    public void setEgoera(String egoera) {
        this.egoera = egoera;
    }
 
    @Override
    public String toString() {
        return "Txartela #" + id + " [" + izenburua + "] lehentasuna=" + lehentasuna
                + ", data=" + data + ", egoera=" + egoera;
    }
}
 

