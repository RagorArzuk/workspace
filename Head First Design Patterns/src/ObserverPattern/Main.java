package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Beobachter beobachter1 = new KonkreterBeobachter("Beobachter 1");
        Beobachter beobachter2 = new KonkreterBeobachter("Beobachter 2");
        Subjekt subjekt1 = new KonkretesSubjekt("Subjekt 1");
        
        subjekt1.registerBeobachter(beobachter1);
        subjekt1.registerBeobachter(beobachter2);
        
        subjekt1.setMeasurements(14.12f, 35, 10.2f);
        
       
        
    }
}
