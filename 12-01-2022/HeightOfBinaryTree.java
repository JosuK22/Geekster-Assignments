package jan12;

public class HeightOfBinaryTree {
	static int height = -1;
	 
	static class Node{
	    int data;
	    Node left;
	    Node right;
	};
	 
	
	static Node newNode(int item){
	    Node temp = new Node();
	    temp.data = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	
	static int height(Node root){
	   if(root == null){
	   return 0;
	}
	else{
	   int left = height(root.left);
	   int right = height(root.right);
	   if(left > right){
	       return 1 + left;
	   }
	   else{
	       return 1 + right;
	   		}
		}
	}
	 

	
	 
	
	 
	public static void main(String []args)
	{
	     
	   
	    Node root = newNode(5);
	    root.left = newNode(10);
	    root.right = newNode(15);
	    root.left.left = newNode(20);
	    root.left.right = newNode(25);
	    root.left.right.right = newNode(45);
	    root.right.left = newNode(30);
	    root.right.right = newNode(35);
	   
	    System.out.println("Height: " + height(root));
	}
}
