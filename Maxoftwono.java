p
/* VWrite a JAVAprogram to find maximum between two numbers.*/
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int x, y;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the x value:");
    x = sc.nextInt();
    System.out.println("enter the y value:");
    y = sc.nextInt();
    System.out.println("the maximum number is:" + Math.max(x, y));
  }
}
