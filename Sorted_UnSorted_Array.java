public class Sorted_UnSorted_Array {
    public static void main(String[] args) {        
        // create an empty array --> any size
        int [] arr = new int[100];        
        // create a new object of the class Unsorted
        Unsorted myObject = new Unsorted();        
        // insert some items
        myObject.Insert(arr, 12);
        myObject.Insert(arr, 18);
        myObject.Insert(arr, 1);
        myObject.Insert(arr, 6);
        myObject.Insert(arr, 13);        
        // calling the print function
        //myObject.print(arr);
        
        
        // deleting some items
        int non_existing_element = myObject.delete(arr, 555);
        //System.out.println(non_existing_element);
        
        
        // deleting some items
        int existing_element = myObject.delete(arr, 18);
        //System.out.println(existing_element);
        
        //calling  the print function to make sure element was deleted
        myObject.print(arr);
   
    }    
}

class Unsorted {
    int counter = 0; // used to keep track of the number of elements in the array --> can be used in any function in the class
    
    void print (int [] arr) {
        for (int i = 0; i < counter; i++) { // counter -- not arr.length --> that's why it will stop at 13
            System.out.println(arr[i]);
        }
    }
    
    // insert returns NOTHING --> void
    void Insert(int [] array, int new_element) {
        array[counter++] = new_element;
    }
    
    // search
    // returns the index in case the search key was found
    // returns -1 otherwise
    
    int search(int [] array, int search_key) {
        
        // don't use " array.length "
        for(int i = 0; i < counter; i++) {
            if(search_key == array[i])
                return i; // return index if key was found
        }
        
        // if we loop through the whole array --> this means the key was not found --> -1
        return -1;
    }
    
    // returns 1 in case element was deleted
    // returns 0 in case element was not found
    
    int delete (int [] arr, int search_key) {
        // searching first
        int i;
        for ( i = 0; i < counter; i++) {
            if(search_key == arr[i])
                break;
        }
        
        if(i == counter) // we looped through the array and nothing was found
            return 0;
        
        //in case we found some item --> move elements
        for (int j = i; j < counter; j++) {
            arr[j] = arr[j+1];
        }
        // decrement counter
        counter--;
        return 1; // element was deleted
    }
    
}

class Sorted {
    
} 
