public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(A);
        for(int i=0;i<A.size();i++){
            if(A.get(i)+B.get(i)<k){
                return  "NO";
            }
        }
        return "YES";

    }
