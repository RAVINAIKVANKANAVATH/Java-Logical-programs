import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int c, F;
    System.out.println("Enter F value:");
    c = sc.nextInt();
    F = sc.nextInt();

    c = (F - 32) * 0.56;

    System.out.println("print the celsius:" + c);

  }
}