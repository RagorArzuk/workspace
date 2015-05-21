package ObserverPattern;
import java.util.*;

public class KonkretesSubjekt implements Subjekt{

    private List<Beobachter> beobachterListe;
    private float humidity;
    private float pressure;
    private float temperature;
    private String name;
    
    public KonkretesSubjekt(String n) {
        beobachterListe = new LinkedList<Beobachter>();
        name = n;
    }
    
    public void registerBeobachter(Beobachter b) {
        beobachterListe.add(b);
    }
    
    public void removeBeobachter(Beobachter b) {
        beobachterListe.remove(b);
    }
    
    public void notifyBeobachter() {
        for(Beobachter current : beobachterListe) 
            current.update(temperature, humidity, pressure);
    }
    
    public void measurementsChanged() {
        notifyBeobachter();
    }
    
    public void setMeasurements(float t, float p, float h) {
        humidity = h;
        temperature = t;
        pressure = p;
        measurementsChanged();
    }
}