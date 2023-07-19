package fithCN;
import java.util.Scanner;
public class practice {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();
			
			int i=n;
			while(i>=1) {
				char ch =(char)('A'+i-1);
				int j=n-i+1;
				while(j>=1) {
					
					System.out.print(ch);
					ch++;
					j--;
				}
				System.out.println();
				i--;
			}
	    		
	    		
	    		
	      
	    }
	}


