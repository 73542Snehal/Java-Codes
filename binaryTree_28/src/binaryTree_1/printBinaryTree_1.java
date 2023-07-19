package binaryTree_1;

public class printBinaryTree_1 {
	
	public static void printTreeDetailed(Node<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + ":");
		
		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void printTree(Node<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		
		Node<Integer> root = new Node<Integer>(1);
		
		Node<Integer> rootLeft = new Node<Integer>(2);
		Node<Integer> rootRight = new Node<Integer>(3);
		
		root.left = rootLeft;
		root.right = rootRight;
		
		Node<Integer> twoRight = new Node<Integer>(4);
		Node<Integer> threeLeft = new Node<Integer>(5);
		
		rootLeft.right = twoRight;
		rootRight.left = threeLeft;
		
		//printTree(root);
		printTreeDetailed(root);
		
	}
}
