package searchingSorting;

import java.util.*;

public class selectionSort_3{

public static void selectionSort(int[] arr){
	int n=arr.length;
	for(int i=0;i<n-1;i++){
		//Insert element at ith position
		int min=Integer.MAX_VALUE;
		int minIndex=-1;
		for(int j=i;j<n;j++){
			//Finding the minimum element among j positions
			if(arr[j]<min){
				min=arr[j];
				minIndex=j;
			}
		}
		//Swap element at minIndex with the ith element
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
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

	selectionSort(arr);
	printArray(arr);
}
}

