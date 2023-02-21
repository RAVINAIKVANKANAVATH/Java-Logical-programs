
import java.util.Scanner;

class First {
  public static void main(String args[]);
  {
    int a,b;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Integer value1 :");
    a=sc.nextInt();
    System.out.println("enter Integer value2 :");
    b=sc.nextInt();
    System.out.println("the given a value is:" +a);
    System.out.println("the given b value is:" +b);
    System.out.println("the given addition valueis:" +(a + b));
  }
}