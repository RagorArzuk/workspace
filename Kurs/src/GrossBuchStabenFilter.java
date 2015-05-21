import java.io.IOException;


public class GrossBuchStabenFilter implements CharEingabeStrom {

    private CharEingabeStrom eingabeStrom;
    
    public GrossBuchStabenFilter (CharEingabeStrom cs) {
        eingabeStrom = cs;
    }
    
    public int read() throws IOException{
        int z = eingabeStrom.read();
        if(z==-1) {
            return -1;
        }
        else {
            System.out.println("GrossBuchstabenFilter wurde benutzt.");
            return Character.toUpperCase((char) z);
   
        }
    }
}
