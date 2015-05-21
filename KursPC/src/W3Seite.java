
public class W3Seite {

    private String seite;
    
    W3Seite(String t, String i){
        seite = "<TITLE>" + t + "</TITLE>" + i;
    }
    
    String getTitel() {
        int trennIndex = seite.indexOf("</TITLE>");
        return new String(seite.toCharArray(), 7, trennIndex - 7);
    }
    
    String getInhalt() {
        int trennIndex = seite.indexOf("</TITLE>");
        return new String(seite.toCharArray(), trennIndex+8, seite.length() - (trennIndex+8));
    }
}
