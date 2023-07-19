package fourth;
/*
 * sum pattern
 1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15 
  */
import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		   System.out.println("Enter n");

		      int n = sc.nextInt();
		      int s = 0;
		      int i=1;{
		    	  while(i<=n) {
		    		  s =s+i;
		    		  int j=1;
		    		  while(j<=i) {
		    			  System.out.print(j);
		    			  if(j==i) {
		    				  System.out.print("=");
		    			  }else {
		    				  System.out.print("+");
		    			  }
		    			  j++;
		    		  }
		    		  System.out.println(s);
		    		  i++;
		    	  }
		      }

	}

}
