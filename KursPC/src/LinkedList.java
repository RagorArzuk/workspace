import java.util.NoSuchElementException;


public class LinkedList {

    static class Entry{
        Object element;
        Entry next;
        Entry prev;
        
        Entry(Object elem, Entry next, Entry prev){
            element = elem;
            this.next = next;
            this.prev = prev;
        }
    }
    
    protected Entry header = new Entry(null, null, null);
    protected int size = 0;
    
    LinkedList(){
        header.next = header;
        header.prev = header;
    }
    
    public Object getLast() {
        if (size==0) throw new NoSuchElementException();
        return header.prev.element;
    }
    
    public Object removeLast() {
        Entry lastEntry;
        lastEntry = header.prev;
        if (lastEntry == header) throw new NoSuchElementException();
        lastEntry.prev.next = lastEntry.next;
        lastEntry.next.prev = lastEntry.prev;       
        size--;
        return lastEntry.element;
        }
    
    public void addLast(Object e) {
        Entry entry = new Entry(e, header, header.prev);
        header.prev.next = entry;
        header.prev = entry;
        size++;
    }
    
    public class ListIterator {
        
        protected int nextIndex = 0;
        protected Entry next = header.next;
        
        public boolean hasnext() {
            return (nextIndex!=size);
        }
        
        public Object next() {
            if (nextIndex==size) throw new NoSuchElementException();
            Object elem = next.element;
            next = next.next;
            nextIndex++;
            return elem;
        }
        
        ListIterator listiterator() { return new ListIterator();}
        
   }
    
}
