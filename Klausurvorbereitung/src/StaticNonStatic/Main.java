package StaticNonStatic;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ich stehe noch vor dem static {  } !!");
        System.out.println();
        
        Static s = new Static();        
        s.staticAction();

        System.out.println();
        
        Static s1 = new Static();        
        s1.staticAction();

        
//        DER static {   } BEREICH IN Static.java WIRD NUR EINMAL BEI DER 1. INITIALISERUNG AUFGERUFEN EGAL WIE OFT OBJEKE INITIALISIERT WERDEN!!
//        DER {    } BEREICH, DER NICHT IIN static {  } STEHT WIRD BEI JEDER INITIALISIERUNG DES Static ONJEKTE AUFGERUFEN!!
    }
}
