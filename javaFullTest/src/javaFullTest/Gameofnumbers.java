package javaFullTest;
/*Game of numbers
Send Feedback
Given are two numbers X and Y. Starting from number X, we can perform two functions on the number:
Double: Multiply the number by 2, or
Decrement: Subtract 1 from the number.
Find the minimum number of operations required to convert X to Y.
Input Format:
First line contains two space separated integers X and Y.
Output Format:
Print the minimum number of operations required to get Y, starting from X.
Constraints:
1 <= X,Y <= 10^9
Sample Input 1:
2 3
Sample Output 1:
2
Explanation:
Use double operation and then decrement operation {2 -> 4 -> 3}.
Sample Input 2:
1024 1
Sample Output 2:
1023
Explanation:
Use decrement operations 1023 times.*/
import java.util.*;

public class Gameofnumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int X = scanner.nextInt();
	        int Y = scanner.nextInt();
	        
	        int operations = findMinOperations(X, Y);
	        System.out.println(operations);
	    }
	    
	    public static int findMinOperations(int X, int Y) {
	        int operations = 0;
	        
	        while (Y > X) {
	            if (Y % 2 == 0) {
	                Y /= 2;
	            } else {
	                Y++;
	            }
	            operations++;
	        }
	        
	        operations += X - Y; // Remaining decrement operations
	        
	        return operations;
	    }
	}
