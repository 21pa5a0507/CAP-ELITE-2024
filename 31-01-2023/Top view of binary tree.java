class pair{
    int off;
    Node node;
    pair(int off,Node node){
        this.off=off;
        this.node=node;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Queue <pair> queue=new LinkedList<>();
        ArrayList <Integer> new1=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        pair curr=new pair(0,root);
        queue.offer(new pair(0,root));
        while(!queue.isEmpty()){
            int size=queue.size();
            curr=queue.remove();
            int off=curr.off;
            Node temp1=curr.node;
            if(map.get(off)==null){
                map.put(off,temp1.data);
            }
            if(temp1.left!=null){
                queue.offer(new pair(off-1,temp1.left));
            }
            if(temp1.right!=null){
                queue.offer(new pair(off+1,temp1.right));
            }
            
        }
        for(int i:map.values()){
            new1.add(i);
        }
        return new1;
    }
    
}
