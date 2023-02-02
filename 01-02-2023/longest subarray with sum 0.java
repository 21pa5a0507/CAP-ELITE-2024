
class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> new1=new HashMap<>();
        int max_value=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum==0){
                max_value=i+1;
            }
            else{
                if(!new1.containsKey(sum)){
                    new1.put(sum,i);
                }
                max_value=Math.max(max_value,i-new1.get(sum));
            }
        }
        return max_value;
    }
}
