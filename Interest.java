import java.util.Scanner;

public class Interest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int p, t, r, si, ta;
    System.out.println("Enter p,t,r values:");
    p = sc.nextInt();
    t = sc.nextInt();
    r = sc.nextInt();

    si = (p * t * r) / 100;
    ta = si + p;
    System.out.println("Simple interest:" + si);

    System.out.println("Total amount:" + ta);

  }
}
