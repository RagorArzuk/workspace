import java.util.*;



class LinkedList1<ET extends Druckbar>{
    static class Entry<T> {
        
        T element;
        Entry<T> next;
        Entry<T> previous;
        
        Entry(T element, Entry<T> next, Entry<T> previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }       
    }
    
    protected Entry<ET> header = new Entry<ET>(null, null, null);
    protected int size = 0;
    
    LinkedList1(){
        header.next = header;
        header.previous = header;
    }
    
    ET getLast() {
        if(size==0)throw new NoSuchElementException();
        return header.previous.element;
    }
    
    ET removeLast() {
        Entry<ET> lastentry = header.previous;
        if (lastentry == header) throw new NoSuchElementException();
        lastentry.previous.next = lastentry.next;
        lastentry.next.previous = lastentry.previous;
        size--;
        return lastentry.element;
                
    }
    
    void addLast (ET e) {
        Entry<ET> newEntry = new Entry<ET>(e, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }
    
    int size() {
        return size;
    }
        
 
    void printAll() {
        ListIterator1 it = listIterator();
        while (it.hasNext()) {
        ET elem = it.next();
        elem.drucken();
        System.out.println("======");}
    }
    
    
    
    class ListIterator1 {
        protected int nextIndex = 0;
        protected Entry<ET> next = header.next;
        
        boolean hasNext() {
            return nextIndex != size;
        }
        
        ET next() {
            if (nextIndex==size)
                throw new NoSuchElementException();
            ET elem = next.element;
            next = next.next;
            nextIndex++;
            return elem;
        }
        
        int getNext() {
            return nextIndex;
        }
        
    }
    ListIterator1 listIterator() {
        return  new ListIterator1();
               
    }
    
    
    
    
    
}
