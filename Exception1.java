//arthamatic exception
import java.util.*;
class Exception1
{
Scanner sc=new Scanner(System.in);
  
int a,b,c;
void division() {
  try{
    System.out.println("enter a, b values:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=a/b;
     System.out.println("the division is:"+c);
}
  catch (ArithmeticException e){
    System.out.println("the exception occuer:");
    System.out.println("the exception occuer:"+e);
    System.out.println("The Exception Occur:"+e.getMessage());
  }
}
public static void main(String args[]){
  Exception1 e1=new Exception1();
  e1.division();
}
  }

  
  
  
  
