package searchingSorting;

import java.util.Scanner; 

public class linearSearch_1 {
	
	

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static int linearSearch(int[] arr, int key){    
		for(int i=0;i<arr.length;i++){    
			if(arr[i] == key){  

				return i;    
			}    
		}    
		return -1;    
	}    
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();


		System.out.println("Enter key to search:"); 
		int key = sc.nextInt();    
		int index =linearSearch(arr,key);

		System.out.println(key+" is found at index: "+index );    
	}    
} 
