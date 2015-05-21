package Kap10;

public class Main {
    public static void main (String[] args) {
        Angestellter angestellter1 = Angestellter.erzeugeAngestellter("Frau Hammel", "Sachbearbeitung");
        Firmenkunde firmenkunde1 = Firmenkunde.erzeugeFirmenkunde("Engelbert und Strauss", "Frankfurt", "e&s@web.de", 500000);
        Privatkunde privatkunde1 = Privatkunde.erzeugePrivatkunde("Waldemar Gareis", "Altensteig", 1234567);
        
        Bestellung bestellung1 = Bestellung.erzeugeBestellung("Bestellung Nr1", 001);
        Bestellung bestellung2 = Bestellung.erzeugeBestellung("Bestellung Nr2", 002);
        Bestellung bestellung3 = Bestellung.erzeugeBestellung("Bestellung Nr3", 003);
        
        Einzelposten einzelposten1 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr1", 3);
        Einzelposten einzelposten2 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr2", 4);
        Einzelposten einzelposten3 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr3", 5);
        Einzelposten einzelposten4 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr4", 6);
        Einzelposten einzelposten5 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr5", 7);
        Einzelposten einzelposten6 = Einzelposten.erzeugeEinzelposten("Einzelposten Nr6", 8);
        
        Produkt produkt1 = Produkt.erzeugeProdukt("Produkt Nr1", 125, 189);
        Produkt produkt2 = Produkt.erzeugeProdukt("Produkt Nr2", 150, 250);
        Produkt produkt3 = Produkt.erzeugeProdukt("Produkt Nr3", 300, 450);
        
        
//        Es wurde alles initialisiert und jetzt kommen die verbindungen zwischen den Einzelnen Objekten.
//        1. 1 Einzelposten kann nur 1 Produkt haben.
        einzelposten1.verbindeBezug(produkt1);
        einzelposten2.verbindeBezug(produkt1);
        
        einzelposten3.verbindeBezug(produkt2);
        einzelposten4.verbindeBezug(produkt2);
        
        einzelposten5.verbindeBezug(produkt3);
        einzelposten6.verbindeBezug(produkt3);
//        Jetzt hat jeder Einzelposten ein Produkt.
        
        
//        1 Bestellung hat mehrere Einzelposten. Jetzt werden den BEstellungen die Einzelposten zugeordnet.
        bestellung1.verbindeBestellposten(einzelposten1);
        bestellung1.verbindeBestellposten(einzelposten2);
        bestellung1.verbindeBestellposten(einzelposten3);
        
        bestellung2.verbindeBestellposten(einzelposten4);
        bestellung2.verbindeBestellposten(einzelposten5);
        bestellung2.verbindeBestellposten(einzelposten6);
        
        bestellung3.verbindeBestellposten(einzelposten1);
        bestellung3.verbindeBestellposten(einzelposten3);
        bestellung3.verbindeBestellposten(einzelposten6);
//        Jetzt hat jede Bestellung 3 Einzelposten.
        
        
//        Ein Kunde hat mehrere Bestellungen. Jetzt werden den Kunden die Bestellungen zugeordnet.
        firmenkunde1.verbindeBestellung(bestellung1);
        firmenkunde1.verbindeBestellung(bestellung2);
        privatkunde1.verbindeBestellung(bestellung3);
//        Jetzt hat jeder Kunde eine Bestellung mit 3 Posten.
        
        
//        Den Firmenkunden werden noch Sachbearbeiter zugeordnet.
        firmenkunde1.verbindeSachbearbeiter(angestellter1);
        
        
//        TEST TEST TEST
//        Test1: Ausgabe des Sachbearbeiter von firmenkunde1.
        System.out.println(firmenkunde1.getSachbearbeiter());
        
//        Test2. Ausgabe der Bestellungen der Kunden:
        firmenkunde1.getBestellungen();
        privatkunde1.getBestellungen();
        
//        Test3: Wurde die Bestellung schon geliefert?
        bestellung1.getGeliefert();
        
        
//        Noch nicht und nach der nächsten Zeile?
        bestellung1.liefern();
        bestellung1.getGeliefert();
//        Die Bestellung wurde geliefert und somit ist die Bestellung abgeschlossen und erledigt.
        System.out.println("\n" +bestellung1.getName()+ " ist abgeschlossen: " +bestellung1.getAbgeschlossen()+ 
                " und erledigt: " +bestellung1.getErledigt());
    }

}
