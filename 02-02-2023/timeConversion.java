public static String timeConversion(String s) {
        String last=s.substring(s.length()-2,s.length());
        String last1=s.substring(0,2);
        int some=0;
        String res="";
        if(last.equals("PM") && !last1.equals("12")){
            some=Integer.parseInt(last1)+12;
            res =Integer.toString(some)+s.substring(2,s.length()-2);
        }
        else if(last.equals("AM") && last1.equals("12")){
           res="00"+s.substring(2,s.length()-2);
        }
        else{
             res=s.substring(0,s.length()-2);
        }
        return res;
    }

}
