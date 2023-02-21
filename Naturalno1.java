
/* n natural numbers methods*/
import java.util.*;

class method {
  void add() {
    int i = 1, num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number:");
    num = sc.nextInt();
    while (i <= num) {
      System.out.print(" \t" + i);

      i++;
    }
  }
}

class Naturalno1 {
  public static void main(String args[]) {
    method m1 = new method();
    m1.add();
  }
}
