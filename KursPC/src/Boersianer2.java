
public class Boersianer2 implements Beobachter{

    private int maximum = 0;
    
    public void steigen(Aktie a) {
        if (a.getKursWert()>maximum) {
            System.out.println("Neues maximum: " + a.getKursWert());
            maximum = a.getKursWert();
        }
    }
    
    public void fallen(Aktie a) {};
}
