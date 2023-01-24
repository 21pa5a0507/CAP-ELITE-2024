class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> new1=new ArrayList<>();
      helper(new1,root);
    return new1;
    }
    void helper(ArrayList<Integer> new1,TreeNode node) {
         if(node == null){
           return ;
       }
       helper(new1,node.left);
       new1.add(node.val);
       helper(new1,node.right);
    }
}
