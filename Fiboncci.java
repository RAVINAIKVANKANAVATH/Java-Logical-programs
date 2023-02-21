import java.util.*;

class Fiboncci {
  public static void main(String args[]) {
    int i, n, first = 1, second = 0, third = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    n = sc.nextInt();
    for (i = 1; i <= n; i++) {
      System.out.println("\t" + third);

      third = first + second;
      first = second;
      second = third;
    }
  }
}
