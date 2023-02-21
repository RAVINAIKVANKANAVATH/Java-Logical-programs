/* Reverse number*/
import java.util.*;
class Reverse{
public static void main(String args[])
{
    
        int n=123;
        int rev=0;
        int rem=0;
        
        while(n > 0){     // 7<=10
            rem=n%10;    // 12345%10 =5    1234%10 =4
            rev=rev*10+rem;
            n=n/10;     //12345/10 =1234.5  1234/10 =123.4
        }
        
        System.out.println("The rev number is :"+rev);
    }
}