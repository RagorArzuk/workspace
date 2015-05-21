package LinkedListPackage;

import java.util.NoSuchElementException;

public class LinkedList1<ET> {

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
        
        private Entry<ET> headerHinten = new Entry<ET>(null, null, null);
        private Entry<ET> headerVorne = new Entry<ET>(null, null, null);
        private int count = 0;
        
        public LinkedList1() {
            headerVorne.next = headerHinten;
            headerHinten.previous = headerVorne;
        }
        
        public ET getLast() {
            if (count == 0)
                throw new NoSuchElementException();
            else {
                return headerHinten.previous.element;
            }
        }
        
        public void addLast(ET e) {
            Entry<ET> newElem = new Entry<ET>(e, headerHinten.previous, headerHinten);
            headerHinten.previous.next = newElem;
            headerHinten.previous = newElem;
            count++;
        }
        
        public ET removeLast() {
            Entry<ET> delElement = headerHinten.previous;
            if(delElement == headerHinten) 
                throw new NoSuchElementException();
            delElement.previous.next = delElement.next;
            delElement.next.previous = delElement.previous;
            count--;
            return delElement.element;
        }
        
        public void addFirst(ET e) {
            Entry<ET> elem = new Entry<ET>(e, headerVorne.next, headerVorne);
            if(count==0)
                headerVorne.next = elem;
            else {
                
            }
            
        }
}

