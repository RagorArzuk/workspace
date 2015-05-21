package Kap10;

public class Privatkunde extends Kunde{

    private int kreditkartennummer;
    
    private Privatkunde(String n, String a, int kkn) {
        super(n, a);
        kreditkartennummer=kkn;
    }
    
    public void setKreditkartennummer(int kkn) {
        kreditkartennummer=kkn;
    }
    public int getKreditkartennummer() {
        return kreditkartennummer;
    }
    
    public static Privatkunde erzeugePrivatkunde(String n, String a, int kkn) {
        return new Privatkunde(n, a, kkn);
    }
}
