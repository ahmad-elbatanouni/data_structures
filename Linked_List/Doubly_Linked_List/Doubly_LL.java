class Doubly_Node {
    int integer_data;
    Doubly_Node next;
    Doubly_Node previous;
}

public class Doubly_LL {

    Doubly_Node first;
    Doubly_Node last;

    void insertFirst(int new_element) {
        Doubly_Node new_node = new Doubly_Node();       // step 1
        new_node.integer_data = new_element;
        if (first == null) 
            last = new_node;
        else 
            first.previous = new_node;                  // step 2
        new_node.next = first;                          // step 3
        first = new_node;                               // step 4
    }
    
    void insertLast ( int new_element ) {
        Doubly_Node new_node = new Doubly_Node ( ) ;
        new_node.integer_data = new_element;
        if ( first == null )
            first = new_node;   
        else {
            last.next= new_node;
            new_node.previous = last;
        }
        last = new_node;
    }
    
    Doubly_Node deleteFirst ( ) {
        Doubly_Node temp = first;
        if ( first.next == null )               // if ONE item
            last = null;
        else                                    // if More than ONE item
            first.next.previous = null;
        first = first.next;
        return temp;
    }
    
    Doubly_Node deleteLast ( ) {
        Doubly_Node temp = last;
        if ( first.next == null )
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }
    
    void displayForward ( ) {
    Doubly_Node current = first;
        while ( current != null ) {
            System.out.println( current.integer_data );
            current = current.next;
        }
    }
    
    void displayBackward ( ) {
    Doubly_Node current = last;
        while ( current != null ) {
            System.out.println( current.integer_data );
            current = current.previous;
        }
    }
    
    boolean insertAfter ( int searchKey, int data ) {
        Doubly_Node current = first;
        // Search Part
        while ( current.integer_data != searchKey ) {
            current = current.previous;
            if (current == null )
                return false;
        }
        
        // Insert Part
        Doubly_Node new_node = new Doubly_Node ( ) ;
         new_node.integer_data = data;
        if ( current == last )                       // insertLAST
            last = new_node;
        else {                                       // insert in the middle
            new_node.next = current.next;
            current.next.previous = new_node;
        }
        new_node.previous = current;
        current.next= new_node;
        return true;
    }



}
 
