package sixthCNForLoop;

import java.util.Scanner;

/*Terms of AP
Send Feedback
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17*/
public class g {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       
        
        int j,n=1,sum,i=1;
		
		j=sc.nextInt();
		while(n<=j && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		
			

	}

	}

}
