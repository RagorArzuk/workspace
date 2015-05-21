package EigeneException;

public class Main {

    public static void main(String[] args) {
        Objekt o = new Objekt(1);
        
        
        try {
            o.testAction();
        } catch (EigeneException ee) {
            System.out.println("EigeneException wurde durchgeführt");
        }
    }
}
