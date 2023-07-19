package advancedRecursionQue;
import java.util.*;
public class printSubsequences {


		public static void printsubsequences(String input, String stringSoFar) {
			if(input.length() == 0) {
				System.out.println(stringSoFar);
				return;
			}
			String smallInput = input.substring(1);
			printsubsequences(smallInput, stringSoFar);
			printsubsequences(smallInput, stringSoFar + input.charAt(0));
		}
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter String");
			String input = s.next();
			printsubsequences(input, "");
			
		}
	
}