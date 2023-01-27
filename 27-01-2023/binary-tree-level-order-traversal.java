class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> new1 = new ArrayList<>();
         if(root==null){
            return new1;
        }
        

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List <Integer> new2 = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                if(curr.left != null){
                    queue.add(curr.left);
                    
                }
                if(curr.right != null){
                    queue.add(curr.right);
                   
                }
                new2.add(curr.val);
        
        
            }
            new1.add(new2);
        
        }
        return new1;
    }
}
