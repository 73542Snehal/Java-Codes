package generics;
/*Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) 
  to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work 
  with different data types.
  An entity such as class, interface, or method that operates on a parameterized type is a generic entity.*/

/*if we want create object of type int string double in same class then instead of creating different classes
 we create generic class which is allowed to work with all data types
 Syntax: public class pair1 <T>{}
 we have to write variable in <> in this format.
 where T is able to perform with all the data types
 */
public class pair1 <T>{
	    private T first;
	    private T second;

	    public pair1(T first, T second){
	      this.first = first;
	      this.second = second;
	    }

	    public T getFirst(){
	        return first;
	    }

	    public void setFirst(T first){
	        this.first=first;
	    }

	    public T getSecond(){
	      return second;
	    }

	    public void setSecond(T second){
	      this.second= second;
	    }
	}

