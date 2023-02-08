import java.io.*;
import java.util.*;
class BankAccount{
    String name;
    int accountNo;
    int balance;
    public BankAccount(String name,int accountno){
        this.name=name;  
        this.accountNo=accountno;
    }
    
    public void initializeNumber(int number){
        accountNo=number;
    }
    public void  deposit(int amt){
        balance +=amt;
    }
    public void withdraw(int mat){
        if(balance-mat<0){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
            balance -=mat;
        }
    }
    public String getName(){
        return name;
    }
    public int getaccountNo(){
        return accountNo;
    }
    public int getbalance(){
        return balance;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setAccountno(int accountNo1){
        this.accountNo=accountNo1;
    }
    public void setbalance(int bal){
        this.balance=balance;
    }
    public void display(){
        System.out.println(accountNo+" "+name+" "+balance);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         int numt1=Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();
        int numt=Integer.parseInt(sc.nextLine());
        BankAccount a=new BankAccount(name,numt1);
        for(int i=0;i<numt;i++){
            String[] inp=sc.nextLine().split(" ");
            if(inp[0].equals("Deposit")){
                a.deposit(Integer.parseInt(inp[1]));
            }
              if(inp[0].equals("Withdraw")){
                a.withdraw(Integer.parseInt(inp[1]));
            }
             if(inp[0].equals("Display")){
                a.display();
            }     
    } 
                   }
                   }
                   
