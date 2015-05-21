import java.util.LinkedList;
import java.util.Iterator;

public class Behaelter /*implements Druckbar*/ {
//    Druckbar test;
//    Behaelter(Druckbar test){
//        this.test = test;
//    }
//    
//    public Druckbar getTest() {
//        return test;
//    }
//    
//    public void drucken() {
//        System.out.println(test);
//    }
    
    LinkedList1<Druckbar> dieElemente;
    
    Behaelter(LinkedList1<Druckbar> dieElemente){
        this.dieElemente = dieElemente;
    }
    
    public void alle_drucken() {
        LinkedList1<Druckbar>.ListIterator1 it = dieElemente.listIterator();
        
        while (it.hasNext()) {
            Druckbar e = it.next();
            e.drucken();
        }
    }
    
       
}
