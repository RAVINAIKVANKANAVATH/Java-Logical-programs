
/* armastrong or not*/
import java.util.*;

class Armastrongnot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 8208, original, rem, result = 0;

    original = n;
    String str = n + "";
    int length = str.length();

    while (n > 0) {
      rem = n % 10;
      result += Math.pow(rem, length);
      n = n / 10;
    }

    if (result == original)
      System.out.println(original + "is Armstrong number");
    else
      System.out.println(" is not an Armstrong number.");
  }
}
