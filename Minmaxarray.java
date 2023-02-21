
/*min and max of array*/
import java.util.*;

class Minmaxarray {
  public static void main(String args[]) {
    int i, n, min, max;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("The Elements in an Array is:");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("The Elements in an Array is:");

    for (i = 0; i < n; i++) {
      System.out.print("\t" + a[i]);
    }
    min = max = a[0];
    for (i = 0; i < n; i++) {
      max = a[i];
    }
    if (a[i] < min) {
      min = a[i];
    }
    System.out.println("The minimum value of an Array is:" + min);
    System.out.println("The Maximum value of an Array is:" + max);
  }
}
