package ObserverPattern;

public class Observable2 implements ObservableInterface{

    private ObserverInterface ointerface;
    
    public Observable2 (ObserverInterface oi) {
        ointerface = oi;
    }
    
    public void observableAction1() {
        try {
        System.out.println("Ich bin Observable2 mit Referenz auf ein ObservableInterface im Konstruktor\n"
                + "Der Name meines Observer ist: " + ointerface.getThreadName());
        
        } catch (NullPointerException e) {
            System.out.println("Irgendwas stimmt nicht!");
          } 
    }
    
    public void observableAction2() {}
    
    public String getOName() {
        return ointerface.getThreadName();
    }
    
}
