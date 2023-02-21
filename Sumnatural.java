
/* n natural numbers sum*/
import java.util.*;

class Sumnatural {
  public static void main(String args[]) {
    int i = 1, num, sum = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    num = sc.nextInt();
    while (i <= num) {
      sum = sum + i;
      i++;
    
    }
    
    System.out.println("the sum of n natural number is:" + sum);
  }
}