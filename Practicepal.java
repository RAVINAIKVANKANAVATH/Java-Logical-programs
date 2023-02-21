import java.util.*;

class Practicepal {
  public static void main(String args[]) {
    int n;
    int rev = 0;
    int rem = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value:");
    n = sc.nextInt();

    while (n > 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    System.out.println("the reverse number is:" + rev);
  }
}