public class Queue {
    int maxSize;
    int[] myQueue;
    int front, rear, num_items;
    Queue(int size) {
        maxSize = size;
        myQueue = new int[maxSize];
        front = 0;
        rear = -1;
        num_items = 0;
    }
    void Enqueue(int elm) {
        if (rear == maxSize - 1)
            rear = -1;
        rear++;
        myQueue[rear] = elm;
        num_items++;
    }
    int Dequeue() {
        int elm = myQueue[front];
        front++;
        if (front == maxSize) 
            front = 0;        
        num_items--;
        return elm;
    }
    int Peek() {
        int elm = myQueue[front];
        return elm;
    }
    boolean isEmpty() {
        if (num_items == 0) 
            return true;
         return false;        
    }    
    boolean isFull() {
        if (num_items == maxSize) 
            return true;
         return false;        
    }    
    int size() {
        return num_items;
    }
}
 
