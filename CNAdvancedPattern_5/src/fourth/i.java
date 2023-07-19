package fourth;
/*
 * Half Diamond
 Enter n
5
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
 */
import java.util.Scanner;
public class i {

	public static void main(String[] args) {
		   java.util.Scanner sc =new Scanner(System.in);
		   System.out.println("Enter n");

		      int n = sc.nextInt();

		      System.out.println("*");
		        int i =1;
		        while(i<=n){
		               System.out.print("*");
		               int j=1;
		               while(j<=i){
		                      System.out.print(j);
		                      j++;
		               }
		               j=j-2;
		               while(j>=1){
		                      System.out.print(j);
		                      j--;
		               }
		                  System.out.print("*");
		                     System.out.println();
		                     i++;
		        }

		        i=1;
		        while(i<=n-1){
		               System.out.print("*");
		               int j =1;
		               while(j<=n-i){
		                      System.out.print(j);
		                      j++;
		               }
		               j=j-2;
		                while(j>=1){
		                      System.out.print(j);
		                      j--;
		               }
		                  System.out.print("*");
		                     System.out.println();
		                     i++;

		        }

		         System.out.println("*");
		        
		    }
	}


