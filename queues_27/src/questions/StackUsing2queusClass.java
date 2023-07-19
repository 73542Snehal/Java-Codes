package questions;
import java.util.*;
public class StackUsing2queusClass {
	
		  private Queue<Integer> q1;
		    private Queue<Integer> q2;

		    public StackUsing2queusClass() {
		        q1 = new LinkedList<>();
		        q2 = new LinkedList<>();
		    }

		    public void push(int data) {
		        q1.offer(data);
		    }

		    public int pop() {
		        if (q1.isEmpty()) {
		            return -1;
		        }

		        while (q1.size() > 1) {
		            q2.offer(q1.poll());
		        }

		        int poppedElement = q1.poll();

		        Queue<Integer> temp = q1;
		        q1 = q2;
		        q2 = temp;

		        return poppedElement;
		    }

		    public int top() {
		        if (q1.isEmpty()) {
		            return -1;
		        }

		        while (q1.size() > 1) {
		            q2.offer(q1.poll());
		        }

		        int topElement = q1.poll();
		        q2.offer(topElement);

		        Queue<Integer> temp = q1;
		        q1 = q2;
		        q2 = temp;

		        return topElement;
		    }

		    public int getSize() {
		        return q1.size();
		    }

		    public boolean isEmpty() {
		        return q1.isEmpty();
		    }
		}

