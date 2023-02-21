import java.util.*;
class Test{
  public static void main(String args[]){
   int n,i,sum=0,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of the array:");
    n=sc.nextInt();
    int[]a=new int[n];
    System.out.println("enter the elements in the array:");
    for(i=0;i<n;i++){
       a[i]=sc.nextInt();
      
    }
    for(i=0;i<n;i++){
     
        if(a[i]%2==0)
        {
          count=0;
          count++;
          sum=sum+a[i];
        }
            if(count==2){
          break;
          }
   
   
    
  }
    System.out.println("the element sum is:"+sum);
  }
}