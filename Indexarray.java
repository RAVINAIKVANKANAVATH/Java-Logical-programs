import java.util.*;

class Indexarray {
  public static void main(String args[]) {
    int i;
    int[] arr1 = new int[3];
    int a[] = { 10, 20, 30, 40 };
    a[0] = 0;

    // a[3]=0;

    for (int j = 1; j < a.length; j++) {
      arr1[j - 1] = a[j];
    }
    for (i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);

    }
  }
}