public static void plusMinus(List<Integer> arr) {
        int postive=0,zeros=0,negitive=0;
        for(int i:arr){
            if(i>0){
                postive +=1;
            }
            else if(i==0){
             zeros +=1;
            }
            else{
                 negitive +=1;
            }
           
        }
         System.out.printf("%.6f\n",(float)postive/arr.size());
        System.out.printf("%.6f\n",(float)negitive/arr.size());
             System.out.printf("%.6f\n",(float)zeros/arr.size());
   
    }
