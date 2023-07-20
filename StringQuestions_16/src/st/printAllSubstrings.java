package st;
/*Enter String: 
abc
a
ab
abc
b
bc
c*/
import java.util.Scanner;

public class printAllSubstrings {

	public static void printSubstrings(String str){
		/*for(int start=0;start<str.length();start++){

			for(int end=start;end<str.length();end++){
				System.out.println(str.substring(start,end+1));
			}
		}*/
		for(int i=0;i<str.length();i++){

			for(int j=i;j<str.length();j++){
				System.out.println(str.substring(i,j+1));
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= sc.nextLine();
		printSubstrings(str);
	}
}
