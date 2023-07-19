package inheritence_1;

//we use extends keyword for inheritance
	public class car extends vehicle{
		
		int noOfDoors;
		
		public void print() {
			super.print();//if we want to print vehicle print function here
			//super keyword is used for accessing properties of parent class
			System.out.println("Car:"+" Color="+color+" Speed="+speed+" Doors="+noOfDoors+  " Brand="+getBrand());
		}
	}
	

