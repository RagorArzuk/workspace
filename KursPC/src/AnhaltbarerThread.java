
public class AnhaltbarerThread extends Thread{

    volatile boolean anhalten = false;
    
    public void run() {
        while(!anhalten) {
            System.out.println("Läuft...");
        }
        
        System.out.println("Beendet");
    }
    
    public void anhalten() {
        anhalten = true;
    }
}
