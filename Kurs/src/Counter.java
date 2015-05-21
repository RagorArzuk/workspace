
public class Counter {

    private int startvalue;
    private int value;
    private int min = 0;
    private int max = 99;
    
    Counter(int start){
        this.value = start;
        this.startvalue = start;
    }
    
    void inc() {
        if (value < max)
            value++;
    }
    
    void dec() {
        if(value>min)
            value--;
    }
    
    void reset() {
        value = startvalue;
    }
    
    public String toString() {
        return (""+ value);
    }
}
