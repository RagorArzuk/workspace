package Kap10;

public class Produkt {

    private String bezeichnung;
    private int einkaufspreis, verkaufspreis;
    
    public Produkt(String b, int e, int v) {
        bezeichnung = b;
        einkaufspreis = e;
        verkaufspreis=v;
    }
    
    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public int getEinkaufspreis() {
        return einkaufspreis;
    }
    
    public int getVerkaufspreis() {
        return verkaufspreis;
    }
    
    public static Produkt erzeugeProdukt(String b, int e, int v) {
        return new Produkt(b, e, v);
    }
}
