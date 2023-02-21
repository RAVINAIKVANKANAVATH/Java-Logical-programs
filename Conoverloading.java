import java.util.*;

class Conoverloading1 {
  int a, b;

  Conoverloading1() {
    System.out.println("Its Default Constructor");
  }

  Conoverloading1(int n) {
    System.out.println("The n value is:" + n);
  }

  Conoverloading1(int x, int y) {
    a = x;
    b = y;
  }

  void display() {
    System.out.println("The a value is:" + a);
    System.out.println("The b value is:" + b);
  }
}

class Conoverloading {
  public static void main(String args[]) {
    Conoverloading1 c2 = new Conoverloading1();
    Conoverloading1 c3 = new Conoverloading1(123);
    Conoverloading1 c1 = new Conoverloading1(100, 200);
    c1.display();
    c2.display();
    c3.display();
  }
}
// Type of the Argement
// No of Arguments
// order of arguments 
