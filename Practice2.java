
/*maximum of two numbers by using with arguments and with Return value*/
import java.util.*;

class big {
  int add(int x, int y) {
    if(x > y)
      return y;
    else
      return x;

  }
}

class Practice2 {
  public static void main(String args[]) {
    int a, b, max;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value:");
    a = sc.nextInt();

    System.out.println("Enter b value:");
    b = sc.nextInt();
int z;
    big d1 = new big();
    z=d1.add(a, b);
    System.out.println("a is max:" +z);
    

  }
}