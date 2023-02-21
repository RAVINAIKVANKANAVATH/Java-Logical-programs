/*Find the frequencies of all duplicates elements in the array Input: arr[] = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 4 
5 –> 2 
6 –> 3
Input: arr[] = {4, 4, 5, 5, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 2 
5 –> 2*/
import java.util.*;
public class Duplicatecountarray {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i,n;
   int j;
   System.out.println("enter the array size:");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("enter the eliments:");
   for(i=0;i<n;i++)
     
       a[i]=sc.nextInt();
     
       for(j=0;j<n;j++);
       {
         for(i=j+1;i<n;i++){
           if(a[i]==a[j])
           {
             System.out.println(a[j]+"found at"+i);
             
           }
           }
         }
         
       }
     }
   
  