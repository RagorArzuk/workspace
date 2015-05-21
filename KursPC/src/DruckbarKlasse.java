
public class DruckbarKlasse implements Druckbar{
    
    int value;
    
    DruckbarKlasse(int i){
        value = i;
    };
    
    public void drucken() {
        System.out.println("DruckbarKlasse: " + value);
    }

}
