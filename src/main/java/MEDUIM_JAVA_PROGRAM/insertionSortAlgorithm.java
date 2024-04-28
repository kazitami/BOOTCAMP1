package MEDUIM_JAVA_PROGRAM;

public class insertionSortAlgorithm {

	public static void main(String[] args) {
		int arr[] = {23,45,67,21,90,78};
		int lengthOfArray = arr.length;
		System.out.println("Unsorted array: " );
		for(int i=0;i<lengthOfArray;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for(int i=1;i<lengthOfArray;i++) {
			int presentNumber = arr[i];
			int previousNumber = i -1;
			
			while(previousNumber>=0 && arr[previousNumber] > presentNumber) {
				arr[previousNumber+1] = arr[previousNumber];
				previousNumber = previousNumber - 1;
			}
			arr[previousNumber+1] = presentNumber;
		}
		System.out.println();
		System.out.println("Sorted array : "  );
		for(int i=0;i<lengthOfArray;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
