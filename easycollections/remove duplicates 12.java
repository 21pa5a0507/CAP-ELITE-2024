import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String new1=sc.next();
        Map <Character,Integer> s1=new HashMap<>();
        for(char i:new1.toCharArray()){
            if(!s1.containsKey(i)){
                System.out.print(i);
            s1.put(i,0);
            }
        }
        
    }
}
