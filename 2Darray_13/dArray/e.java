package dArray;

public class e {

	public static void main(String[] args) {
	
		int arr1[][] = new int[5][4];//allowed
		
		//int arr2[][] = new int[][];//not allowed
		
		int arr3[][] = new int[4][];//allowed
		
		//int arr4[][] = new int[][5];//not allowed

		
		   int arr[][]=new int [4][];
		    System.out.print(arr[2].length);//NullPointerException
	}

}
