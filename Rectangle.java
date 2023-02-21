
/*Create a class that represents a rectangle, including the width and height. Write methods to calculate the area and perimeter of the rectangle.*/
import java.util.Scanner;

class area {
  void area(int l, int b) {
    int area, perimeter;
    area = l * b;
    perimeter = 2 * (l + b);
    System.out.println(" the area of rectangle is " + area);
    System.out.println(" the perimeter of rectangle is " + perimeter);
  }
}

class Rectangle {
  public static void main(String args[]) {
    int l, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter l and b :");
    l = sc.nextInt();
    b = sc.nextInt();
    area b1 = new area();
    b1.area(l, b);

  }
}