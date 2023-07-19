package collections;
//we can use stack collection framework which is already in java 
//this extends vector class
import java.util.*;

public class collections {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);//insert 10
		stack.push(20);//insert 20 on top of 10
		stack.push(30);//insert 30 on top of 20
		stack.push(40);//insert40 on top of 30
		
		System.out.println("Peek: "+stack.peek());//peek the top element in stack
		
		stack.pop();//delete top most element in stack
		
		System.out.println("Size: "+stack.size());//gives size
		
		System.out.println("isEmpty : "+stack.isEmpty());//return true if stack is empty or else false
	}
	
	
	

}
