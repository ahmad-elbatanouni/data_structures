public class Test {
    public static void main(String[] args) {
        
        List myList = new List();
        
        myList.insertFirst(4575);       // 4575  ( First to Last )
        
        myList.insertFirst(7789);       // 7789, 4575  ( First to Last )
        
        myList.insertFirst(1);              // 1, 7789, 4575 ( First to Last )
        
        myList.deleteFirst();               // 7789, 4575  ( First to Last )
        
        myList.insertFirst(9);              // 9, 7789, 4575 ( First to Last )
        
        myList.insertLast(2342);        // 9, 7789, 4575, 2342 ( First to Last )
        
        
        System.out.println("List items: ");
        myList.printList();
        
        System.out.println("------------------------------");
        System.out.println("List Length: ");
        System.out.println(myList.length());

        System.out.println("------------------------------");
        System.out.println("Searching for '50': ");
        Node searching_for_50 = myList.search(50);
        
       if ( searching_for_50 == null )
            System.out.println("Not Found");
       else
            System.out.println("Found");
       
       System.out.println("------------------------------");
        System.out.println("Searching for '9': ");
        Node searching_for_9 = myList.search(9);
        
       if ( searching_for_9 == null )
            System.out.println("Not Found");
       else
            System.out.println("Found");
        
    }
} 
