package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Observer observer1 = new Observer("Observer1");
        Observer observer2 = new Observer("Observer2");
        
        
        
        ObservableInterface oi1 = new Observable1();
        ObservableInterface oi2 = new Observable2(observer1);
        
        
    
        observer1.anmeldenBeobachter(oi1);
        observer1.anmeldenBeobachter(oi2);
    
        
        observer2.anmeldenBeobachter(oi1);
        observer2.anmeldenBeobachter(oi2);
        
        try {
        while (true) {
        
        observer1.run();
        observer1.sleep(10000);
        
        System.out.println();
        System.out.println();
        
        observer2.run();
        observer2.sleep(1000);
        
        
        }
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }
        // oi2.getOName(); DAFÜR MUSS GETONAME() IN INTERFACE DEFINIERT SEIN. ODER DIE OBSERVABLE NICHT ALS INTERFACE KONSTRUIEREN
    }
}
