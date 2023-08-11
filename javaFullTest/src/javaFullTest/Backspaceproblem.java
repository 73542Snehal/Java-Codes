package javaFullTest;
/*Backspace problem
Send Feedback
Given a string consisting of lower case characters and hashes(#) where each hash represents a back space .
Find the resultant string after removing the backspaces from the given input string.
(Note : there will be no condition where we use backspace on empty string )
Example :
Input: xy#z
Output: xz*/
import java.util.*;

public class Backspaceproblem {
	  public static String backspace(String s){
		  Stack<Character> stack = new Stack<>();

		        for (char c : s.toCharArray()) {
		            if (c != '#') {
		                stack.push(c);
		            } else if (!stack.isEmpty()) {
		                stack.pop();
		            }
		        }

		        StringBuilder result = new StringBuilder();
		        while (!stack.isEmpty()) {
		            result.insert(0, stack.pop());
		        }

		        return result.toString();
		    }
		public static void main (String[] args) {
	        Scanner s=new Scanner(System.in);
	        String n=s.next();
	        String x=backspace(n);
	        System.out.print(x);
	    }

}
