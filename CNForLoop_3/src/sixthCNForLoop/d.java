package sixthCNForLoop;
//break and continue keyword
public class d {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		if(i==4) {
			
			continue;//will skip the current iteration
			//break;//breaks you out the current loop
			//System.out.print("break statement reached");//the statement after break is never executed hence it gives an error.
			//return;//exit from main
		}
		System.out.println(i);
	}

	}

}
