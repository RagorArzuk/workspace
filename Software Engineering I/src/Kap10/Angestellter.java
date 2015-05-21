package Kap10;

import java.util.*;

public class Angestellter {

    private String name;
    private String abteilung;
    private List<Firmenkunde> firmenkunde;
    
    private Angestellter(String n, String a) {
        name=n;
        abteilung=a;
        firmenkunde=new LinkedList<Firmenkunde>();
    }
    
    public static Angestellter erzeugeAngestellter(String n, String a) {
        return new Angestellter(n, a);
    }
    
    public String getName() {
        return name;
    }
    public String getAbteilung() {
        return abteilung;
    }
    
    public void verbindeSachbearbeiter(Firmenkunde f) {
        firmenkunde.add(f);
        f.verbindeSachbearbeiter(this);
    }
    
    public void loeseSachbearbeiter(Firmenkunde f) {
        firmenkunde.remove(f);
    }
    
    public void getFirmenkunden() {
        Iterator<Firmenkunde> it = firmenkunde.iterator();
        System.out.println("Der Angestellte " + name + " hat folgende Firmenkunden: \n");
        while(it.hasNext()) {
            System.out.println(it.next().getName() + "\n");
        }
    }
}
