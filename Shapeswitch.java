
/*Create a program that uses a switch case statement to determine the area of a shape based on the shape's name in JAVA.*/
import java.util.Scanner;

class Shapeswitch {
  public static void main(String args[]) {
    int l, b, rectangle, square;
    String shape;

    double pi = 3.14;
    double area, circle, triangle;
    float r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter l values:");
    l = sc.nextInt();
    System.out.println("Enter b values:");
    b = sc.nextInt();

    System.out.println("Enter shape:");

    shape = sc.next();
    System.out.println("Enter radious:");

    r = sc.nextInt();

    square = l * l;
    rectangle = l * b;
    circle = 3.14 * r * r;
    triangle = 0.5 * b * l;

    switch (shape) {
      case "square":
        l = sc.nextInt();
        System.out.println("area of the Sqare is:" + square);
        break;

      case "rectangle":
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("area of the Sqare is:" + rectangle);
        break;
      case "circle":
        r = sc.nextInt();

        System.out.println("area of the Sqare is:" + circle);

        break;
      case "triangle":
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("area of the Sqare is:" + triangle);

        break;
      default:
        System.out.println("wrong choice");
    }

  }
}
