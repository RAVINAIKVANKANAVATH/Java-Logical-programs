
import java.util.*;

class construct1 {
  int a, b;

  construct1(int x, int y) {
    a = x;
    b = y;
  }

  void display() {
    System.out.println("the value of a is:" + a);
    System.out.println("the value of b is:" + b);
  }
}

class Construct {
  public static void main(String args[]) {
    construct1 c1 = new construct1(100, 200);
    c1.display();

  }
}