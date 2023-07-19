package classandobjects;

public class FractionClass {


	private int numerator;
	private int denominator;

	//constructor
	public FractionClass(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();//function to divide fraction 4/6=2/3
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
		simplify();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int denominator) {
		if(denominator==0) {
			denominator = 1;
		}
		this.denominator = denominator;
		simplify();
	}

	public int getDenominator() {
		return denominator;
	}
	//print function
	public void print() {
		System.out.println(numerator+"/"+denominator);
	}

	private void simplify(){
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2; i<=smaller;i++) {
			if(numerator %i ==0 && denominator %i ==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}


	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	public void add(FractionClass f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator  * f2.denominator;
		simplify();
	}
	
	public static FractionClass add(FractionClass f1,FractionClass f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDen =  f1.denominator  * f2.denominator;
		FractionClass f3 = new FractionClass(newNum,newDen);
		return f3;
	}


}