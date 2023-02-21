import java.util.*;

public class Empdetail {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee number");
    int eno = sc.nextInt();
    System.out.println("enter employee name");
    String ename = sc.next();
    System.out.println("enter employee salary");
    Float esal = sc.nextFloat();
    System.out.println("your employee number is " + eno);
    System.out.println("your employee name is " + ename);
    System.out.println("your employee salary is " + esal);
  }
}