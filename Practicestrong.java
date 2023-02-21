import java.util.*;
class Practicestrong{
  public static void main(String ags[]){
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter your input number");
    int n=sc.nextInt();
    int temp=n;
    int r,i;
    int sum=0;
    while(n>0)
      {
        int f=1;
        r=n%10;
        for(i=1;i<=r;i++)
        {
          f=f*i;
        }
        sum=sum+f;
        n=n/10;
      }
    
    if(temp==sum)
       System.out.println("it is a strong number:");
    else
      System.out.println(" it is not strong number:");
    
  }
}