package Abb1410;

public class Main {
    public static void main(String[] args) {
        Geschäftsvorfall gv=Geschäftsvorfall.erzeuge();
        Koordinator k = Koordinator.erzeuge();
        k.bearbeiten("A", "B");
    }
}
