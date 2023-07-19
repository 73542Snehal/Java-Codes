package sixthCNForLoop;
/*
 * Palindrome number
Send Feedback
Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false*/
import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int og = n;
        int rev = 0;
        
        while (n != 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }
        
        if (og == rev) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

