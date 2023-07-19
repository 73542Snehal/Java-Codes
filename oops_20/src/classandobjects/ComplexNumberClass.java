package classandobjects;

public class ComplexNumberClass {

	
	int real;
	int img;
	
	public ComplexNumberClass(int real,int img){
		this.real = real;
		this.img=img;		
	}

	public void print() {
		System.out.println(real +" + "+ "i"+ img);
	}
	
	public void plus(ComplexNumberClass c2) {
		this.real = this.real + c2.real;
		this.img = this.img  + c2.img;
		
	}
	
	public void multiply(ComplexNumberClass c2) {
		
		
		int realPart = this.real * c2.real - this.img * c2.img;
	    int imaginaryPart = this.real * c2.img + this.img * c2.real;
	    this.real = realPart;
	    this.img = imaginaryPart;
		
	}
}
