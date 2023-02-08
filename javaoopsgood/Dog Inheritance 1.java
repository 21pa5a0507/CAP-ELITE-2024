import java.io.*;
import java.util.*;
class Dog{
     String name;
    public String getName(){
        return name;
    }
}
class Greyhound extends Dog{
    private String color;
    private int weight;
    public Greyhound(String name,String color,int weight){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        System.out.print(name+" is "+color+" in color and his weight is "+weight+"Kg");
        return "";
    }
}





public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String color = in.nextLine();
        int weight = in.nextInt();
        Greyhound pup = new Greyhound(name, color, weight);
        System.out.println(pup.getName());
        System.out.println(pup.getColor());
        System.out.println(pup.getWeight());
        System.out.println(pup);
        System.out.println("Superclass:"+pup.getClass().getSuperclass().getName());
        
    }
}
