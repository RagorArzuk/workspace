package StaticNonStatic;

public class Static {

    static {
        System.out.println("Hello, ich werde nur einmal aufgerufen EGAL WIE OFT ICH NEUE OBJEKTE ERZEUGE!!");
    }
    
    
    {
        System.out.println("Und ich werde jedes Mal aufgerufen, da ich nicht in einem static {    } stehe!!");
    }
    
    
    
    
    public void staticAction() {
        System.out.println("Ich kann so oft aufgereufen werden wie ich will.");
    }
}
