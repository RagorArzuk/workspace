import java.util.*;

class LinkedList1<ET> {
    static class Entry<ET>{
        ET element;
        Entry<ET> next;
        Entry<ET> previous;
        
        Entry(ET element, Entry<ET> next, Entry<ET> previous ){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    
    Entry<ET> header = new Entry<ET>(null, null, null);
    int size = 0;
    
    LinkedList1(){
        header.next = header;
        header.previous = header;
    }
    
    ET getLast() {
        if (size==0) throw new NoSuchElementException();
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
    
    void addLast(ET e) {
        Entry<ET> newEntry = new Entry<ET>(e, header, header.previous);
            header.previous.next = newEntry;
            header.previous =newEntry;
            size++;           
    }
    
    int size() {
        return size;
    }
    
    class ListIterator{
        private int nextIndex = 0;
        private Entry<ET> next = header.next;
        
        boolean hasNext() {
            return (size!=nextIndex);
        }
        
        int getNext() {
            return nextIndex;
        }
        
        ET next() {
            if (nextIndex == size) throw new NoSuchElementException();
            ET elem = next.element;
            next = next.next;
            nextIndex++;
            return elem;
        }
    }
    
    ListIterator listIterator() {
        return new ListIterator();
    }
    
}
