
public class NetzSurfer {

    protected BedienFenster oberfl;
    protected HinweisFenster fehlerDl;
    protected W3Seite aktSeite;
    protected ExtendedList vorzurueckliste;
    protected ExtendedList.ExtListIterator seitenIter;
    
    NetzSurfer(){
        aktSeite = new W3Seite("Startseite", "Netzsurfer: Keiner ist kleiner");
        vorzurueckliste = new ExtendedList();
        seitenIter = vorzurueckliste.extListIterator();
        seitenIter.setToEnd();
        oberfl = new BedienFenster(this);
        oberfl.aktualisieren();
        fehlerDl = new HinweisFenster(oberfl, "Seite nicht gefunden.");
    }
    
    void laden(String sadr) {
        try {
            String titel, inhalt, s = DateiZugriff.lesen(sadr);
            int trennIndex = s.indexOf("</TITLE>");
            if (s.indexOf("<TITLE>")!= 0 || trennIndex == -1) {
                titel = "Ohne Titel.";
                inhalt = s;
            } else {
                titel = new String(s.toCharArray(), 7, trennIndex-7);
                inhalt = new String(s.toCharArray(), trennIndex+8, s.length() - (trennIndex+8));
            }
            
            aktSeite = new W3Seite(titel, inhalt);
            seitenIter.cut();vorzurueckliste.addLast(aktSeite);
            seitenIter.setToEnd();
            oberfl.aktualisieren();
        } catch (Exception e) {
            fehlerDl.setVisible(true);
        }
    }
    
    void vorgehen() {
        if(seitenIter.hasnext()) {
            aktSeite = (W3Seite) seitenIter.next();
            oberfl.aktualisieren();
        }
    }
    
    void zurueckgehen() {
        seitenIter.prev();
        if(seitenIter.hasPrev()) {
            aktSeite = (W3Seite) seitenIter.prev();
            oberfl.aktualisieren();
        }
        seitenIter.next();
    }
}
