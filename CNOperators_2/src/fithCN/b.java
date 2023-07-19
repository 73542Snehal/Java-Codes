package fithCN;

public class b {

	public static void main(String[] args) {
		
		System.out.println("For OR:");
		   int a=60,b=80;
		      if(++a>60||b++>80)
		      {
		          System.out.println("Inside if");
		      }else{
		          System.out.println("Inside else");
		      }
		      System.out.println("a "+a+" b"+b);
		      
		      System.out.println("For AND:");
		      
		      int c=60,d=80;
		      if(++c>60 && d++>80)
		      {
		          System.out.println("Inside if");
		      }else{
		          System.out.println("Inside else");
		      }
		      System.out.println("c "+c+" d"+d);

	}

}
