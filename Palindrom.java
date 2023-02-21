
/*palindrom number */
import java.util.*;

class Palindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int rev = 0;
    int rem = 0;
    System.out.println("enter n value:");
    n = sc.nextInt();
int temp=n;
    while (n > 0) { // 7<=10
      rem = n % 10; // 12345%10 =5 1234%10 =4
      rev = rev * 10 + rem;
      n = n / 10; // 12345/10 =1234.5 1234/10 =123.4
     
    }
if(temp==rev)
    System.out.println("palindrom");
    else
  System.out.println("not palindrom");
  }
}
