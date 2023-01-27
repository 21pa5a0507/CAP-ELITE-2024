class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null){
            return null;
        }
        if(p == root){
            return p;
        }
        if(q == root){
            return q;
        }
        TreeNode left1=lowestCommonAncestor(root.left,p,q);
        TreeNode right1=lowestCommonAncestor(root.right,p,q);
        if(left1 !=null && right1 !=null){
            return root;
        }
        if(left1 !=null){
            return left1;
        }
        if(right1 !=null){
            return right1;
        }
        return null;
    }
}
