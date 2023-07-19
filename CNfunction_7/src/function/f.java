package function;
//pass by value
//in java no pass by reference is there
public class f {
	
	public static void passByValue(int n) {
		n++;
	}

	public static void main(String[] args) {
		
		int n=10;
		passByValue(n);
		System.out.println(n);
	

	}

}
