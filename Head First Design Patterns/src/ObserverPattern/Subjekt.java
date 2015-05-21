package ObserverPattern;

public interface Subjekt {

    public void registerBeobachter(Beobachter b);
    public void removeBeobachter(Beobachter b);
    public void notifyBeobachter();
    
    public void setMeasurements(float t, float h, float p);
}
