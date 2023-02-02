class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map <Integer,Integer> new1=new HashMap<>();
          for(int i =0;i<nums.length;i++){
             int  tar=target-nums[i];
              if(new1.containsKey(tar)){
                  arr[0]=i;
                  arr[1]=new1.get(tar);
              }
              else{
                  new1.put(nums[i],i);
              }
          }
          return arr;
    }
}
