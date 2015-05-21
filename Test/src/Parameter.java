
public class Parameter<T> {

    T a;
    T b;
    T ergebnis;
    
    public Parameter(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public T summe (int a, T b) {
        return a+b;
    }
}
