import java.io.*;
import java.util.*;
class IntegerList{
    private int[] list;
    private int elementIndex=0;
    
    public IntegerList(int value){
        this.list=new int[value];
    }
    
    public void add(int value1){
        if(elementIndex>list.length-1){
            System.out.println("can't add, list is full");
        }
        else{
            list[elementIndex]=value1;
            elementIndex +=1;
        }
    
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.length;i++)
        {
            sb.append(i+" : "+list[i]);
            
            if(i!=list.length-1)
            {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
}
public class Solution {

       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        System.out.println(nums);
    }
}
