
/* print even numbers*/
import java.util.*;

class Evenloop {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter any number:");
    n= sc.nextInt();
    int i=1;
    while(i<=n)
      {
        if(i%2==0){
          System.out.print("    "+i);
            }
   i++;
      }
  }
}
    
  