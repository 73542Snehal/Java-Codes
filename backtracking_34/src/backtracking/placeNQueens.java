package backtracking;
import java.util.*;
/*
Code: N Queens
Send Feedback
You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
Input Format :
Line 1 : Integer N
Output Format :
One Line for every board configuration. 
Every line will have N*N board elements printed row wise and are separated by space
Note : Don't print anything if there isn't any valid configuration.
Constraints :
1<=N<=10
Sample Input 1:
4
Sample Output 1 :
0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 */

public class placeNQueens {

	public static void placeNQueens(int n){

		int[][] board = new int[n][n];
		solveNQueens(board, 0, n);
	}

	public static void solveNQueens(int[][] board, int col, int n) {
		if (col == n) {
			printBoard(board);
			return;
		}

		for (int row = 0; row < n; row++) {
			if (isSafe(board, row, col, n)) {
				board[row][col] = 1;
				solveNQueens(board, col + 1, n);
				board[row][col] = 0;
			}
		}
	}

	public static boolean isSafe(int[][] board, int row, int col, int n) {
		// Check if there is a queen in the same row
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		// Check upper diagonal on the left side
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		// Check lower diagonal on the left side
		for (int i = row, j = col; i < n && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	public static void printBoard(int[][] board) {
		int n = board.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueens(n);	
	}

}
