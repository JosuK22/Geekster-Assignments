package jan12;

public class PrintLeafNode {
	public static class BTreeNode{
        int data;
        BTreeNode left;
        BTreeNode right;
        BTreeNode(int data)
        {
            this.data=data;
        }
    }
 
    
    public static void printLeafNodes(BTreeNode node) {
 
        if(node==null)
            return;
 
        if(node.left == null && node.right == null) {
            System.out.printf("%d ",node.data);
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
 
    public static void main(String[] args)
    {
       
    	BTreeNode rootNode=createBinaryTree();
        System.out.println("Printing leaf nodes in binary tree :");
        printLeafNodes(rootNode);
    }
 
    public static BTreeNode createBinaryTree()
    {
 
    	BTreeNode rootNode =new BTreeNode(40);
    	BTreeNode node20=new BTreeNode(20);
    	BTreeNode node10=new BTreeNode(10);
    	BTreeNode node30=new BTreeNode(30);
    	BTreeNode node60=new BTreeNode(60);
    	BTreeNode node50=new BTreeNode(50);
    	BTreeNode node70=new BTreeNode(70);
 
    	BTreeNode node5=new BTreeNode(5);
    	BTreeNode node55=new BTreeNode(55);
 
        rootNode.left=node20;
        rootNode.right=node60;
 
        node20.left=node10;
        node20.right=node30;
 
        node60.left=node50;
        node60.right=node70;
 
        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }
}