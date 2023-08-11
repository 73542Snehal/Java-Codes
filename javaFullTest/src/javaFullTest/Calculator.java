package javaFullTest;
/*Calculator
Send Feedback
Given a String s, consisting of non negative integers and +,- operators as well as brackets ( and ).
Your task is to solve the given string and print the output.
Input Format:
First and only line contains the string s.
Output Format:
Print the result of the given string.
Constraints:
1 <= String length <= 20000
Sample Input 1:
(1+2)
Sample Output 1:
3
Sample Input 2:
(1+(4+5+2)-3)+(6+8)
Sample Output 2:
23*/

import java.util.*;

public class Calculator {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String s = scanner.nextLine();
	        int result = evaluateExpression(s);
	        System.out.println(result);
	    }

	    public static int evaluateExpression(String expression) {
	        Stack<Integer> numStack = new Stack<>();
	        Stack<Character> opStack = new Stack<>();
	        
	        for (int i = 0; i < expression.length(); i++) {
	            char c = expression.charAt(i);
	            
	            if (Character.isDigit(c)) {
	                StringBuilder num = new StringBuilder();
	                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
	                    num.append(expression.charAt(i));
	                    i++;
	                }
	                i--;
	                numStack.push(Integer.parseInt(num.toString()));
	            } else if (c == '(') {
	                opStack.push(c);
	            } else if (c == ')') {
	                while (!opStack.isEmpty() && opStack.peek() != '(') {
	                    int b = numStack.pop();
	                    int a = numStack.pop();
	                    char op = opStack.pop();
	                    int result = performOperation(a, b, op);
	                    numStack.push(result);
	                }
	                opStack.pop(); // Pop '('
	            } else if (c == '+' || c == '-') {
	                while (!opStack.isEmpty() && opStack.peek() != '(') {
	                    int b = numStack.pop();
	                    int a = numStack.pop();
	                    char op = opStack.pop();
	                    int result = performOperation(a, b, op);
	                    numStack.push(result);
	                }
	                opStack.push(c);
	            }
	        }
	        
	        while (!opStack.isEmpty()) {
	            int b = numStack.pop();
	            int a = numStack.pop();
	            char op = opStack.pop();
	            int result = performOperation(a, b, op);
	            numStack.push(result);
	        }
	        
	        return numStack.pop();
	    }

	    public static int performOperation(int a, int b, char operator) {
	        if (operator == '+') {
	            return a + b;
	        } else if (operator == '-') {
	            return a - b;
	        }
	        return 0;
	    }
	}

