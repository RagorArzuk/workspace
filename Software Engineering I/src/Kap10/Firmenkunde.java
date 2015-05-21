package Kap10;

public class Firmenkunde extends Kunde {

    private String kontakt;
    private int kreditrahmen;
    private Angestellter sachbearbeiter;
    
    private Firmenkunde(String n, String a, String k, int kr) {
        super(n, a);
        kontakt = k;
        kreditrahmen = kr;
        sachbearbeiter=null;
    }
    
    public void setkreditrahmen(int kr) {
        kreditrahmen=kr;
    }
    public int getKreditrahmen() {
        return kreditrahmen;
    }
    
    public void setKontakt(String k) {
        kontakt=k;
    }
    public String getKontakt() {
        return kontakt;
    }
    
    public static Firmenkunde erzeugeFirmenkunde(String n, String a, String k, int kr) {
        return new Firmenkunde(n, a, k, kr);
    }
    
    public void verbindeSachbearbeiter(Angestellter a) {
        sachbearbeiter = a;
    }
    
    public void loeseSachbearbeiter() {
        sachbearbeiter=null;
    }
    
    public String getSachbearbeiter() {
        return sachbearbeiter.getName();
    }
}
