 public static int birthday(List<Integer> s, int d, int m) {
       int sum=0;
       int count=0;
        for(int i=0;i<m;i++){
            sum +=s.get(i);
        }
        if(sum==d && sum>0){
            count +=1;
        }
        for(int i=m;i<s.size();i++){
             sum +=s.get(i)-s.get(i-m);
             if( sum==d ){
                 count +=1;
             }
        }
        return count;
    }
