public static String caesarCipher(String s, int k) {
        String res ="";
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                char i = (char) ((int)(ch+k-65)%26+65);
                res+= i;
            }
            else if(Character.isLowerCase(ch)){
                char i = (char) ((int)(ch+k-97)%26+97);
                res+= i;
            }
            else{
                res+=ch;
            }
        }
        return res;

    }

