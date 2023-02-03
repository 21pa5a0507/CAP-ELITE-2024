 public static long flippingBits(long n) {
        String random="";
        while(n>0){
            if(n%2==0){
            random +="1";
            }
            else{
                random +="0";
            }
            n=n/2;
        }
        while(random.length()!=32){
            random +="1";
        }
        long sum=0;
        int s=0;
        for(char i:random.toCharArray()){
            sum +=Math.pow(2,s)*(i-'0');
        s++;
        }

return sum;
    }
