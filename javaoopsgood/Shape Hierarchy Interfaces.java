import java.io.*;
import java.util.*;
interface Shape{
    double area();
    double perimeter();
}

  class Rectangle implements Shape{
    private double l;
    private double b;
    public Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}
class Square implements Shape{
    private double s;
    public Square(double s){
        this.s =s;
    }
    public double area(){
        return s*s;
    }
    public double perimeter(){
        return 4*s;
    }
}
class Circle implements Shape{
    private double r;
    public Circle(double r){
        this.r =r;
    }
    public double area(){
        return (22.0/7)*r*r;
    }
    public double perimeter(){
        return 2*(22.0/7)*r;
    }
}
    class Sop{
        static void ComputeParams(Shape i){
            System.out.printf("%.2f",i.area());
            System.out.print(" ");
            System.out.printf("%.2f",i.perimeter());
            System.out.println("");
        } 
    }
    
public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<Shape> list=new ArrayList<>();
        Shape S;
        for(int i=0;i<n;i++){
            String[] b=sc.nextLine().split(" ");
            if(b[0].equals("R")){
                list.add(new Rectangle(Integer.parseInt(b[1]),Integer.parseInt(b[2])));
            }
            else if(b[0].equals("C")){
                list.add(new Circle(Integer.parseInt(b[1])));
            }
            else if(b[0].equals("S")){
                list.add(new Square(Integer.parseInt(b[1])));
            }
            Sop.ComputeParams(list.get(i));
        }
        
    }
}
