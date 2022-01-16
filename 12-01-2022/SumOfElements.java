package jan12;

public class SumOfElements {

	static class Node { 
		int key; 
		Node left, right; 
	}


	static Node newNode(int key) {
		
		Node node = new Node(); 
		node.key = key; 
		node.left = node.right = null; 
		return (node); 
	} 


	static int addBT(Node root) {
		
		if (root == null) { 
			return 0;
		}
		return (root.key + addBT(root.left) + addBT(root.right)); 
} 


	public static void main(String args[]){
	
		Node root = newNode(21); 
		root.left = newNode(23); 
		root.right = newNode(36); 
		root.left.left = newNode(43); 
    	root.left.right = newNode(25); 
    	root.right.left = newNode(60); 
    	root.right.right = newNode(47); 
    	root.right.left.right = newNode(58); 

    	int sum = addBT(root); 
    	System.out.println("Sum of Node data is: " + sum); 
	}

}
