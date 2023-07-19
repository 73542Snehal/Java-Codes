package st;

import java.util.Scanner;

public class palindrome {
	public static void reversedString(String str) {
		
		String reversedString = "";
		for(int i = str.length()-1;i>=0;i--) {
			reversedString = reversedString + str.charAt(i);
		}
		if( str.equals(reversedString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}
		
	}
	
	/*boolean code
		public static boolean isPalindrome(String str) {
	
		String reversedString = "";
		for(int i = str.length()-1;i>=0;i--) {
			reversedString = reversedString + str.charAt(i);
		}
		if( str.equals(reversedString)) {
			return true;
		}else{
			return false;
		}
		
	}
	*/
	
	/* another method
	  public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if( str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			++left;
			--right;
		}
		return true;
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		if(str==null)
		{
			str="";
		}
		reversedString(str);
		
		
	}

}
