package Abb1410;

public class Prüfer {
    
    private Koordinator k;
    private String name;
    private boolean geprüft;
    
    public Prüfer(){}

    public Prüfer(Koordinator k, String n) {
        geprüft=false;
        this.k=k;
        name=n;
    }
    
    public static Prüfer erzeuge() {
        return new Prüfer();
    }
    
    public static Prüfer erzeuge(Koordinator k, String n) {
        return new Prüfer(k, n);
    }
    
    public void istOK() {
        setGeprüft();
        System.out.println("Prüfer " +name+ " ist OK!");
        k.alleÜberprüfen();
    }
    
    public boolean setGeprüft() {
        return geprüft = true;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean getGeprüft() {
        return geprüft;
    }
}
