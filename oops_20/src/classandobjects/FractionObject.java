package classandobjects;

public class FractionObject {

	public static void main(String[] args) {
	FractionClass f1 = new FractionClass(4,6);
	FractionClass f2 = new FractionClass(4,8);
	f1.print();
	
	//f1.setDenominator(5);
	//f1.getNumerator();
	
	//f1.increment();//increment num by one
	f2.print();
	
	f1.add(f2);
	f1.print();
	
	FractionClass f3 = FractionClass.add(f1, f2);
	f3.print();
	
	}
}
