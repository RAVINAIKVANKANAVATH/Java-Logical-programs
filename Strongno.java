
/*Strong number */
import java.util.*;

class Strongno {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    for (int j = 1; j <= 1000; j++) {
      int n = j;
      int orginal = n;
      int sum = 0;
      int rem = 0;
      int fact = 0;

      while (n > 0) {
        rem = n % 10;
        fact = 1;
        for (int i = 1; i <= rem; i++) {
          fact = fact * i;
        }
        sum = sum + fact;
        n = n / 10;
      }

      if (orginal == sum) {
        System.out.println("The given number is strong number" + orginal);
      }

    }

  }
}