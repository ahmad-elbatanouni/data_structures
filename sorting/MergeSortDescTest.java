public class MergeSortDescTest {

	// Difference from the Ascending Code --> line 86

	public static void main(String[] args) {

		int [] arr = { 12, 9, 8, 7, 13, 6, 2, 1 };
	
		System.out.println();
		System.out.println("Unsorted Array: ");

		print( arr ); 


		mergeSort( arr, 0, arr.length - 1 );

		System.out.println();
		System.out.println("Array After applying Merge Sort:");	
	
		print( arr );

		System.out.println();

	}


	public static void mergeSort(int [] arr, int start, int end){
		if(start == end)
		return;
		else{
			int mid = ( start + end ) / 2;
			mergeSort(arr , start, mid);
			mergeSort(arr , mid + 1, end);

			split_Merge(arr, start, mid ,end);
		}
	}


	////////////////////////////////////////////////////////////
	// splits the given array into 2 parts and then merges them
	////////////////////////////////////////////////////////////

	public static void split_Merge(int []arr,int start,int mid ,int end){
	
		int length_1 = mid - start + 1;
		int length_2 = end - mid;
		
		int [] r1 = new int [ length_1 ];
		int [] r2 = new int [ length_2 ];
		
		for(int i = 0; i < r1.length; i++) {
			r1[i] = arr[ start + i ];
		}
		
		for(int i = 0; i < r2.length; i++) {
			r2[i] = arr[ mid + 1 + i ];
		}
		
		
		MergeStep(r1, r2, arr, start, end);

		// System.out.println("left: ");
		// print(r1);
		// System.out.println("right: ");
		// print(r2);
		// System.out.println("after merging: ");
		// print(arr);
		// System.out.println("-------------------");

	}
	
	
	public static void MergeStep(int []r1, int []r2, int []result, int start, int end){
		int left = 0;
		int right = 0;
		int i;
		 
		for(i = start; i <= end; i++){

			// check if "left" or "right" is out of bounds of the array
			if((left == r1.length)||(right == r2.length))
				break;


			// Changed from <= into >=
			if(r1[left] >= r2[right]){

				result[i] = r1[left];
				left++;

			} else{

				result[i] = r2[right];
				right++;

			}


		}

		// copy the "leftovers" from the FIRST array
		while (left<r1.length)
			result[ i++ ] = r1[ left++ ];

		// copy the "leftovers" from the SECOND array
		while (right<r2.length)
			result[ i++ ] = r2[ right++ ];

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