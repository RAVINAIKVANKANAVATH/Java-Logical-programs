/*Write a Program for Swapping of Two number?
  */
import java.util.*;
class Swaptwo{
  public static void main(String args[]){
    int a,b,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value");
    a=sc.nextInt();
    System.out.println("Enter b value");
    b=sc.nextInt();
     System.out.println("before swapping a = "+a+ " and b= "+b);
    t=a;
    a=b;
    b=t;
     System.out.println("after  swapping a = "+a+ " and b= "+b);
    
  }
}