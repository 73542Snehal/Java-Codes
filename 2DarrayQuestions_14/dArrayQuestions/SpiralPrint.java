package dArrayQuestions;
/*Print Spiral
Send Feedback
For a given two-dimensional integer array/list of size (N x M), 
print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
Refer to the Image:
Spiral path of a matrix

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. 
They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, 
separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 */

import java.util.*;

public class SpiralPrint {
	
	public static void spiralPrint(int[][] matrix) {
		int rows= matrix.length;
		
		if(rows==0) {
			return;
		}
		
		int col = matrix[0].length;
		
		int columnStart = 0;
		int columnEnd = col-1;
		int rowStart = 0;
		int rowEnd = rows-1;
		
		int count = 0;
		
		while(count < rows * col) {
			//first row(L to R)
			for(int i=columnStart; i<=columnEnd &&count<rows*col; i++) {
				System.out.print(matrix[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			
			//last col(top to bottom)
			for(int i=rowStart; i<=rowEnd &&count<rows*col; i++) {
				System.out.print(matrix[i][columnEnd]+" ");
				count++;
			}
			columnEnd--;
			
			//last row(R to L)
			for(int i=columnEnd; i>=columnStart &&count<rows*col; i--) {
				System.out.print(matrix[rowEnd][i]+" ");
				count++;
			}
			rowEnd--;
			
			
			//first column(bottom to top)
			for(int i=rowEnd; i>=rowStart &&count<rows*col; i--) {
				System.out.print(matrix[i][columnStart]+" ");
				count++;
			}
			columnStart++;
		}
	}

    public static void main(String args[]) {
        int  n, m;
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        m = sr.nextInt();
        int ar[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=sr.nextInt();
            }
        }
        int ans[][]= new int[n][m];
            spiralPrint(ar);
}}

