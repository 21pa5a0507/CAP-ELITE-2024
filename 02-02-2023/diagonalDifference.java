 public static int diagonalDifference(List<List<Integer>> arr) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    sum1 +=arr.get(i).get(j);
                }
                if(j==arr.size()-i-1){
                    sum +=arr.get(i).get(j);
                }
            }
          
        }
          return Math.abs(sum1-sum);
    }
