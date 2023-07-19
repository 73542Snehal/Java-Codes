package classandobjects;

public class EmployeeObject {

	public static void main(String[] args) {
		
		//based on this constructor will be called
		EmployeeClass e1 = new EmployeeClass();
		EmployeeClass e2 = new EmployeeClass("Pinks",2);
		EmployeeClass e3 = new EmployeeClass("Pink");
		EmployeeClass e4 = new EmployeeClass();
		
		e1.name = "Snehal";
		e1.empId = 1;
		
		System.out.println(e1.name+" "+e1.empId);
		System.out.println(e2.name+" "+e2.empId);
		System.out.println(e3.name+" "+e3.empId);
		System.out.println(e4.name+" "+e4.empId);
	}

}
