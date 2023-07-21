package questions_4;

import java.util.*;

/*Diameter Of Binary Tree
Send Feedback
For a given Binary of type integer, find and return the ‘Diameter’.
Diameter of a Tree
The diameter of a tree can be defined as the maximum distance between two leaf nodes.
Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.
Example:
alt txt

The maximum distance can be seen between the leaf nodes 8 and 9. 
The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints an integer, representing the diameter of the tree.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
Sample Output 1:
9
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
5*/
import java.util.*;
public class DiameterOfBinaryTree_1 {
	
	public static int height(BinaryTreeNode<Integer> root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
    if (root == null) {
        return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int leftDiameter = diameterOfBinaryTree(root.left);
    int rightDiameter = diameterOfBinaryTree(root.right);

    int currentDiameter = leftHeight + rightHeight;

    return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter)) + 1;
}
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data: ");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of "+parentData);
			}else {
				System.out.println("Enter right child of "+parentData);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInput(false,rootData,true);
		BinaryTreeNode<Integer> rightChild = takeInput(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}


	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInput(true, 0 , true);
		int ans = diameterOfBinaryTree(root);
		System.out.println(ans);
	}
}
