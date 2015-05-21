package ObserverPattern;

public interface ObserverInterface {
    public void anmeldenBeobachter(ObservableInterface oi);
    public String getThreadName();
    public void observerAction1();
    public void observerAction2();
}
