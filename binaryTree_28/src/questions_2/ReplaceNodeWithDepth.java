package questions_2; 
//replace the node at depth k
import java.util.*;

public class ReplaceNodeWithDepth {
	
	public static void DepthAtNodesK (Node<Integer> root,int k) {
		
		if(root == null) {
			return;
		}
		
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		
		DepthAtNodesK(root.left, k-1);
		DepthAtNodesK(root.right, k-1);
	}
	
	
	
	public static Node<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
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
		
		Node<Integer> root = new Node<Integer>(rootData);
		Node<Integer> leftChild = takeInput(false,rootData,true);
		Node<Integer> rightChild = takeInput(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}

	public static void main(String[] args) {

		Node<Integer> root = takeInput(true, 0 , true);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter depth K: ");
		int k = sc.nextInt();
		
		DepthAtNodesK (root,k);
		
		
	}
}
