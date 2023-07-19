package BSTClass;
//all function time complexity is O(h)
public class BST {


	private BinaryTreeNode<Integer> root;
	private int size;


	private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
		if(node == null) {
			return false;
		}

		if(node.data == x) {
			return true;
		}

		if(x < node.data) {
			return isPresentHelper(node.left,x);
		}else {
			return isPresentHelper(node.right,x);
		}
	}

	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}


	public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
		if(node==null){
			BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		if(x>=node.data){
			node.right= insertHelper(node.right,x);
		}
		else{
			node.left= insertHelper(node.left,x);
		}
		return node;
	}

	public void insert(int x) {
		root = insertHelper(root,x);
		size++;
	}

	public int size() {
		return size;
	}


	private static void printTreeHelper(BinaryTreeNode<Integer> node) {

		 if(node == null){
	            return;
	        }
	        System.out.print(node.data+":");
	        if(node.left != null){
	            System.out.print("L"+node.left.data+", ");
	            }
	        if(node.right != null){
	            System.out.print("R"+node.right.data);
	            }
	        System.out.println();

	        printTreeHelper(node.left);
	        printTreeHelper(node.right);

	}

	public void printTree() {
		printTreeHelper(root);
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
	    if (root == null) {
	        return Integer.MAX_VALUE;
	    }

	    int minLeft = minimum(root.left);
	    int minRight = minimum(root.right);

	    int minValue = Math.min(minLeft, minRight);
	    if (root.data < minValue) {
	        return root.data;
	    }
	    return minValue;
	}

	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
	    if (root == null) {
	        return new BSTDeleteReturn(null, false);
	    }

	    if (root.data < x) {
	        BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
	        root.right = outputRight.root;
	        outputRight.root = root;
	        return outputRight;
	    } else if (root.data > x) {
	        BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
	        root.left = outputLeft.root;
	        outputLeft.root = root;
	        return outputLeft;
	    }

	    // 0 children
	    if (root.left == null && root.right == null) {
	        return new BSTDeleteReturn(null, true);
	    }

	    // Only left child
	    if (root.left != null && root.right == null) {
	        return new BSTDeleteReturn(root.left, true);
	    }

	    // Only right child
	    if (root.left == null && root.right != null) {
	        return new BSTDeleteReturn(root.right, true);
	    }

	    // Both children present
	    int rightMin = minimum(root.right);
	    root.data = rightMin;
	    BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
	    root.right = outputRight.root;
	    return new BSTDeleteReturn(root, true);
	}

	public boolean deleteData(int x) {
	    BSTDeleteReturn output = deleteDataHelper(root, x);
	    root = output.root;
	    if (output.deleted) {
	        size--;
	    }
	    return output.deleted;
	}


}
