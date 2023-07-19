package recursionQue;
/*Print 2D Array
Send Feedback
Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
Input format :
Line 1 : No of rows (n) and no of columns (m) (separated by single space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on
Sample Input 1:
3 3
1 2 3
4 5 6
7 8 9
Sample Output 1 :
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9*/

import java.util.*;

public class Print2DArray {

	public static void print2DArray(int arr[][]) {
		int n = arr.length;
        for (int i = 0; i < n; i++) {
            int repetitions = n - i;
            for (int j = 0; j < repetitions; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    System.out.print(arr[i][k] + " ");
                }
                System.out.println();
            }
        }
    }



	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		print2DArray(input);
	}
}

