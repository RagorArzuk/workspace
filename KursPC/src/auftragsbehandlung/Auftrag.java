package auftragsbehandlung;
import java.util.LinkedList;
import java.util.ListIterator;


enum Status {
    WARTEND, INBEARBEITUNG, ERLEDIGT;
}

public interface Auftrag {

    Status getZustand();
}

class Auftragsverwaltung{
    protected LinkedList<Auftrag> auftraege = new LinkedList<Auftrag>();
    protected int anzahlAuftraege = 0;
    protected int anzahlBearbeitungen = 0;
    
    private class AuftragIntern implements Auftrag {
        private String beschreibung;
        private Person kunde;
        private Status zustand;
        
        private AuftragIntern(String b, Person k ) {
            beschreibung = b;
            kunde = k;
            zustand = Status.WARTEND;
        }
        
        public Status getZustand() { 
            return zustand;
        }
        
        private void setzustand(Status s) {
            zustand = s;
        }
    }
    
    class AuftragWrapper{
        private AuftragIntern atrg;
        private AuftragWrapper(AuftragIntern a) {
            atrg = a;
        }
        
        String getBeschreibung() {
            return atrg.beschreibung;
        }
        
        void erledigtMelden() {
            atrg.setzustand(Status.ERLEDIGT);
        }
    }
    
    public Auftrag inAuftragGeben(String b, Person k) {
        AuftragIntern a= new AuftragIntern(b,k);
        anzahlAuftraege++;
        auftraege.addLast(a);
        return a;
    }
    
    AuftragWrapper naechstenAuftragHolen() {
       ListIterator<Auftrag> lit = auftraege.listIterator();
        while(lit.hasNext()) {
            AuftragIntern atrg = (AuftragIntern) lit.next();
            if(atrg.getZustand()==Status.WARTEND) {
                atrg.setzustand(Status.INBEARBEITUNG);
                anzahlBearbeitungen++;
                return new AuftragWrapper(atrg);
            }
        }
        return null;
    }
}


