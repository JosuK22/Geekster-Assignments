package jan13;

class TreeNode {  

	int val;  
	TreeNode left, right;  
  

	public TreeNode(int i){  
		val = i;  
		right = left = null;  
	}  
}  

public class LevelOrderTraversal {
	TreeNode r;  
	    
	public LevelOrderTraversal() { r = null; }  
	   
		void displayLevelOrder(){  
			int ht = treeHeight(r);  
			int j;  
	  
			for (j = 1; j <= ht; j++)  {  
				displayCurrentLevel(r, j);  
			}  
		}	  
	  
		int treeHeight(TreeNode r)  {  
			if (r == null)  {
				
				return 0;  
			}  
			else{  
				int lh = treeHeight(r.left);  
				int rh = treeHeight(r.right);  
	  
	
				if (lh > rh){  
					return (lh + 1);  
				}  
				else{  
					return (rh + 1);  
				}  
			}  
		}  
	  
		void displayCurrentLevel(TreeNode r, int l)  {    
			if (r == null) {  
				return;  
			}  
	  
	
			if (l == 1) {  
				System.out.print(r.val + " ");  
			}  
	  
	 
			else if (l > 1){  
				displayCurrentLevel(r.left, l - 1);  
				displayCurrentLevel(r.right, l - 1);  
			}  
		}  
	   
		public static void main(String argvs[])  {  
	  
			LevelOrderTraversal  tree = new LevelOrderTraversal ();  
	  
	
			tree.r = new TreeNode(18);  
	  
	  
			tree.r.left = new TreeNode(22);  
			tree.r.right = new TreeNode(31);  
			tree.r.left.left = new TreeNode(63);  
			tree.r.left.right = new TreeNode(44);  
			tree.r.right.left = new TreeNode(46);  
			tree.r.right.right = new TreeNode(56);  
			tree.r.left.left.left = new TreeNode(12);  
			tree.r.left.left.right = new TreeNode(49);  
			tree.r.left.right.left = new TreeNode(88);  
			tree.r.left.right.right = new TreeNode(81);  
			tree.r.right.left.left = new TreeNode(29);  
			tree.r.right.left.right = new TreeNode(57);  
	  
	  
	  
			System.out.println("Level order traversal of binary tree is ");  
			tree.displayLevelOrder();  
		}  

}
