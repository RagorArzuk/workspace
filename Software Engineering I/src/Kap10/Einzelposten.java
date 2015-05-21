package Kap10;

public class Einzelposten {
    private String name;
    private int menge;
    private int preis;
    private boolean geliefert;
    private Bestellung bestellung;
    private Produkt produkt;
    
    private Einzelposten(String n, int m) {
        name=n;
        menge=m;
        geliefert=false;
    }
    
    public String getName() {
        return name;
    }
    
    public int getMenge() {
        return menge;
    }
    
    public int preis() {
        return produkt.getVerkaufspreis();
    }
    
    public void setBestellung(Bestellung b) {
        bestellung=b;
    }
    
    public void verbindeBezug(Produkt p) {
        produkt = p;
    }
    
    public Produkt getProdukt() {
        return produkt;
    }
    
    public static Einzelposten erzeugeEinzelposten(String n, int m) {
        return new Einzelposten(n, m);
    }

    public void setGeliefert() {
        geliefert=true;
    }
    
    public boolean getGeliefert() {
        return geliefert;
    }
}
