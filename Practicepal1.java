import java.util.*;

class Practicepal1 {
  public static void main(String args[]) {
    int n;
    int rev = 0;
    int rem = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value:");
    n = sc.nextInt();
int temp=n;
    while (n > 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
      
    }
    if(temp==rev)
    System.out.println("it's palindrom");
    else
     System.out.println("it's not palindrom");
  }
}