 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> arr=new ArrayList<>();
        
        for(String i:queries){
            int max=0;
            for(String j:strings){
                if(i.equals(j)){
                    max +=1;
                }
            }
            arr.add(max);
        }
       
    return arr;
    }

}
