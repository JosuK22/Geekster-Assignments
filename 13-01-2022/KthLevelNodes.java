package jan13;

import java.util.*;


public class KthLevelNodes {
	static class node {
	    int data;
	    node left;
	    node right;
    };


    static node Node(int data){
	    node temp = new node();
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	    return temp;
    };


    static void Kthlevelnodes(node root,int k){


	    if (root == null)
		    return;
		
	    Queue<node> que = new LinkedList<node>();
	    que.add(root);

	    HashSet<Integer> s = new HashSet<Integer>();

	    int level = 0;
	    int flag = 0;

	    while (!que.isEmpty()) {
	    
		    int size = que.size();

	
		    while (size-- > 0) {
			    node tem = que.peek();
			    que.remove();

		
			    if (level == k) {

				
				    flag = 1;

				
				    s.add(tem.data);
			    }
			    else {

			
				    if (tem.left!=null)
					    que.add(tem.left);

				    if (tem.right!=null)
					    que.add(tem.right);
			    }
		}

		
		
		level++;

	
		if (flag == 1)
			break;
	    }
	    for (int it : s) {
		    System.out.print(it+ " ");
	    }
	    System.out.println();
    }


    public static void main(String[] args){
	    node root = new node();

	
	    root = Node(60);
	    root.left = Node(20);
	    root.right = Node(30);
	    root.left.left = Node(80);
	    root.left.right = Node(10);
	    root.right.left = Node(40);
	    int level = 1;
	    Kthlevelnodes(root, level);

    }
	
}
