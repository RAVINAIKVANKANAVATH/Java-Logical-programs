/*Write a Java Program to print Multiplication Table?
        n=5
 
   5  X  1 = 5
   5  X  2 = 10
   5  X  3 = 15
   __________
  __________
  __________
 
   5  X  10 = 50 */

/* check given number prime or not*/
import java.util.*;

class table {
  void add() {
    int i = 1, num;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    num = sc.nextInt();
    while (i <= 10) {
      // 5X 1=5
      System.out.println(num + " X " + i + "=" + i * num);
      i++;
    }
  }
}

class Mul1 {
  public static void main(String args[]) {

    table t1 = new table();
    t1.add();
  }
}
