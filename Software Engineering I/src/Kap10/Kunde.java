package Kap10;

import java.util.*;

public class Kunde {
    private String name;
    private String adresse;
    private boolean bonitaet;
    private List<Bestellung> bestellungen;
    
    protected Kunde(String n, String a) {
        this.name=n;
        this.adresse=a;
        bonitaet = true;
        bestellungen = new LinkedList<Bestellung>();
    }
    
    public String getName() {
        return name;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public static Kunde erzeugeKunde(String n, String a) {
        return new Kunde(n, a);
    }
    
    public void setBonitaet(boolean b) {
        bonitaet = b;
    }
    
    public boolean getBonitaet() {
        return bonitaet;
    }
    
    public void mahnen() {
        System.out.println("Sehr geehrter " + name + ". Mit folgendem Schreiben werden Sie gemahnt.");
    }
    
    public void verbindeBestellung(Bestellung b) {
        bestellungen.add(b);
        b.setKunde(this);
    }
    
    public void loeseBestellung(Bestellung b) {
        bestellungen.remove(b);
    }
    
    public void getBestellungen() {
        Iterator<Bestellung> lit = bestellungen.iterator();
        Bestellung bestellung;
        System.out.println("Der Kunde " + name + " hat folgende Bestellungen: \n");
        while(lit.hasNext()) {
            bestellung=lit.next();
            System.out.println(bestellung.getName() + "\n");
            bestellung.getBestellposten();
        }
    }
}
