import java.util.*;

class Armstrongpractice2 {
  public static void main(String ags[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your input number");
    int n = sc.nextInt();
    int temp = n;
    int rem;
    double power = 0;
    double sum = 0;
    String s = "" + n;
    while (n > 0) {

      rem = n % 10;
      power = Math.pow(rem, s.length());
      sum = sum + power;
      n = n / 10;
    }

    if (temp == sum)
      System.out.println("it is a armstrong number:");
    else
      System.out.println(" it is not armstrong number:");

  }
}
