
public class PraefixAoderB implements FilterPraedikat {

    public boolean test(String s) {
        return (s.length()>0) && (s.charAt(0) == 'A' || s.charAt(0) == 'B');
    }
}
