package inheritence_1;

public class vehicleObject {
	
	public static void main(String[] args) {
	
	vehicle v1 = new vehicle();
	v1.color = "Black";
	v1.speed = 100;
	v1.setBrand("Audi");
	v1.print();
	
	car c1 = new car();
	c1.color = "blue";
	c1.speed = 500;
	c1.noOfDoors = 4;
	c1.setBrand("Merc");
	c1.print();//car and vehicle both have same print function but since 
	//the object created is of car so the car print function will be call this is called function overloading 
	
	bicycle b1 = new bicycle();
	b1.color = "pink";
	b1.speed = 200;
	b1.noOfWheels = 2;
	b1.setBrand("njx");
	b1.print();
	
	
	
	}

}
