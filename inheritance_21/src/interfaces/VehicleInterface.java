package interfaces;
//click>>new>>interface>>give name>>finish
//interface are pure abstract 
//all the methods in the interface are pure abstract
//A class containing abstract methods is called an abstract class.
//Abstract methods should be implemented in the non-abstract derived class.
//An interface can extend another interface.
//A non-abstract class which is implementing an interface must implement all the methods of the interface.
//An interface is a solution for multiple inheritance in java.
 
public interface VehicleInterface {
	
	  double PI= 3.14;
	  boolean isMotorized();

	  String getCompany();
	}