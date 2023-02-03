 public static String pangrams(String s) {
        
        Set<Character> new1=new HashSet<>();
        for (char i: s.toLowerCase().toCharArray()){
            if(i != ' '){
                new1.add(i);
            }
        }
        return (new1.size()==26)?"pangram":"not pangram";
    }
