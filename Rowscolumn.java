
/*Rowscolumn
 1,1 1,2
   *   *   *  *  *
   *   *   *  *  *
   *   *   *  *  *
   *   *   *  *  *
   *   *   *  *  *
 
int i,j; 
              5<=5
  for(i=1;i<=5;i++)
  {             2<=5
     for(j=1;j<=5;j++)
     {
         System.out.print("*");
      }
     System.out.println();
   } 
  */
import java.util.*;

class Rowscolumn {
  public static void main(String args[]) {
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}