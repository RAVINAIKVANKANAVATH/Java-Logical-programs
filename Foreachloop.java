
//to determine foreach loop on array
import java.util.*;

class Foreachloop {
  public static void main(String args[]) {
    int arr[];
    arr = new int[3];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    for (int var : arr) {
      System.out.println(var);
    }

  }
}