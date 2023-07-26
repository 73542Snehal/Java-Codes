package Questions;
/*Minimum Number of Chocolates
Send Feedback
Miss. Noor Rashid is a teacher. She wants to give some chocolates to the students in her class. All the students sit in a line, and each of them has a score according to performance. Noor wants to give at least one chocolate to each student. She distributes chocolates to them such that If two students sit next to each other, then the one with the higher score must get more chocolates. Miss. Noor wants to save money, so she wants to minimize the total number of chocolates.
Note :
When two students have an equal score, they are allowed to have a different number of chocolates. 
Input Format:
The first line of the input contains an integer value of N. It denotes the total number of students in Noor's class.

The second line of the input contains N integer values denoting the score of each of the students. A single space will separate them.
Output Format:
Print the minimum number of chocolates Noor must give.
Constraints
1 <= N <= 10^5
1 <= score <= 10^5

Time Limit: 1 sec
Sample Input 1 :
4
1 4 4 6
Sample Output 1 :
6
Explanation:
One of the ways in which the chocolates can be distributed, such Noor has to give minimum number of chocolates, are: The first student can be given one chocolate, second student can be given two chocolates, third student can be one chocolate and fourth can be given two chocolates.  
Sample Input 2 :
3
8 7 5
Sample Output 2 :
6*/
public class MinimumNumberofChocolates {

	public static int getMin(int scores[], int N){
        
		 int n = scores.length;
		        int[] chocolates = new int[n];

		        // Every student should get at least one chocolate
		        for (int i = 0; i < n; i++) {
		            chocolates[i] = 1;
		        }

		        // Left to right pass - assign more chocolates to students with higher score than left neighbor
		        for (int i = 1; i < n; i++) {
		            if (scores[i] > scores[i - 1]) {
		                chocolates[i] = chocolates[i - 1] + 1;
		            }
		        }

		        // Right to left pass - assign more chocolates to students with higher score than right neighbor
		        for (int i = n - 2; i >= 0; i--) {
		            if (scores[i] > scores[i + 1]) {
		                chocolates[i] = Math.max(chocolates[i], chocolates[i + 1] + 1);
		            }
		        }

		        // Calculate the total number of chocolates
		        int totalChocolates = 0;
		        for (int i = 0; i < n; i++) {
		            totalChocolates += chocolates[i];
		        }

		        return totalChocolates;
		    }
}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {


        int[] arr = takeInput();
        System.out.print(Solution.getMin(arr,arr.length));


    }
}*/
