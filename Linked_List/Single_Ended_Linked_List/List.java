
public class List {
    Node head;
    
    void insertFirst( int data ) {        
        Node new_item = new Node();
        new_item.integer_data = data;        
        new_item.next = head;        
        head = new_item;
        
    }
    
    void deleteFirst( ) {        
        head = head.next;        
    }
    
    int length () {
        Node current = head;
        int counter = 0;        
        while ( current != null ) { // making sure we didn't arrive at the last element            
            counter ++;            
            current = current.next; // get the next node                                
        }        
        return counter;
    }
    
    
    Node search( int data ) {        
        Node current = head;        
        while ( current != null ) {
            if (current.integer_data == data) {
                return current;
            }                         
            current = current.next;
        }
        
        // if the loop is ended, then we couldn't find what we're looking for
        return null; // return NOTHING
    }
    
    Node delete( int data ) {
        
        Node current = head;
        Node previous = head;
        
        while ( current.integer_data != data ) {
            if ( current.next == null ) { // reached the end of the list
                return null;
            } 
                        
            previous = current;
            current = current.next;
        }
        
        if ( current == head )
            head = head.next; // drop the first node .. just like what we did with deleteFirst
        else
            previous.next = current.next;        
        return current;
    }
    
    void insertLast( int data ) {
        Node new_element = new Node();
        new_element.integer_data = data;        
        Node current = head;        
        while (current.next != null) {            
            current = current.next;
        }        
        current.next = new_element;        
    }
    
    void printList () {
        Node current = head;        
        while ( current != null ) {          // making sure we didn't arrive at the last element
            System.out.println( current.integer_data );
            current = current.next;        // move to the next node
        }
    }
    
    
}
 
