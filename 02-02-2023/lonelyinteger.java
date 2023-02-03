 public static int lonelyinteger(List<Integer> a) {
        Map<Integer,Integer> new1=new HashMap<>();
        for(int i:a){
            if(new1.containsKey(i)){
                new1.put(i,new1.get(i)+1);
            }
            else{
                new1.put(i,1);
            }
        }
        int go=0;
        for(int i:new1.keySet()){
            if(new1.get(i)==1){
                go=i;
                break;
            }
        }
        return go;        
    }
