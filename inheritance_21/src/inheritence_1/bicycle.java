package inheritence_1;

public class bicycle extends vehicle {
	
	int noOfWheels;
	
	//constructor
	public bicycle() {
		System.out.println("Bicycle Constructor");
	}
	
	/*this will print Vehicle constructor Bicycle Constructor
	 because its child class and it will make call to parent constructor call first
*/
	
	public void print() {
		System.out.println("Bicycle:"+" Color="+color+" Speed="+speed+" Doors="+noOfWheels+  " Brand="+getBrand());
	}

}
