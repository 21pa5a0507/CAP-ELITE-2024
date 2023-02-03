  public static int pageCount(int n, int p) {
        int sum1=p/2;
        int sum=0;
        if(n%2==0){
            sum=(n-p+1)/2;
        }
        else{
            sum=(n-p)/2;
        }
        return Math.min(sum1,sum);
    }
