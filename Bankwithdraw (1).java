/*Create a class that represents a bank account, including the account holder's name, account number, and current balance. Write methods to deposit and withdraw money, and to display the account balance.*/

import java.util.*;
class Account{
  String acc_nam;
  long acc_num;
  double acc_bal;
  double de_acc;
  double w_bal;
  Scanner sc=new Scanner(System.in);
  void bank(){
    System.out.println("enter your account name:");
    acc_nam=sc.next();
    System.out.println("enter your account number:");
    acc_num=sc.nextLong();
    System.out.println("enter your account balance:");
    acc_bal=sc.nextDouble();
  }
    
    
  
  void deposit(){
    System.out.println("enter ur deposite balance:");
    de_acc=sc.nextDouble();
    acc_bal+=de_acc;
     System.out.println(" ur deposite balance is "+de_acc);
    System.out.println("you  total account  amount is"+acc_bal);
  }
  void withDraw(){
    System.out.println("enter ur withdraw amount :");
    w_bal=sc.nextDouble();
    if(w_bal<acc_bal){
      System.out.println("you have withdraw amount of"+w_bal);
      acc_bal-=w_bal;
      System.out.println("you remaining  amount is"+acc_bal);
      
    }
    else{
      System.out.println("insufficient funds");
    }
  }
}

 


class Bankwithdraw{
  public static void main(String args[]){
    Account b1=new Account();
    b1.bank();
    b1.deposit();
    b1.withDraw();
  }
}