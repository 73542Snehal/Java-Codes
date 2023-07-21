package questions;
/*Next larger element
Send Feedback
Given a generic tree and an integer n. 
Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
Return NULL if no node is present with value greater than n.


Input format :
Line 1 : Integer n
Line 2 : Elements in level order form separated by space (as per done in class) in the given below order
node_data, n(number of children of node), n children, and so on for every element 
Output format :
Node with value just greater than n.
Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0 
Representation of Input


Sample Output 1 :
20
Explanation
In the given tree, the value which is just greater than 18 is 20.
Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
30*/
public class Nextlargerelement {
	/*class Result {
	    int minDiff;
	    TreeNode<Integer> nextLarger;

	    Result(int minDiff, TreeNode<Integer> nextLarger) {
	        this.minDiff = minDiff;
	        this.nextLarger = nextLarger;
	    }
	}
	public class Solution {


		
		public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
			
		    if (root == null)
	            return null;

	        Result result = findNextLargerNodeHelper(n, root, Integer.MAX_VALUE, null);

	        return result.nextLarger;
	    }

	    private static Result findNextLargerNodeHelper(int n, TreeNode<Integer> root, int minDiff, TreeNode<Integer> nextLarger) {
	        if (root == null)
	            return new Result(minDiff, nextLarger);

	        if (root.data > n && root.data - n < minDiff) {
	            minDiff = root.data - n;
	            nextLarger = root;
	        }

	        for (TreeNode<Integer> child : root.children) {
	            Result childResult = findNextLargerNodeHelper(n, child, minDiff, nextLarger);
	            minDiff = childResult.minDiff;
	            nextLarger = childResult.nextLarger;
	        }

	        return new Result(minDiff, nextLarger);
	    }

		}*/

}
