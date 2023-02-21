lkimport java.util.Scanner;

public class Swapping {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, t;
    System.out.println("Enter a,b values:");
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.println("BEFORE SWAPPING");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    t = a;
    a = b;
    b = t;
    System.out.println("AFTER SWAPPING");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }
}
