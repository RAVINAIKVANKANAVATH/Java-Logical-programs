import java.util.*;

class Maxmin {
  public static void main(String args[]) {
    int i, min, max;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");

    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("enter the eliments in the array:");
    for (i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    min = arr[0];
    max = arr[0];
    for (i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("The maximum value of your array is:" + max);
    System.out.println("The minmum value of your array is:" + min);
  }
}
