package dArray;
import java.util.*;

public class b {

	public static void main(String[] args) {
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
		
	for(int i=0;i<rows;i++) {			
			for(int j=0;j<columns;j++) {				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
