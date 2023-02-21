
/* n Factorial numbers 5*4*3*2*1*/
import java.util.*;

class Factorialm2 {
  public static void main(String args[]) {
    int num, fact = 1;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    num = sc.nextInt();

    while (num > 0) {
      fact = fact * num;
      num--;

    }
    System.out.println("factorial number is:" + fact);
  }
}