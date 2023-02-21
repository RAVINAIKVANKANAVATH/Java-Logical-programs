/*sum of array*/
import java.util.*;
class Sumarray
  {
    public static void main(String args[])
    {
      int i,n,sum=0;
 Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("The Elements in an Array is:");   
    for(i=0;i<n ;i++)
    {
      a[i]=sc.nextInt();
    }
  System.out.println("The Elements in an Array is:");  
     
     for(i=0;i<n;i++){
        System.out.print("\t"+a[i]); 
    }
      for(i=0;i<n;i++){
      sum=sum+a[i];
      }
  
   System.out.println("The Elements in an Array is:"+sum);
    }
  }
    


