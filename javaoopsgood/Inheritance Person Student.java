import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person{
    private String fname;
    private String lname;
    public double avg;
    Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
}
class Student extends Person{
    private int id;
    Student(String fname,String lname,int id){
        super(fname,lname);
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void names(String x,String y){
        System.out.println("Name: "+y+", "+x);
    }
    public void ids(int a){
        System.out.println("ID: "+a);
    }
    public void sp(double r){
        avg=r;
    }
    public void calculate(){
       if(avg<=100 && avg>=90){
            System.out.println("Grade: O");
        }
        else if(avg<90 && avg>=80){
            System.out.println("Grade: E");      
        }
        else if(avg<80 && avg>=70){
            System.out.println("Grade: A");      
        }
        else if(avg<70 && avg>=55){
            System.out.println("Grade: P");      
        }
        else if(avg<55 && avg>=40){
            System.out.println("Grade: D");      
        }
        else{
            System.out.println("Grade: T");      
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        double sum=0;
        String[] si=in.nextLine().split(" ");
        String a=si[0];
        String b=si[1];
        int c=Integer.parseInt(si[2]);

        String d=in.nextLine();
        String[] marks = in.nextLine().split(" ");
       
            for(String mark:marks){
                sum=sum+Integer.parseInt(mark);
            }
        double q=sum/marks.length;
        Student p=new Student(b,a,c);
        p.names(a,b);
        p.ids(c);
        p.sp(q);
        p.calculate();
    }
}
