import java.io.IOException;


public class StringLeser implements CharEingabeStrom {

    private char[] dieZeichen;
    private int index = 0;
    
    StringLeser(String s){
        dieZeichen = s.toCharArray();
    }
    
    public int read(){
        if(index==dieZeichen.length) {
            return -1;
            
        }else {
            System.out.println("das normale read() wurde benutzt.");
            return dieZeichen[index++];
        }
    }
}
