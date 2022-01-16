package jan11;

public class KthElementSingleTraversal {
	Node head; 
	 
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
        
    }
    void KthElement(int n){
    	
        Node pointer1 = head;
        Node pointer2 = head;
 
        int count = 0;
        if (head != null){
        	
            while (count < n){
            	
                if (pointer2 == null){
                	
                    System.out.println(n+ " is greater than the no "+ " of nodes in the list");
                    return;
                }
                
                pointer2 = pointer2.next;
                count++;
            }
 
            if(pointer2 == null){
              
              if(head != null)
                System.out.println("Node  " + n +" from last is " +head.data);
            }
            else{
                   
              while (pointer2 != null){
            	  
                  pointer1 = pointer1.next;
                  pointer2 = pointer2.next;
              }
              System.out.println("Node " + n + " from last is " +pointer1.data);
            }
        }
    }
    public void push(int data){
      
        Node new_node = new Node(data);
       
        new_node.next = head;
 
        
        head = new_node;
    }
 
    public static void main(String[] args){
    	
    	KthElementSingleTraversal Slist = new KthElementSingleTraversal();
        Slist.push(1);
        Slist.push(4);
        Slist.push(2);
        Slist.push(5);
        Slist.push(0);
        Slist.push(9);
        Slist.push(3);
 
        Slist.KthElement(4);
    }
}
