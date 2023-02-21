/* sum of odd number*/
import java.util.*;
class Sumofodd
{
    public static void main(String[] args) {
      int n,sum,rem;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter n value:");
      n=sc.nextInt();
        int n=12345678;
        int sum=0;
        int rem=0;
        
        while(n > 0){     // 7<=10
            rem=n%10;    // 12345%10 =5    1234%10 =4
            if(rem%2!=0){
          sum=sum+rem;
            }
          n=n/10;     //12345/10 =1234.5  1234/10 =123.4
        }
        
        System.out.println("the sum of even numbers is :"+sum);
    }
}