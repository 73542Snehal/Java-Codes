package stackUsingArray;

public class stackClass {
	 private int data[];
	    private int topIndex;  //Index of the top most element of the stack

	    public stackClass(){
	        data= new int[10];
	        topIndex=-1;
	    }

	    public int size(){
	        return topIndex+1;

	    }

	    public boolean isEmpty(){

	          //if(topIndex==-1) return true;
	          //else return false;
	          return topIndex == -1;
	    }
	    
	    
	    //time complexity of all the function is O(1)
	    public void push(int elem) throws StackFullException{
	          //If stack is full
	          if(topIndex==data.length-1){
	              StackFullException e= new StackFullException();
	              throw e;
	              //Throw Exception
	          }
	          topIndex++;
	          data[topIndex]= elem;

	    }
	    /*if we dont want to throw exception we can double the 
	      capacity of array to increase its size whenever its full
	      
	         public void push(int elem) {
  
          if(topIndex==data.length-1){
          doubleCapacity();
          }
          topIndex++;
          data[topIndex]= elem;
    }
    
    private void doubleCapacity(){
    //  System.out.println("doubleCapacity");
        int temp[]= data;
        data= new int [2 * temp.length];
        for(int i=1;i<temp.length;i++){
            data[i]= temp[i];
        }

    }
	     * */

	    public int top() throws StackEmptyException{
	      if(topIndex==-1){
	        //Throw stack empty exception
	        throw new StackEmptyException();
	      }
	        return data[topIndex];

	    }

	    public int pop() throws StackEmptyException{

	        if(topIndex==-1){
	            throw new StackEmptyException();
	        }
	        int temp = data[topIndex];
	        topIndex--;
	        return temp;
	    }

}