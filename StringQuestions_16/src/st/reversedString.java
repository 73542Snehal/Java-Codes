package st;

import java.util.Scanner;

public class reversedString {
	
	public static String reversedString(String str) {
		String reversedString = "";
		/*for(int i = str.length()-1;i>=0;i--) {
			reversedString = reversedString + str.charAt(i);
		}*/
		
		for(int i=0;i<str.length();i++) {
			reversedString = str.charAt(i) +reversedString  ;
		}
		
		return reversedString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str==null)
		{
			str="";
		}
		String revstr  = reversedString(str);
		System.out.println(revstr);
	}

	

}
