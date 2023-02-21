/*1  2   3   4   5   
   1  2   3   4   5
   1  2   3   4   5
   1  2   3   4   5
   1  2   3   4   5
  */

import java.util.*;

class Npattern2 {
  public static void main(String args[]) {
    int i, n = 5, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        System.out.print(i + "  ");
      }
      System.out.println();
    }

  }
}