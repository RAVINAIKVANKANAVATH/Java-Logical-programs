
/*Linear Search or Sequential Search:
-------------------------------------------
 
             -----> n=5
             ------> read the elements to array                    i=0  i=1 i=2  i=3  i=4  i=5 
            -------> display array elements         --------->   10   20   30  40   50
            ------> enter search value                ----------> ser=80
 
         for(i=0;i<n;i++)
          {       30==30
              if(ser==a[i])
               {
                    System.out.println(ser+"is Found");
                    break;
                 
               }
           }
          if(i==n)
                {
                  System.out.println(ser+"is Not Found");
                }


*/
import java.util.*;

class Linearsearch {
  public static void main(String args[]) {
    int i, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("The Elements in an Array is:");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("The Elements in an Array is:");
    for (i = 0; i < n; i++)
  }

  }
}
