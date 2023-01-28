class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return Math.abs(helper(root.left)-helper(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int helper(TreeNode root1){
        if(root1 == null){
            return 0;
        }
        int left=helper(root1.left);
        int right=helper(root1.right);
        return Math.max(left,right)+1;
    }
}
