package searchingSorting;

import java.util.Scanner;

public class bubbleSort_4 {

	public static void bubbleSort(int[] arr){
		int n=arr.length;

		for(int i=0;i<n-1;i++){

			for(int j=0;j<n-1-i;j++){

				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}
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

		bubbleSort(arr);
		printArray(arr);
	}
}




