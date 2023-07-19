package sixthCNForLoop;
/*Check AP
Send Feedback
Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false*/
import java.util.Scanner;
public class n {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n==0) {
				System.out.print("false");
				return;
			}
			int b = 0;
			int p = sc.nextInt();
			int i = 1;
			boolean isDec = true;
			int a = 0;
			if(n<=0||n==1) {
				a=1;
			}
			while(i<n) {
				int c = sc.nextInt();
				if(p == c) {
					a=1;
				}else if(p>c) {
					if(isDec) {
						p = c;
					}else if(b==1){
					
						a = 1;
					}else {
						a=1;
					}
				}else if(p<c) {
					isDec = false;
					p= c;
					b=1;
				}
				i++;
			}
			if(a==0) {
				System.out.print("true");
			}else {
				System.out.print("false");
			}

		}
	}


