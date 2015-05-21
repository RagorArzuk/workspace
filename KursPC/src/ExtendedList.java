import java.util.NoSuchElementException;


public class ExtendedList extends LinkedList{

    public ExtListIterator extListIterator() {
        return new ExtListIterator();
    }
    
    public class ExtListIterator extends ListIterator{
        public boolean hasPrev() {
            return nextIndex!=0;
        }
        
        public Object prev() {
            if(nextIndex==0) throw new NoSuchElementException();
            next = next.prev;
            nextIndex--;
            return next.element;
        }
        
        public void setToEnd() {
            next = header;
            nextIndex = size;
        }
        
        public void cut() {
            if(next != header) {
               header.prev = next.prev;
               next.prev.next = header;
               if(nextIndex==0) header.next = header;
               
            }
        }
        
    }
}
