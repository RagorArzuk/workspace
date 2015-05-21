import java.io.IOException;


public class GrossBuchstabenFilter implements CharEingabeStrom{
    
    private CharEingabeStrom cs;
    
    GrossBuchstabenFilter(CharEingabeStrom cs){
        this.cs = cs;
    }
    
    public int read() throws IOException{
        int z = cs.read();
        if(z==-1) return -1;
        else return Character.toUpperCase((char)z); 
    }

}
