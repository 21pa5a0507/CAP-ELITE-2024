class Solution {
    public int countNodes(TreeNode root) {
        int res=0;
        if(root == null){
            return 0;
        }
        int left= countNodes(root.left);
        int right= countNodes(root.right);
        return left+right+1;
    }
}
