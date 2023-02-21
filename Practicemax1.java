
/*maximum of two numbers by using with arguments and without Return value*/
import java.util.*;

class maxi {
  void add(int a, int b) {
    
    if (a > b)
      System.out.println("a is max");
    else
      System.out.println("b is max");
  }
}

class Practicemax1 {
  public static void main(String args[]) {
    int x, y, max;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x value:");
    x = sc.nextInt();
    System.out.println("Enter y value:");
    y = sc.nextInt();

    maxi d = new maxi();
    d.add(x, y);
  }
}