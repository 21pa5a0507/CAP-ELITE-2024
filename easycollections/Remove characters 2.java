import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Map <Character,Integer> new1=new HashMap<>();
        for(char i:s1.toCharArray()){
            if(new1.containsKey(i)){
                new1.put(i,new1.get(i)+1);
            }
            else{
                new1.put(i,1);
            }
        }
        for(char i:s2.toCharArray()){
             if(new1.containsKey(i)){
                new1.put(i,new1.get(i)-1);
            }
        }
        for(char i:s1.toCharArray()){
            if(new1.get(i)>0){
                System.out.print(i);
                new1.put(i,new1.get(i)-1);
            }
        }
    
    }
}
