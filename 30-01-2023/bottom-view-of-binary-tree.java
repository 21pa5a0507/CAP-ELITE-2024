class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> new1=new ArrayList<>();
        Node curr=root;
        root.hd=0;
        Queue <Node> queue=new LinkedList<>();
        Map<Integer,Integer> tree=new TreeMap<>();
        queue.add(root);
        tree.put(root.hd,root.data);
          int temp=root.hd;
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i=1;i<=size;i++){
                curr=queue.poll();
                int hd=curr.hd;
                if(curr.left!=null){
                    curr.left.hd=hd-1;
                    tree.put(curr.left.hd,curr.left.data);
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    curr.right.hd=hd+1;
                    tree.put(curr.right.hd,curr.right.data);
                }
            }
        }
 for (int i:tree.values()) {
            new1.add(i); 
        }
        return new1;
    }
}
