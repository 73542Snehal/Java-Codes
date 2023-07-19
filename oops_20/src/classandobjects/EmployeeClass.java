package classandobjects;
//constructors:  It is called when an instance of the class is created.
public class EmployeeClass {

	String name;
	int empId;

	//default constructor
	/*public EmployeeClass() {

	}*/
	
	//if we want to make name and id mandate
	public EmployeeClass(String name,int empId) {
		this.name = name;
		this.empId = empId;
	}
	
	//if we want to make name mandate
	public EmployeeClass(String name) {
		this.name = name;
	}
	
	//if we want to set some default values
	public EmployeeClass() {
		this.name = "Name";
		this.empId = 5;
	}
	

}
