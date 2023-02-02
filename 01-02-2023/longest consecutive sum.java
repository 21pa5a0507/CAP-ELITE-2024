class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> se=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            se.add(nums[i]);
        }
        int max_length=0;
        for(int i=0;i<nums.length;i++){
             int len=1;
            if(!se.contains(nums[i]-1)){
               
                int curr =nums[i];
                while(se.contains(curr+1)){
                    curr=curr+1;
                    len++;
                }
            }
            if(len>max_length){
                max_length=len;
            }
        }
        return max_length;
    }
}
