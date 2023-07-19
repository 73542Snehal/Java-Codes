package searchingSorting;
import java.util.*;
public class binarySearch_2 {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	   public static int binarySearch(int []arr, int target) {
	        int start=0;
	        int end = arr.length-1;

	        while(start<=end){
	            int mid =(start+end)/2;

	            if(arr[mid] < target){
	                start =mid+1;
	            }else if(arr[mid] > target){
	                end = mid-1;
	            }else{
	                return mid;
	            }

	        }
	        return -1;
	    }
	   
		public static void main(String args[]){ 
			Scanner sc = new Scanner(System.in);
			int arr[] = takeInput();


			System.out.println("Enter key to search:"); 
			int key = sc.nextInt();    
			int index  =binarySearch(arr,key);

			System.out.println(key+" is found at index: "+index );    
		}    
	} 


	