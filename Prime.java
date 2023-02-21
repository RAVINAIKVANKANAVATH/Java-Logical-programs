
/* check given number prime or not*/
import java.util.*;

class Prime {
  public static void main(String args[]) {
    int i = 1, num, c = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    num = sc.nextInt();

    while (i <= num) {
      if (num % i == 0) {
        c+= 1;
      }
      i++;
    }
    if (c == 2)

      System.out.println("it's prime number");
    else
      System.out.println("it's not prime number");
  }
}