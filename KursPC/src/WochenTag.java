
public class WochenTag {

    private enum Wochentag{
        Mo, Di, Mi, Do, Fr, Sa, So;
    }
    
    private Wochentag aktuellerTag;
    
    WochenTag(){
        aktuellerTag = Wochentag.Mo;
    }
    
    public void setTag(Wochentag tag) {
        aktuellerTag = tag;
    }
    
    public Wochentag getTag() {
        return aktuellerTag;
    }
    
    public void naechsterTag() {
        int index = (aktuellerTag.ordinal()+1) % 7;
        aktuellerTag = Wochentag.values()[index];
    }
    
    public void vorhergehenderTag() {
        int index = aktuellerTag.ordinal();
        if (index == 0) {
            index = 6;
        } else {
            index = index + 1;
        }
        aktuellerTag = Wochentag.values()[index];       
    }
    
    public String toString() {
        return aktuellerTag.toString();
    }
    
}
