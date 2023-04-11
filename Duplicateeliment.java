
/*find diplicate element in the array */
import java.util.*;

class Duplicateeliment {
  public static void main(String args[]) {
    int i, j;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");
    
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("enter the eliments in the array:");
    for (i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    for (i = 0; i < arr.length; i++) {

      for (j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j])
          System.out.println("  "+ arr[j]);
      } 
      
}
}
}
