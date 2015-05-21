package LinkedListPackage;

import java.util.NoSuchElementException;

public class LinkedList<ET> {

    private class Entry <ET>{
        ET element;
        Entry<ET> next;
        Entry<ET> previous;
        
        Entry (ET element, Entry<ET> next, Entry<ET> previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    
    private Entry<ET> header = new Entry<ET>(null, null, null);
    private int count = 0;
    
    public LinkedList() {
        header.next = header;
        header.previous = header;
    }
    
    public ET getLast() {
        if (count == 0)
            throw new NoSuchElementException();
        else {
            return header.previous.element;
        }
    }
    
    public void addLast(ET e) {
        Entry<ET> newElem = new Entry<ET>(e, header.previous, header);
        header.previous.next = newElem;
        header.previous = newElem;
        count++;
    }
    
    public ET removeLast() {
        Entry<ET> delElement = header.previous;
        if(delElement == header) 
            throw new NoSuchElementException();
        delElement.previous.next = delElement.next;
        delElement.next.previous = delElement.previous;
        count--;
        return delElement.element;
    }
}
