package questions_2;
/*Connecting Dots
Send Feedback
Gary has a board of size NxM. Each cell in the board is a coloured dot. There exist only 26 colours denoted by uppercase Latin characters (i.e. A,B,...,Z). Now Gary is getting bored and wants to play a game. The key of this game is to find a cycle that contain dots of same colour. Formally, we call a sequence of dots d1, d2, ..., dk a cycle if and only if it meets the following condition:
1. These k dots are different: if i ≠ j then di is different from dj.
2. k is at least 4.
3. All dots belong to the same colour.
4. For all 1 ≤ i ≤ k - 1: di and di + 1 are adjacent. Also, dk and d1 should also be adjacent. Cells x and y are called adjacent if they share an edge.
Since Gary is colour blind, he wants your help. Your task is to determine if there exists a cycle on the board.
Input Format :
The first line of input contains two space separated integers N and M, where N is number of rows and M is the number of columns of the board. 
Each of the following N lines contain M characters. Please note that characters are not space separated. Each character is an uppercase Latin letter.
Output Format :
For C++: Print true if there is a cycle in the board, else print false.
For Java: Print 1 if there is a cycle in the board, else print 0.
Constraints :
2 <= N <= 1000
2 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
3 4
AAAA
ABCA
AAAA
Sample Output 1:
true*/
public class ConnectingDots {

	    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	    public static int solve(String[] board, int N, int M) {
	        boolean[][] visited = new boolean[N][M];

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                if (!visited[i][j]) {
	                    char color = board[i].charAt(j);
	                    if (dfs(board, i, j, i, j, visited, color, 0)) {
	                        return 1;
	                    }
	                }
	            }
	        }

	        return 0;
	    }

	    public static boolean dfs(String[] board, int si, int sj, int ei, int ej, boolean[][] visited, char color, int len) {
	        if (len >= 4 && si == ei && sj == ej) {
	            return true;
	        }

	        if (ei < 0 || ei >= board.length || ej < 0 || ej >= board[ei].length() || visited[ei][ej] || board[ei].charAt(ej) != color) {
	            return false;
	        }

	        visited[ei][ej] = true;

	        for (int[] d : dir) {
	            int newRow = ei + d[0];
	            int newCol = ej + d[1];
	            if (dfs(board, si, sj, newRow, newCol, visited, color, len + 1)) {
	                return true;
	            }
	        }

	        visited[ei][ej] = false;

	        return false;
	    }
	}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
		String[] strNums;
        strNums = br.readLine().split("\\s");

        int N = Integer.parseInt(strNums[0]);
        int M = Integer.parseInt(strNums[1]);

		String[] Graph = new String[N];
		
        for (int i = 0; i < N; ++i) {
            Graph[i] = br.readLine();
        }

        return Graph;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String[] Graph = takeInput();
        if (new Solution().solve(Graph,Graph.length,Graph[0].length())==1){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }


    }
}*/
