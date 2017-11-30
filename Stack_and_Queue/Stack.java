public class Stack {

    int maxSize;
    int[] my_stack;
    int top;

    Stack() {
        maxSize = 1000;
        my_stack = new int[maxSize];
        top = -1;
    }

    void push(int number) {
        top++;
        my_stack[top] = number;
    }

    int pop() { // never call "pop" before checking the stack is NOT empty
        int temp = my_stack[top];
        top--;
        return temp;
    }

    int peek() {
        int last_value = my_stack[top];
        return last_value;
    }
    
    boolean isEmpty () {
        if(top == -1)
            return true;
        return false;
    }
    
    boolean ifFull () {
        if(top == maxSize - 1)
            return true;
        return false;
    }
    
}
 
