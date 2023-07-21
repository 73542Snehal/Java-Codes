package searchingSorting;

public class heapSort_8 {
	
	public static void downHeapify(int arr[], int i, int n) {
		
		int parentIndex = i;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		while(leftChildIndex < n) {
			
			int minIndex = parentIndex;
			
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}
			
			if(minIndex == parentIndex) {
				return;
			}
			
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			
			parentIndex = minIndex;
		    leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
		}
	}
	
	 public static void heapSort(int[] arr) {
		 //build heap
		 int n = arr.length;
		 
		 for(int i=(n/2)-1; i>=0; i--) {
			 downHeapify(arr,i,n);
		 }
		 
		 //remove elements from starting one by one and put them at respective last position
		 
		 for(int i=n-1; i>=0; i--) {
			 int temp = arr[i];
			 arr[i] = arr[0];
			 arr[0] = temp;
			 downHeapify(arr,0,i);
		 }
	 }

	public static void main(String[] args) {
		 int[] arr = {4,7,6,5,3,1,2};
		 
		 heapSort(arr);
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
