
public class Boersianer1 implements Beobachter{

    private boolean besitzt = false;
    
    public void steigen(Aktie a) {
        if (a.getKursWert()<300 && !besitzt) {
            System.out.println("Kauf von: " + a.getName());
            besitzt = true;
        }
    }
    
    public void fallen(Aktie a) {
        if (a.getKursWert()>400 && besitzt) {
            System.out.println("Verkauf von " + a.getName());
            besitzt = false;
        }
    }
}
