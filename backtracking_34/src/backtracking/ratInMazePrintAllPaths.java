package backtracking;
/*Code:Print one path*/
import java.util.*;

public class ratInMazePrintAllPaths {

	public static void ratInMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		PrintAllPaths(maze,0,0,path);
	}

	public static void PrintAllPaths(int maze[][],int i, int j, int path[][]) {
		//check if i and j cell is valid or not
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}

		//include the cell in current path
		path[i][j] = 1;

		//destination cell
		if(i == n-1 && j == n-1) {
			for(int r = 0;r<n;r++){
				for(int c=0;c<n;c++) {
				System.out.print(path[r][c] + " ");
				}
				System.out.println();
				}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		//explore further in all direction
		//top
		PrintAllPaths(maze, i-1, j, path);
		

		//right
		PrintAllPaths(maze, i, j+1, path);

		//down
		PrintAllPaths(maze, i+1, j, path);
		

		//left
		PrintAllPaths(maze, i, j-1, path);
		path[i][j] = 0;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		ratInMaze(maze);	
	}

	/*public static void main(String[] args) {
		int maze1[][] = {{1,1,0},{1,1,0},{1,1,1}};
		int maze2[][] = {{1,1,0},{1,0,0},{0,1,1}};
		boolean pathPossible = ratInMaze(maze1);
		boolean pathPossible2 = ratInMaze(maze2);
		System.out.println("maze1= " +pathPossible);
		System.out.println("maze2= " +pathPossible2);

	}*/
}
