package EigeneException;

public class Objekt {
    
    int ii;
    
    public Objekt(int i) {
        ii = i;
    }

    public void testAction() throws EigeneException{
        if (ii==1)
            throw new EigeneException();
    }
}
