class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> new1= new ArrayList<>();
        traversal(new1,root);
    return new1;
    }
    public void traversal(ArrayList<Integer> new1,TreeNode root){
        if(root == null){
            return;
        }
        traversal(new1,root.left);
        traversal(new1,root.right);
        new1.add(root.val);
    }
}
