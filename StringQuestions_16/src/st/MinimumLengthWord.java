package st;
/*Minimum Length Word
Send Feedback
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a*/

import java.util.*;

public class MinimumLengthWord {
	public static String minLengthWord(String S){
		
		 String[] words = S.split(" ");
	    String minWord = words[0];

	    for (int i = 0; i < words.length; i++) {
	        if (words[i].length() < minWord.length()) {
	            minWord = words[i];
	        }
	    }

	    return minWord;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
	}
}
