public class DoublyTest {
    public static void main(String[] args) {
        
        Doubly_LL myList = new Doubly_LL();
        
        myList.insertFirst(4575);       // 4575  ( First to Last )
        
        myList.insertFirst(7789);       // 7789, 4575  ( First to Last )
        
        myList.insertFirst(1);          // 1, 7789, 4575 ( First to Last )

        myList.deleteFirst();           // 7789, 4575  ( First to Last )
        
        myList.insertFirst(9);          // 9, 7789, 4575 ( First to Last )
        
        myList.insertLast(2342);        // 9, 7789, 4575, 2342 ( First to Last )
        

        System.out.println("Displaying First to Last");
        System.out.println("------------------------------");
        myList.displayForward();
        
        System.out.println("------------------------------");
        System.out.println("Displaying Last to First");
        myList.displayBackward();
        
        
    }
}
 
