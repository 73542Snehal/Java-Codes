package dArray;
//function

import java.util.Scanner;

public class d {

	public static int[][] takeInput(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		for(int i=0;i<rows;i++) {			
			for(int j=0;j<columns;j++) {				
				System.out.println("Enter element at "+i+" row"+j+" columns");				
				arr[i][j]=sc.nextInt();

			}

		}
		return arr;
	}
	
	public static void print2dArray(int[][] arr) {
		int rows = arr.length;
		int columns = arr[0].length;
		for(int i=0;i<rows;i++) {			
			for(int j=0;j<columns;j++) {				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = takeInput();
		print2dArray(arr);
	}

}
