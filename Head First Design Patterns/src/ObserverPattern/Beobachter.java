package ObserverPattern;

public interface Beobachter {

    public void update(float temp, float humidity, float pressure);
    public void display();
}
