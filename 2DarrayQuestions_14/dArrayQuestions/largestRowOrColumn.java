package dArrayQuestions;

import java.util.Scanner;

/*Largest Row or Column
Send Feedback
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
Constraints :
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 2
6 9 
8 5 
9 2 
Sample Output 1:
column 0 23
Sample Input 2:
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
Sample Output 2:
column 0 31*/
public class largestRowOrColumn {
	
	public static int[][] takeInput(){
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int rows=s.nextInt();
	    System.out.println("Enter number of cols");
	    int col=s.nextInt();
	    int[][] arr=new int[rows][col];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<col;j++){
	           // System.out.println("Enter the element at "+ i+ " row "+j+"column");
	            arr[i][j]=s.nextInt();
	        }
	    }
	    return arr;
	}
	
	public static void findLargest(int[][] mat) {
		
		boolean isRow = true;
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		
		int rows=mat.length;
		
		if(rows==0) {
			System.out.println("row " +index+" "+maxSum);
			return;
		}
		
		int col = mat[0].length;
		
		for(int i=0; i<rows;i++) {
			int rowSum = 0;
			for(int j=0;j<col;j++) {
				rowSum += mat[i][j];
			}
			if(rowSum > maxSum) {
				maxSum = rowSum;
				index = i;
			}
		}
		
		for(int j=0;j<col;j++) {
			int colSum = 0;
			for(int i=0; i<rows;i++) {
				colSum += mat[i][j];
			}
			if(colSum > maxSum) {
				maxSum = colSum;
				index = j;
				isRow = false;
			}
			
			
		}
		if(isRow) {
			System.out.println("row " +index+" "+maxSum);
		}else {
			System.out.println("column " +index+" "+maxSum);
		}
		
		
		
	}

	public static void main(String[] args) {
		 int [][]arr=takeInput();
		 findLargest(arr);
	      

	}

}
