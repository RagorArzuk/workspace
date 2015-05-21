
public class DruckMitLaufNr {

    private static int laufendeNr = 1;
    public static void nrDrucken(Druckbar db) {
        System.out.println("LaufendeNr. " + laufendeNr + ": ");
        db.drucken();
        laufendeNr++;
    }
}
