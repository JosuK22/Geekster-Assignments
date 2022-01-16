package jan13;

import java.util.*;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}

public class RightView {
	public static void printRightView(Node root)
    {
        
        if (root == null) {
            return;
        }
 
        
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        
        Node curr = null;
 
        
        while (!queue.isEmpty())
        {
            
            int size = queue.size();
            int i = 0;
 
           
            while (i++ < size)
            {
                curr = queue.poll();
 
                
                if (i == size) {
                    System.out.print(curr.key + " ");
                }
 
                if (curr.left != null) {
                    queue.add(curr.left);
                }
 
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(11);
        root.left = new Node(20);
        root.right = new Node(32);
        root.left.right = new Node(45);
        root.right.left = new Node(59);
        root.right.right = new Node(63);
        root.right.left.left = new Node(72);
        root.right.left.right = new Node(82);
 
        printRightView(root);
    }
}
