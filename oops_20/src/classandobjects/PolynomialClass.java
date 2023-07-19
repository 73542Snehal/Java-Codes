package classandobjects;
import java.util.*;

public class PolynomialClass {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int degree1[] = new int[n];
			for(int i = 0; i < n; i++){
				degree1[i] = s.nextInt();
			}
			int coeff1[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff1[i] = s.nextInt();
			}
			PolynomialClass first = new PolynomialClass();
			for(int i = 0; i < n; i++){
				first.setCoefficient(degree1[i],coeff1[i]);
			}
			n = s.nextInt();
			int degree2[] = new int[n];
			for(int i = 0; i < n; i++){
				degree2[i] = s.nextInt();
			}
			 int coeff2[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff2[i] = s.nextInt();
			}
			PolynomialClass second = new PolynomialClass();
			for(int i = 0; i < n; i++){
				second.setCoefficient(degree2[i],coeff2[i]);
			}
			int choice = s.nextInt();
			PolynomialClass result;
			switch(choice){
			// Add
			case 1: 
				 result = first.add(second);
				result.print();
				break;
			// Subtract	
			case 2 :
				 result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3 :
				 result = first.multiply(second);
				result.print();
				break;
			}

		}

	private PolynomialClass multiply(PolynomialClass second) {
		// TODO Auto-generated method stub
		return null;
	}

	private PolynomialClass subtract(PolynomialClass second) {
		// TODO Auto-generated method stub
		return null;
	}

	private void print() {
		// TODO Auto-generated method stub
		
	}

	private PolynomialClass add(PolynomialClass second) {
		// TODO Auto-generated method stub
		return null;
	}

	private void setCoefficient(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	  
}
