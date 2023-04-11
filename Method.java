import java.util.*;

public class Method {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number:");
    int first = sc.nextInt();
    System.out.println("enter second number:");
    int second = sc.nextInt();
    // creating obj
    Method obj = new Method();
    int result = obj.sum(first, second);
    System.out.println("result:" + result);
    sc.close();
  }

  int sum(int first, int second) {
    return (first + second);
  }
}