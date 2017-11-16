public class QuickSortDescTest {

	// Difference from the Ascending Code --> line 50

	public static void main(String[] args) {

		int [] arr = { 12, 9, 8, 7, 13, 6, 2, 1 };

		System.out.println();
		System.out.println("Unsorted Array: ");

		print( arr ); 


		quickSort( arr, 0, arr.length - 1 );

		System.out.println();
		System.out.println("Array After applying Quick Sort:");	
	
		print( arr );

		System.out.println();

	}


	public static void quickSort(int [] arr, int start, int end){
		if(end - start <= 0)
			return;
		else{
			int pivot = partition ( arr, start, end );

			quickSort(arr , start, pivot - 1);
			quickSort(arr , pivot + 1, end);

		}
	}


	public static int partition(int []arr, int start, int end){
	
		int pivot = arr [ end ] ;
		int i = start;
		int j = start;

		
		for ( j = start; j <= end - 1; j++ ) {


			// Changed the comparison from <= into >=
			if ( arr[ j ] >= pivot ) {
				swap ( arr, i, j );
				i++;
			}

		}

		swap ( arr, i, end );

		return i;

	}
	
	
	public static void swap(int []arr, int index_1, int index_2){
		
		int temp = arr[ index_1 ];
		arr[ index_1 ] = arr[ index_2 ];
		arr[ index_2 ] = temp;

	}
	
	public static void print(int []arr){
			
		for (int i = 0; i < arr.length ; i++) {
			if ( ( i + 1 ) == arr.length )
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + " | ");
		 }

		 System.out.println();
	}

}