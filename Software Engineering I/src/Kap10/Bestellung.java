package Kap10;
import java.util.*;

public class Bestellung {

        private String name;
        private int nummer;
        private boolean erledigt, abgeschlossen;
        private Kunde kunde;
        private List<Einzelposten> einzelposten;
        
        private Bestellung(String n, int nu) {
            name=n;
            nummer=nu;
            erledigt=false;
            abgeschlossen=false;
            kunde=null;
            einzelposten = new LinkedList<Einzelposten>();
        }
        
        public String getName() {
            return name;
        }
        
        public int getNummer() {
            return nummer;
        }
        
        public void setKunde(Kunde k) {
            kunde=k;
        }
        public String getKunde() {
            return kunde.getName();
        }
        
        public boolean getErledigt() {
            return erledigt;
        }
        public boolean getAbgeschlossen() {
            return abgeschlossen;
        }
        
        public static Bestellung erzeugeBestellung(String n, int nu) {
            return new Bestellung(n, nu);
        }
        
        public void erledigen() {
            erledigt=true;
            
        }
        public void abschliessen() {
            abgeschlossen=true;
            Iterator<Einzelposten> it = einzelposten.iterator();
            Einzelposten einzelP;
            while(it.hasNext()) {
                einzelP = it.next();
                einzelP.setGeliefert();
            }
                
        }
        
        public void liefern() {
            abgeschlossen=true;
            erledigt=true;
            Iterator<Einzelposten> it = einzelposten.iterator();
            Einzelposten einzelP;
            while(it.hasNext()) {
                einzelP = it.next();
                einzelP.setGeliefert();
            }
        }
        
        public void getGeliefert() {
            Iterator<Einzelposten> it = einzelposten.iterator();
            Einzelposten einzelP;
            while(it.hasNext()) {
                einzelP = it.next();
                System.out.println("\nDer Einzelposten mit Namen " +einzelP.getName()+ 
                        " aus der Bestellung " +name+ " ist liefern == " +einzelP.getGeliefert());
            }
        }
        
        public void verbindeBestellposten(Einzelposten e) {
            einzelposten.add(e);
            e.setBestellung(this);
        }
        
        public void loeseBestellposten(Einzelposten e) {
            einzelposten.remove(e);
        }
        
        public void getBestellposten() {
            Iterator<Einzelposten> it = einzelposten.iterator();
            Einzelposten einzelP;
            System.out.println("Die Bestellung mit dem Namen " + name + " "
                    + "und der Nummer " + nummer+" hat die folgenden Einzelposten: \n");
            while(it.hasNext()) {
                einzelP = it.next();
                System.out.println("Name: " + einzelP.getName() + 
                        "\nMenge: " +einzelP.getMenge()+ "\nPreis: " +einzelP.preis()+ "\nUnd das Produkt: " +einzelP.getProdukt().getBezeichnung()+ 
                        " mit dem Einkaufspreis: " +einzelP.getProdukt().getEinkaufspreis()+ " und dem Verkaufspreis: " +einzelP.preis()+ "\n");
            }
        }
        
}
