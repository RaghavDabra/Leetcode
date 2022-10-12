class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }
    
    public boolean isSame(TreeNode node1, TreeNode node2){
        if(node1 == null || node2 == null) 
               return node1 == null && node2 == null;
        return node1.val == node2.val && isSame(node1.left,node2.right) && isSame(node1.right, node2.left);
    }
}