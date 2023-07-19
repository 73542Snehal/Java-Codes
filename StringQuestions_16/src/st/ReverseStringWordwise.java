package st;
/*Reverse String Wordwise
Send Feedback
Reverse the given string word wise. That is, the last word in given string should come at 1st place, 
last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always*/
import java.util.*;

public class ReverseStringWordwise {

	public static String reverseWordWise(String str) {
		String reversedString = "";
		
		for(int i=0;i<str.length();i++) {
			reversedString = str.charAt(i) +reversedString  ;
		}
		
	        String ans="";
	        int currentWordStart=0;
	        int i=0;
	        for(;i<reversedString.length();i++){
	            if(reversedString.charAt(i)==' '){
	                //Reverse Current Word
	                int currentWordEnd=i-1;
	                String reversedWord="";
	                for(int j=currentWordStart;j<=currentWordEnd;j++){
	                    reversedWord=reversedString.charAt(j)+reversedWord;
	                }
	                //Add it final String(ans)
	                ans+=reversedWord+" ";
	                currentWordStart=i+1;
	            }
	        }
	        int currentWordEnd=i-1;
	        String reversedWord="";
	        for(int j=currentWordStart;j<=currentWordEnd;j++){
	            reversedWord=reversedString.charAt(j)+reversedWord;
	        }
	        ans+=reversedWord;
	        return ans;
	    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
}

