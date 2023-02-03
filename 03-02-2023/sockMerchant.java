    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer> new1=new HashMap<>();
        for(int i:ar){
            new1.put(i,new1.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int i:new1.values()){
            sum +=i/2;
        }
        return sum;
    }
