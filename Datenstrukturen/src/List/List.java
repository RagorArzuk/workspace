package List;

public class List {
    
    private class Entry{
        int value;
        Entry pred, succ;
    }
    
    private Entry header;
    private int top = 0;
    
    public List() {
        header.succ = header;
        header.pred = header;
    }
    
    
}
