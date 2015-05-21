package ObserverPattern;

public class KonkreterBeobachter implements Beobachter{

    private String name;
    private float t, h, p;
    
    public KonkreterBeobachter(String name) {
        this.name = name;
    }
    
    public void update(float t, float h, float p) {
        this.t = t;
        this.h = h;
        this.p = p;
        display();
    }
    
    public void display() {
        System.out.println("Beobachter " + name + " hat folgende Werte:");
        System.out.println("Temperatur: " + t + ". Humidity: " + h + ". Pressure: " + p);
    }
    
}
