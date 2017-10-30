public class BubbleSortTest {
    // Bubble Sort #comparisons (Worst, Average, Best) = N * ( N - 1) / 2
    // Bubble Sort #swaps
    //        worst case    ==> elements are ordered in a reverse order = N * ( N - 1) / 2
    //        Average case  ==> half the elements have to be swapped = N * ( N - 1) / 4
    //        Best Case ==> ZERO

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        
        int [] arr1 = {50, 40, 2, -1, -43};
        obj.bubbleSort_Ascending(arr1);
                
        int [] arr2 = {-43, -1, 2, 40, 50};
        obj.bubbleSort_Descending(arr2);
        
        
        int [] arr3 = {50, 40, 2, -1, -43};
        obj.bubbleSort_count_comparisons(arr3);
        
        System.out.println("\nWorst Case:");
        int [] arr4 = {50, 40, 2, -1, -43};
        obj.bubbleSort_count_swaps(arr4);
        
        System.out.println("\nAverage Case:");
        int [] arr5 = {-1, 50, -43, 40, 2};
        obj.bubbleSort_count_swaps(arr5);


        System.out.println("\nBest Case:");
        int [] arr6 = {-43, -1, 2, 40, 50};
        obj.bubbleSort_count_swaps(arr6);
    }

}

class BubbleSort {
    
    void print (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    void swap (int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    //
    //                  Bubble Sort 
    //                      --> Ascending, Descending
    //                      --> with count of number of comparisons
    //                      --> with count of number of swaps
    //    
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    void bubbleSort_Ascending(int [] array) {
        int nElements = array.length;        
        for(int i = nElements - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                
                // Ascending --> check if array[j] is GREATER THAN array[ j + 1 ]
                if (array[j] > array[j + 1]) {
                   swap(array, j, j + 1);
                }
                
            }
        }
        
        System.out.println("\nArray Ascending");
        System.out.println("------------------------------------");
        print(array);
    }
    
    
    void bubbleSort_Descending(int [] array) {
        int nElements = array.length;        
        for(int i = nElements - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                
                // Descending --> check if array[j] is SMALLER THAN array[ j + 1 ]
                if (array[j] < array[j + 1]) {
                   swap(array, j, j + 1);
                }
                
            }
        }        
        
        System.out.println("\nArray Descending");
        System.out.println("------------------------------------");
        print(array);
    }
    
    
    //Ascending
    void bubbleSort_count_comparisons(int [] array) {
        int nElements = array.length;       
        int num_comp = 0;
        
        
        for(int i = nElements - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                num_comp++;
                
                if (array[j] > array[j + 1]) {
                   swap(array, j, j + 1);
                }
                
            }
        }
        
        System.out.println("\nNumber of COMPARISONS is: " + num_comp);
        
    }
    
    //Ascending
    void bubbleSort_count_swaps(int [] array) {
        int nElements = array.length;       
        int num_swaps = 0;
        
        
        for(int i = nElements - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                
                if (array[j] > array[j + 1]) {
                   swap(array, j, j + 1);
                   num_swaps++;
                }
                
            }
        }
        
        System.out.println("Number of SWAPS is: " + num_swaps);
        
    }
    
}