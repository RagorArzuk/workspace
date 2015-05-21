package ObserverPattern;

public class Observable1 implements ObservableInterface {

    ObserverInterface oi;
    
    public Observable1() {}
    
    public void observableAction1() {
        System.out.println("Ich bin Observable1 und wurde mit default-Konstruktor erstellt.");
    }
    
    public void observableAction2() {};
    
}
