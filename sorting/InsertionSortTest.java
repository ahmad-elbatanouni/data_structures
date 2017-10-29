public class InsertionSortTest {
    // Insertion Sort #comparisons
    //      Worst Case  = N * ( N - 1) / 2
    //      Average     = N * ( N - 1) / 4
    //      BEST        = ( N - 1)          // Array is already Sorted
    
    // Insertion Sort #copies
    //      Worst Case  = N * ( N - 1) / 2
    //      Average     = N * ( N - 1) / 4
    //      BEST        = ZERO              // Array is already Sorted



    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        
        int [] arr1 = {50, 40, 2, -1, -43};
        obj.InsertionSort_Ascending(arr1);
        
        
        int [] arr2 = {-43, -1, 2, 40, 50};
        obj.InsertionSort_Descending(arr2);
        
        System.out.println("\nWorst Case:");
        int [] arr3 = {50, 40, 2, -1, -43};
        obj.InsertionSort_count_comparisons(arr3);
        




        System.out.println("\nWorst Case:");
        int [] arr4 = {50, 40, 2, -1, -43};
        obj.InsertionSort_count_copies(arr4);
        
        
        System.out.println("\nAverage Case:");
        int [] arr5 = {-1, 50, -43, 40, 2};
        obj.InsertionSort_count_copies(arr5);


        
    }
}

class InsertionSort {

    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    //
    //                  Insertion Sort 
    //                      --> Ascending, Descending
    //                      --> with count of number of comparisons
    //                      --> with count of number of COPIES
    //    
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    void InsertionSort_Ascending(int[] array) {
        int nElements = array.length;
        for (int i = 0; i < nElements; i++) {
            int current = array[i];
            int j = i - 1;
            
            // Descending --> check if array[j] is GREATER THAN current
            while (j >= 0 && array[j] >= current) {
                array[j + 1] = array[j];
                j--;
            }
            array[ j + 1 ] = current;
        }

        System.out.println("\nArray Ascending");
        System.out.println("------------------------------------");
        print(array);
    }

    void InsertionSort_Descending(int[] array) {
        int nElements = array.length;
        for (int i = 0; i < nElements; i++) {
            int current = array[i];
            int j = i - 1;
            
            // Descending --> check if array[j] is SMALLER THAN current
            while (j >= 0 && array[j] <= current) {
                array[j + 1] = array[j];
                j--;
            }
            array[ j + 1 ] = current;
        }

        System.out.println("\nArray Descending");
        System.out.println("------------------------------------");
        print(array);
    }

    
    
    //Ascending
    void InsertionSort_count_comparisons(int[] array) {
        int nElements = array.length;
        
        int num_comps = 0;
        
        for (int i = 0; i < nElements; i++) {
            int current = array[i];
            int j = i - 1;
            
            
//            while (j >= 0 && array[j] >= current) {
            while (j >= 0) {
                num_comps++;
                if(array[j] >= current) {
                    array[j + 1] = array[j];
                    j--;
                } else {
                    break;
                }
            }
            array[ j + 1 ] = current;
        }

        System.out.println("Number of COMPARISONS is: " + num_comps);
    }

    //Ascending
    void InsertionSort_count_copies(int[] array) {
        int nElements = array.length;
        
        int num_copies = 0;
        
        for (int i = 0; i < nElements; i++) {
            int current = array[i];
            int j = i - 1;
            
            
//            while (j >= 0 && array[j] >= current) {
            while (j >= 0) {
                if(array[j] >= current) {                   
                    num_copies++;
                    array[j + 1] = array[j];
                    j--;
                } else {
                    break;
                }
            }
            array[ j + 1 ] = current;
        }

        System.out.println("Number of COPIES is: " + num_copies);
    }

}
