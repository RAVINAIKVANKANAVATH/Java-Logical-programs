import java.util.*;

class Loopfor {
  public static void main(String args[]) {
    int i = 1, n;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    n = sc.nextInt();
    for (i = 1; i <= n; i++)
      System.out.println(i);
  }
}