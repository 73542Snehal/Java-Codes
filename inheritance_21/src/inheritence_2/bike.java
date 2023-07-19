package inheritence_2;

import inheritence_1.vehicle;

public class bike extends vehicle {

	
	public void print() {
		System.out.println("Vehicle:"+" Color="+color+" Type" + type);
		//type is protected hence it is accessible in derived class
	}
}
