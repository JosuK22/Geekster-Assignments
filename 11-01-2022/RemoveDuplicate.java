package jan11;

public class RemoveDuplicate {
	
	    Node head;
	 
	    class Node{
	        int data;
	        Node next;
	        Node(int d) {
	          data = d; 
	          next = null; 
	        }
	    }

	    void removeDuplicates(){
	        Node temp = head,prev=head;

	        while (temp != null) {
	           
	           if(temp.data!=prev.data){
	            
	             prev.next=temp;
	             prev=temp;
	           }
	           
	            temp=temp.next;
	        }
	     
	      if(prev!=temp){
	            prev.next=null;
	        }
	    }
	                    
	
	    public void push(int data){
	        
	        Node new_node = new Node(data);
	        new_node.next = head;
	        
	        head = new_node;
	    }

	    
	     void printList()
	     {
	         Node temp = head;
	         while (temp != null)
	         {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	         }  
	         System.out.println();
	     }

	    
	    public static void main(String args[])
	    {
	    	RemoveDuplicate Sllist = new RemoveDuplicate();
	    	Sllist.push(5);
	    	Sllist.push(2);
	    	Sllist.push(2);
	    	Sllist.push(1);
	    	Sllist.push(1);
	    	Sllist.push(3);
	        
	        System.out.print("Initial List :  ");
	        
	        Sllist.printList();
	        
	        Sllist.removeDuplicates();
	        
	        System.out.println("List after removal of duplicate elements");
	        Sllist.printList();
	    }
	 

	}
