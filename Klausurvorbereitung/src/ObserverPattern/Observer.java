package ObserverPattern;

import java.util.LinkedList;

public class Observer extends Thread implements ObserverInterface{

    String name;
    LinkedList<ObservableInterface> oi;
    
    public Observer(String n) {
        name = n;
        oi = new LinkedList<ObservableInterface>();
    }
    
    public void anmeldenBeobachter(ObservableInterface a) {
        oi.add(a);
    }
    
    public void observerAction1() {
        for (ObservableInterface current : oi) {
            System.out.print(getThreadName() + ": ");
            current.observableAction1();
        }    
    }
    
    public void observerAction2() {
        for(ObservableInterface current : oi) {
            System.out.print(getThreadName() + ": ");
            current.observableAction2();
        }
    }
    
    public void run() {
        observerAction1();
        observerAction2();
    }
    
    public String getThreadName() {
        return name;
    }
}
