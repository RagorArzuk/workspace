package Abb1410;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Koordinator {
    
    private LinkedList<Prüfer> prüferListe;
    
    public Koordinator() {
        prüferListe = new LinkedList<Prüfer>();
    }

    public static Koordinator erzeuge() {
        return new Koordinator();
    }
    
    public void bearbeiten(String name1, String name2) {
        Prüfer A = Prüfer.erzeuge(this, name1);
        Prüfer B = Prüfer.erzeuge(this, name2);
        
        prüferListe.add(A);
        prüferListe.add(B);
        
        A.istOK();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        B.istOK();
    }
    
    public boolean alleÜberprüfen() {
        Iterator<Prüfer> it = prüferListe.iterator();
        Prüfer p = Prüfer.erzeuge();
  
//Hier hat man zwei Möglichkeiten die ABfrage nach allen Prüfern zu übernehmen: Entweder Möglichkeit 2,
//die hier standardmäßig implementiert ist oder Möglichkeit 1!
        
//Möglichkeit 1:
//        int geprüft = 0;
//        while(it.hasNext()) {
//           p=it.next();
//           if(p.getGeprüft()==true)
//               ++geprüft;
//        }
//
//        if(geprüft==prüferListe.size())       
//            System.out.println("Alles OK!");
//            return true;
//        }else
//            return false;
        
//Möglichkeit 2:        
        boolean prüfen=false;
        while(it.hasNext()) {
            p=it.next();
            if(p.getGeprüft()==true) {
                prüfen=true;
                continue;
            }else {
                prüfen=false;
                break;
            }
         }
         if(prüfen==true) {
             System.out.println("Alles OK!");
             return true;
         }else
             return false;
         
    }
}
