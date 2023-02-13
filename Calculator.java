/* Switch case calculator*/
import java.util.Scanner;
class Calculator
  {
    public static void main(String args[])
    {
      int a=0,b=0,c,ch;
      float d,r;
      Scanner sc=new Scanner(System.in);
      System.out.println("CALCULATOR");
      System.out.println("------------");
      System.out.println("[1].ADDITION");
      System.out.println("[2].SUBTRACTION");
      System.out.println("[3].MULTIPLICATION");
      System.out.println("[4].DIVISION");
      System.out.println("[5].REMAINDER");
      System.out.println("ENTER YOUR CHOICE :");
      ch=sc.nextInt();
      
      if(ch<6){
      System.out.println("enter a,b values :");
      a=sc.nextInt();
      b=sc.nextInt();
      
      }
      switch(ch){
        case 1:
          c=a+b;
          System.out.println("the addition of two values is :"+c);
          break;
        case 2:
          c=a-b;
          System.out.println("the subtraction of two values is :"+c);
          break;
          case 3:
          c=a*b;
          System.out.println("the multiplication of two values is :"+c);
          break;
          case 4:
          d=a/b;
          System.out.println("the division of two values is :"+d);
          break;
          case 5:
          r=a%b;
          System.out.println("the remainder of two values is :"+r);
          break;
        default:
          System.out.println("wrong choice");
          
      }
    }
  }