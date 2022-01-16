package jan11;

/* 
 https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

public class IntersectionofTwoLL {
	static Node h1 = null;
	static Node h2 = null;
	 
	
	static class Node{
	    int data;
	    Node next;
	 
	    
	    Node(int x)
	    {
	        data = x;
	        next = null;
	    }
	}
	 
	static Node intersectingNode(Node Sl1, Node Sl2){
	     
	    
	    Node a = Sl1;
	 
	    while (a != null){
	    	
	        a.data *= -1;
	 
	        a = a.next;
	    }
	 
	    Node b = Sl2;
	 
	    while (b != null){
	         
	        if (b.data < 0)
	            break;
	 
	        b = b.next;
	    }
	    return b;
	}
	 
	static void LinkedList(){
	     
	    
	    h1 = new Node(3);
	    h1.next = new Node(6);
	    h1.next.next = new Node(9);
	    h1.next.next.next = new Node(15);
	    h1.next.next.next.next = new Node(30);
	 
	    
	    h2 = new Node(10);
	    h2.next = h1.next.next.next;
	 
	    return;
	}
	 
	
	public static void main(String[] args)
	{
		LinkedList();
	    System.out.println(Math.abs(intersectingNode(h1, h2).data));
	}
}
