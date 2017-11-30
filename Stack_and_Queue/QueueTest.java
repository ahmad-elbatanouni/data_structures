public class QueueTest {
    public static void main(String[] args) {
        Queue x = new Queue(5);
        
        x.Enqueue(15);
        x.Enqueue(25);
        x.Enqueue(35);
        x.Enqueue(45);
        x.Enqueue(55);
        
        if(!x.isEmpty())
            System.out.println(x.Dequeue());
                
    }
}
 
