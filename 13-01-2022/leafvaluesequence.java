

import java.util.*;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();

        helper(root1,r1);
        helper(root2,r2);
        return r1.equals(r2);
    }
    private void helper(TreeNode root,ArrayList<Integer> leafNodes){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leafNodes.add(root.val);
        }
        
        helper(root.left,leafNodes);
        helper(root.right,leafNodes);
        
    }
}

