package classandobjects;

public class Studentobject {

	public static void main(String args[]) {
	Studentclass s1 = new Studentclass();
	Studentclass s2 = new Studentclass();
	
	//another way
	Studentclass s3;
	s3 = new Studentclass();
	
	s1.name= "Snehal";
	s1.rollNo = 10;
	//s1.course="IT";//course is not accessible because its private
	
	s1.setCourseName("IT");//use setter to access private variable
	
	s2.name= "Sneh";
	s2.rollNo = 1;
	
	s2.setCourseName("CS");
	
	System.out.println(s1.name + " "+ s1.rollNo+" "+s1.getCourseName());
	System.out.println(s2.name + " "+ s2.rollNo);
	System.out.println(s2.getCourseName());//use getter to get private variable
	
	System.out.println(Studentclass.totalStudents);//accessing static variable
	

}
}