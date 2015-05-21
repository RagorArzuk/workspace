
public class Lexik implements FilterPraedikat{

    String aktMax = "";
    public boolean test(String s) {
        if(s.compareTo(aktMax)>=0) {
            aktMax = s;
            return true;
        } else return false;
    }
}
