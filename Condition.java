import java.util.Scanner;

class Condition {
  public static void main(String args[]) {
    int a, b;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value1");
    a = sc.nextInt();

    System.out.println("Enter the value2");
    b = sc.nextInt();

    if (a > b) {

      System.out.println("Enter a is big:");

    }

    else {
      System.out.println("Enter b is big:");

    }

  }

}