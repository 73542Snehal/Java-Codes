package fourth;
/*
 Paralellogram
 ****
 ****
  ****
   **** 
  
 */
import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		   System.out.println("Enter n");

		      int n = sc.nextInt();
		      
		      int i=1;
		      while(i<=n) {
		    	  
		    	  int sp=1;
		    	  while(sp<=i-1) {
		    		  System.out.print(" ");
		    		  sp++;
		    	  }
		    	  
		    	  int j=1;
		    	  while(j<=n) {
		    		  System.out.print("*");
		    		  j++;
		    	  }
		    			  
		    	  System.out.println();
		    	  i++;
		      }
		      
//		      int i=1;
//		      while(i<=n) {
//		    	  
//		    	  int spaces = 1;
//		    	  while(spaces<=i-1) {
//		    		  System.out.print(" ");
//		    		  spaces++;
//		    	  }
//		    	  
//		    	  int j = 1;
//		    	  while(j<=n) {
//		    		  System.out.print("*");
//		    		  j++;
//		    	  }
//		    	  System.out.println();
//		    	  i++;  
//		      }
		      
		      
	}

}
