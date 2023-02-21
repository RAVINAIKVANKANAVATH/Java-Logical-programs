import java.util.*;

class overload {
  void overRide(int n, int m) {
    int dif = 0;
    dif = m - n;
    System.out.println("the difference of two numbers is:" + dif);
  }
}

class override extends overload {
  void overRide(int n, int m) {
    int sum = 0;
    sum = m + n;
    System.out.println("the sum of two numbers is:" + sum);
  }
}

class Overridingp {
  public static void main(String args[]) {
    int m, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value:");
    m = sc.nextInt();
    System.out.println("enter the value:");
    n = sc.nextInt();
    overload a = new overload();
    override b = new override();
    overload o;
    o = a;
    o.overRide(m, n);
    o = b;
    o.overRide(m, n);
  }
}