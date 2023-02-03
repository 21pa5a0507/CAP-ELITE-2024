
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        System.out.print(arr);
        int max_value=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-k+1;i++){
            int max1=arr.get(i+k-1);
            int min1=arr.get(i);
            System.out.print(max1-min1+" ");
        if((max1-min1)<max_value){
            max_value=(max1-min1);
        }
        }
        return max_value;
    }
