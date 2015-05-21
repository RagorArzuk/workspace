package EigeneException;

public class EigeneException extends Exception {
    
    EigeneException(){
        performAction();
    }
    
    private void performAction() {
        System.out.println("Es wurde performedAction() aus EigeneException ausgeführt, das bedeutet wenn eine Exception gethrowed wird kann man ihr Methoden geben , die dann aufgerufen werden.");
    }

}
