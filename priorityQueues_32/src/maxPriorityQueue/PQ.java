package maxPriorityQueue;
import java.util.*;

public class PQ {
	 private ArrayList<Integer> heap;

	    public PQ() {
	        heap = new ArrayList<>();
	    }

	    public int getSize() {
	        return heap.size();
	    }

	    public boolean isEmpty() {
	        return heap.isEmpty();
	    }

	    public void insert(int element) {
	        heap.add(element);
	        int childIndex = heap.size() - 1;
	        int parentIndex = (childIndex - 1) / 2;

	        while (childIndex > 0) {
	            if (heap.get(childIndex) > heap.get(parentIndex)) {
	                swap(childIndex, parentIndex);
	                childIndex = parentIndex;
	                parentIndex = (childIndex - 1) / 2;
	            } else {
	                return;
	            }
	        }
	    }

	    public int getMax() {
	        if (isEmpty()) {
	            return Integer.MIN_VALUE;
	        }
	        return heap.get(0);
	    }

	    public int removeMax() {
	        if (isEmpty()) {
	            return Integer.MIN_VALUE;
	        }

	        int maxElement = heap.get(0);

	        // Move the last element to the root position
	        heap.set(0, heap.get(heap.size() - 1));
	        heap.remove(heap.size() - 1);

	        int currentIndex = 0;
	        int leftChildIndex = 1;
	        int rightChildIndex = 2;

	        while (leftChildIndex < heap.size()) {
	            int maxIndex = currentIndex;

	            // Compare with the left child
	            if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
	                maxIndex = leftChildIndex;
	            }

	            // Compare with the right child
	            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
	                maxIndex = rightChildIndex;
	            }

	            // If the current element is already the maximum, break out of the loop
	            if (maxIndex == currentIndex) {
	                break;
	            }

	            // Swap the current element with the maximum element
	            swap(currentIndex, maxIndex);

	            // Update indices for the next iteration
	            currentIndex = maxIndex;
	            leftChildIndex = 2 * currentIndex + 1;
	            rightChildIndex = 2 * currentIndex + 2;
	        }

	        return maxElement;
	    }

	    private void swap(int i, int j) {
	        int temp = heap.get(i);
	        heap.set(i, heap.get(j));
	        heap.set(j, temp);
	    }
	}

