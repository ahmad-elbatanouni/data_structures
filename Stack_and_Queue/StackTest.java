public class StackTest {

    public static void main(String[] args) {
        Stack myObject = new Stack();

        myObject.push(78);
        myObject.push(5);
        myObject.push(54);

        // printing the stack elements ( top to bottom )
        while (!myObject.isEmpty()) {
            System.out.println(myObject.pop());
        }

        // Re-populating the stack
        myObject.push(78);
        myObject.push(5);
        myObject.push(54);

        // Finding the sum of the stack elements
        int sum = 0;

        while (!myObject.isEmpty()) {
            sum += myObject.pop();
        }

        System.out.println("Sum is: " + sum);

        // Re-populating the stack
        myObject.push(78);
        myObject.push(5);
        myObject.push(54);
        
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        // Displaying the stack elements in a reverse order
        // using a second stack
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        Stack second_stack = new Stack();

        while (!myObject.isEmpty()) {
            second_stack.push(myObject.pop());
        }

        // printing
        System.out.println("Displaying in a reverse order: ");
        while (!second_stack.isEmpty()) {
            System.out.println(second_stack.pop());
        }
    }

}
