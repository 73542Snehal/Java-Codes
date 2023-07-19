package genericTrees;
/*Sum of all nodes
Send Feedback
Given a generic tree, count and return the sum of all nodes present in the given tree.

For the above tree , total sum of all nodes is 10 + 30 + 50 + 25 + 5 + 45 + 56 + 34 = 225
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Sum of all nodes
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
190
Explananation
For 10, 3 children are there : 20, 30, 40
For 20. 2 children are there : 40, 50
For 30, 40, 40, 50 no child is there , so the answer for this is 10+20+30+40+40+50 = 190*/
public class Sumofallnodes {

	public static int sumOfAllNode(TreeNode<Integer> root){

		if (root == null)
            return 0;

		int sum = root.data;
		for(int i=0; i<root.children.size(); i++) {
			sum = sum + sumOfAllNode(root.children.get(i));		
		}
		
		return sum;
	}
	

	public static void main(String[] args){
		TreeNode<Integer> root= new TreeNode<> (4);
		TreeNode<Integer> node1= new TreeNode<> (2);
		TreeNode<Integer> node2= new TreeNode<> (3);
		TreeNode<Integer> node3= new TreeNode<> (1);
		TreeNode<Integer> node4= new TreeNode<> (5);
		TreeNode<Integer> node5= new TreeNode<> (6);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);

		node2.children.add(node4);
		node2.children.add(node5);
		
		int ans = sumOfAllNode(root);
		System.out.println(ans);

	}
}

