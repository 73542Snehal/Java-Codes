package stackUsingArray;

public class stackObject {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		stackClass stack = new stackClass();
		
	        int arr[]={5,6,7,1,9};
	        for(int i=0;i<arr.length; i++){
	            stack.push(arr[i]);
	        }
	        while(!stack.isEmpty()){
	          System.out.println(stack.pop());
	        }

	        
	        //stack operations
	        System.out.println("**Stack Operations**");
	        stack.push(10);
	        System.out.println(stack.top());
	        stack.pop();
	        stack.size();
	        System.out.println(stack.isEmpty());
	        stack.isEmpty();
	}
}
