
/* write a program to print addition of two numbers from user*/
import java.util.*;

public class Addition {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b, sum;
    System.out.println("enter a value");
    a = sc.nextInt();
    System.out.println("enter b value");
    b = sc.nextInt();
    sum = (a + b);
    System.out.println("the addition of two values is:" + sum);

  }
}