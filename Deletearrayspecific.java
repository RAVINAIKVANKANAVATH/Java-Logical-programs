
/*Write a JAVAprogram to delete an element from an array at specified position.*/
import java.util.*;

class Deletearrayspecific {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("ARRAY ELEMENTS BEFORE DELETION");
    for (int i = 0; i < n; i++)

    {
      System.out.println(a[i] + " ");
    }
    System.out.println("Enter the position where the element should be inserted");
    int pos = sc.nextInt();
    for (int i = pos; i < n; i++) {
      a[i] = a[i + 1];
    }
    --n;
    System.out.println("ARRAY ELEMENTS AFTER DELETION");
    for (int i = 0; i < n; i++) {
      System.out.println(a[i] + " ");
    }
  }

}
