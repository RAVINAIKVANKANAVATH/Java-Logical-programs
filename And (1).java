/*check equel*/
import java.util.Scanner;

class And {
  public static void main(String args[]) {
    int a, b, c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value a");
    a = sc.nextInt();

    System.out.println("Enter the value b");
    b = sc.nextInt();

    System.out.println("Enter the value c");
    c = sc.nextInt();

    if (a == b && b == c && c == a) {

      System.out.println("All variabls are equal");

    }

    else {
      System.out.println("All variabls not equall:");

    }

  }

}