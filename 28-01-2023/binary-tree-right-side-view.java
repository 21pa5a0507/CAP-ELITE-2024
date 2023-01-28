class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        TreeNode curr=root;
        List<Integer> new1=new ArrayList<>();
        if(root==null){
            return new1;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
           
            int size=queue.size();
            for (int i=1;i<=size;i++){
                 curr=queue.poll();
                if(i==size){
                    new1.add(curr.val);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        } 
        return new1;
    }
}
