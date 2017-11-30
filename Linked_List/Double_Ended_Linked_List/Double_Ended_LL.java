public class Double_Ended_LL {
    Node first;
    Node last;
    
    void insertFirst( int data ) {        
        Node new_item = new Node();
        new_item.integer_data = data;        
        
        if(first == null)               // List is empty
            last = new_item;        // last = first = new_item
        
        new_item.next = first;
        first = new_item;
        
    }
    
    void insertLast( int data ) {        
        Node new_item = new Node();
        new_item.integer_data = data;        
        
        if(first == null)               // List is empty
            first = new_item;        // last = first = new_item
        else
            last.next = new_item;
        
        last = new_item;
        
    }
    
    int deleteFirst( ) {        
        int old_data = first.integer_data;
        
        if(first.next == null)               // List has one element
            last = null;                           // last = first = null ( no elements )

        first = first.next;
        return old_data;
    }
    
    void printList () {
        Node current = first;        
        while ( current != null ) {
            System.out.println( current.integer_data );
            current = current.next;
        }
    }
}
 
