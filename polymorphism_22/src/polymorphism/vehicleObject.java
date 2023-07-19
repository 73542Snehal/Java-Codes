package polymorphism;

public class vehicleObject {

	public static void main(String[] args) {
		vehicle v = new vehicle();
		
		v.id=1;
		v.name="kl";
		v.print();
		
		car c = new car();
		c.id=2;
		c.name="pk";
		c.speed=100;
		c.print();
		
		vehicle v1 = new car();//ok beacuse every car is a vehicle
		//car c1 = new vehicle();//not ok
		
		v1.id=3;
		v1.name="oi";
		//v1.speed = 10; // this is will give compile time error because the refrence is of vehicle type
		v1.print();//this will print car print function beacuse this call is making at runtime 
				//and this is called run time polymorphism
		
		vehicle v2 = new car();
		//Car c = v2;//will throw error but if want to use it we can implicitly type csat it
		car c2 = (car)v2;
		c2.speed = 500;//now we can access car variable too
	}
	
	
}
