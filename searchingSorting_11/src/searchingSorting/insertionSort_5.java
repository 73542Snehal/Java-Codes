package searchingSorting;

import java.util.Scanner;

public class insertionSort_5 {
	public static void insertionSort(int[] arr) {
		int n=arr.length;

		for(int i=1;i<n;i++){
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j] > temp){

				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp; 
		}

	}
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]) {
		int arr[] = takeInput();

		insertionSort(arr);
		printArray(arr);
	}
}





