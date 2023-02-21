import java.util.*;

class Armstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = 371, original, rem, result = 0;

    original = n;

    while (n > 0) {
      rem = n % 10;
      result += Math.pow(rem, 3);
      n = n / 10;
    }

    if (result == original)
      System.out.println(original + "is Armstrong number");
    else
      System.out.println(" is not an Armstrong number.");
  }
}
