/*Even or Odd by using switch case*/
import java.util.*;
class Evenswitch
  {
public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter n value");
      n=sc.nextInt();
      switch(n%2)
      {
    case(0):
System.out.println("it is Even number:");
          break;

     case(1):
System.out.println("it is odd number:");
          break;
        default:
          System.out.println("it is invalid:");
          

        
      } 
    }
  }