class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root ==  null){
            return true;
        }
    return helper(root.left,root.right);
}
public static boolean helper(TreeNode root1,TreeNode root2){
    if(root1==null && root2==null){
        return true;
    }
    if(root1==null){
        return false;
    }
    if(root2==null){
        return false;
    }
    boolean left=helper(root1.left,root2.right);
    boolean right=helper(root2.left,root1.right);
    return root1.val==root2.val && left && right;
}
}
