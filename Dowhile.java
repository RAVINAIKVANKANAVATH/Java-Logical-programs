import java.util.*;
class Dowhile{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n,fact=1;
    do
      {
        fact=fact*n;
       
        n--;
      }while(n>2);
    System.out.println("the factorial of "+ temp+" is: "+fact);
  }
}