
public class FilterMain {

    static void printStringArray(String[] strs) {
        for (int i=0;i<strs.length;i++)
            System.out.println(strs[i]);
    }
    
    static String[] filter(String[] strs, FilterPraedikat fp) {
        int i, j = 0;
        String[] aux = new String[strs.length];
        for (i=0;i<strs.length;i++) {
            if(fp.test(strs[i])) {
                aux[j] = strs[i];
                j++;
            }
        }
        String[] ergebnis = new String[j];
        System.arraycopy(aux, 0, ergebnis, 0, j);
        return ergebnis;
    }
    
}
