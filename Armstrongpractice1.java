import java.util.*;

class Armstrongpractice1 {
  public static void main(String ags[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your input number");
    int n = sc.nextInt();
    int temp = n;
    int r, i;
    int sum = 0;
    while (n > 0) {

      r = n % 10;

      sum = sum + (r * r * r);
      n = n / 10;
    }

    if (temp == sum)
      System.out.println("it is a armstrong number:");
    else
      System.out.println(" it is not armstrong number:");

  }
}
