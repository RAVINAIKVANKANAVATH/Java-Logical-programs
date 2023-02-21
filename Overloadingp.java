import java.util.*;

class overload {
  void overload(int n) {
    int fact = 1;
    for (int i = n; i >= 1; i--) {
      fact = fact * i;
    }
    System.out.println("your factorial is:" + fact);
  }

  void overload(int n, int m) {
    int sum = 0;
    sum = n + m;
    System.out.println("sum of two numbers is:" + sum);
  }
}

class Overloadingp {
  public static void main(String args[]) {
    int n, m;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number:");
    n = sc.nextInt();
    System.out.println("enter your number:");
    m = sc.nextInt();
    overload a = new overload();
    a.overload(n);
    a.overload(n, m);
  }
}