package inheritence_1;

public  class vehicle {

	public String color;
	int speed;
	private String brand;
	protected String type;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void print() {
		System.out.println("Vehicle:"+" Color="+color+" Speed="+speed+" Brand="+brand);
	}
	
	//constructor
	public vehicle() {
		System.out.println("Vehicle constructor");
	}
	
	//public abstract String brandname();//abstract keyword is used for when some method body is incomplete
	//public abstract class vehicle //if we are making one method abstract make that class as a abstract
	//and in derived class also either make it as abstract or complete the method body in that class
}
