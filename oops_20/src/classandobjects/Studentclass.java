package classandobjects;

public class Studentclass {

	String name;//default : accessible within same package
	 int rollNo;
	private String course;//accessible only within the class
	public String Schoolname;//accessible everywhere in different package also
	final double pi = 3.14;//we cannot change its value anywhere
	static int totalStudents;//static belong to class and shared by all objects
	
	//getter setter to access private variable outside the class
	
/*	
  this keyword is a reference variable that refers to the current object
  
   public String getCourseName() {
	return course;
}

public void setCourseName(String course) {
	course = courseName;
}
	in this the output in set and get value is coming zero because it refers to the same variable 
	if we want to use same name use this keyword or else you can give diff name also
	
	  public String getCourseName() {
	return course;
}

public void setCourseName(String course) {
	course = course;
}
*
*/
	
	public String getCourseName() {
		return course;
	}
	
	public void setCourseName(String courseName) {
		course = courseName;
	}
	



}
