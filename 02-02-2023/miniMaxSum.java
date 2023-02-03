 public static void miniMaxSum(List<Integer> arr) {
        long max=0;
        long min=Long.MAX_VALUE;
        long sum=0;
        for(int i:arr){
            sum+=i;
        }
        for(int i=0;i<arr.size();i++){
            if(sum-arr.get(i)>max){
                max=sum-arr.get(i);
            }
            if(sum-arr.get(i)<min){
                min=sum-arr.get(i);
            }
        }
        System.out.print(min+" ");
        System.out.print(max);
    }

}
