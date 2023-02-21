/* n Factorial numbers sum*/
import java.util.*;

class Factorial {
  public static void main(String args[]) {
    int i = 1, num, fact = 1;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    num = sc.nextInt();
    while (i <= num) {
      fact = fact * i;
      i++;
    }
    System.out.println("factorial number is:" + fact);
  }
}